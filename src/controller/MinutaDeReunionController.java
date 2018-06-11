/**
 * MinutaDeReunionController.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextArea;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import model.dao.AcademiaDAO;
import model.dao.MinutaDeAcademiaDAO;
import model.pojos.Academia;
import model.pojos.Maestro;
import model.pojos.MinutaDeAcademia;
import model.pojos.Participante;
import model.pojos.Periodo;
import model.pojos.Reunion;

/**
 * @author Manolo Pérez
 * @since Tue Jun 05 2018
 * @version 0.1
 */

public class MinutaDeReunionController implements Initializable {

  @FXML
  private StackPane rootPane;

  @FXML
  private AnchorPane panelTopBar;

  @FXML
  private JFXButton btnHamburger;

  @FXML
  private JFXComboBox<Reunion> cmbReunion;

  @FXML
  private JFXButton btnEnviar;

  @FXML
  private JFXButton btnGuardar;

  @FXML
  private JFXTextArea txtObjetivo;

  @FXML
  private JFXTextArea txtConclusiones;

  @FXML
  private JFXTextArea txtTemas;

  @FXML
  private JFXListView<AnchorPane> listParticipantes;

  private List<Maestro> participantes;

  private List<Maestro> asistentes = new ArrayList<Maestro>();

  private final Periodo periodoActual = new Periodo(new Date(2018, 1, 1), new Date(2018, 8, 1));

  private Academia academiaActual = AcademiaDAO.obtenerAcademiaId(1);

  private List<Reunion> reunionesPeriodo;

  private Maestro coordinador;

  @FXML
  public void clickEnviar(ActionEvent event) {
    ObservableList<AnchorPane> listaParticipantes = listParticipantes.getItems();
    int contador = 0;
    for (AnchorPane part : listaParticipantes) {
      for (Node node : part.getChildren()) {
        if ("Asistiendo".equals(node.getAccessibleText())) {
          if (((JFXCheckBox) node).isSelected()) {
            asistentes.add(participantes.get(contador));
            System.out.println("Vino: " + participantes.get(contador).getNombre());
          }
        }
      }
      contador++;
    }
    if (!camposInvalidos()) {
      if (!asistentes.isEmpty()) {
        Integer idReunion = cmbReunion.getSelectionModel().getSelectedItem().getIdReunion();
        java.util.Date fecha = new java.util.Date();
        java.sql.Date sDate = new java.sql.Date(fecha.getTime());
        MinutaDeAcademia minuta = new MinutaDeAcademia(idReunion, sDate, "hora", txtObjetivo.getText(),
            txtTemas.getText(), txtConclusiones.getText());
        if (MinutaDeAcademiaDAO.guardarMinuta(minuta)) {
          for (Maestro asistente : asistentes) {
            MinutaDeAcademiaDAO.guardarParticipante(new Participante(idReunion, asistente.getIdUsuarioAcademico()));
          }
          mensaje("Enviado", "Minuta almacenada en la Base de Datos");
        } else {
          mensaje("Error", "Error en la conexión a la Base de Datos");
        }
      } else {
        mensaje("Sin Asistentes", "No se puede registrar una reunión sin participantes");
      }
    } else {
      mensaje("Incompleto", "Se deben llenar todos los campos");
    }
  }

  @FXML
  public void clickGuardar(ActionEvent event) {
    ObservableList<AnchorPane> listaParticipantes = listParticipantes.getItems();
    for (AnchorPane part : listaParticipantes) {
      for (Node node : part.getChildren()) {
        if ("Asistiendo".equals(node.getAccessibleText())) {
          System.out.println(((JFXCheckBox) node).isSelected());
        }
      }
    }

  }

  @FXML
  public void clickHamburger(ActionEvent event) {
    try {
      StackPane vistaPrincipal;
      vistaPrincipal = FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"));
      Scene newScene = new Scene(vistaPrincipal);
      Stage curStage = (Stage) rootPane.getScene().getWindow();
      curStage.setScene(newScene);
      curStage.show();
    } catch (IOException e) {
      System.out.println("No se encontró: " + e);
    }
  }

  public boolean camposInvalidos() {
    System.out.println("Comprobandooou");
    return txtConclusiones.getText().isEmpty() || txtObjetivo.getText().isEmpty() || txtTemas.getText().isEmpty();
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    cargarReuniones();
    cargarParticipantes();
  }

  /**
   * Inicialización del comboBox con las reuniones
   */
  public void cargarReuniones() {
    try {
      reunionesPeriodo = AcademiaDAO.obtenerReuniones(academiaActual);
      System.out.println(reunionesPeriodo.size());
    } catch (Exception e) {
      mensaje("Error", "Error en la conexión a la Base de Datos");
    }
    cmbReunion.getItems().addAll(reunionesPeriodo);
    cmbReunion.setConverter(new StringConverter<Reunion>() {

      @Override
      public String toString(Reunion reunion) {
        if (reunion == null) {
          return "";
        } else {
          return reunion.getNombre();
        }
      }

      @Override
      public Reunion fromString(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
      }
      
    });
  }

  public void cargarParticipantes() {
    listParticipantes.getItems().clear();
    try {
      participantes = AcademiaDAO.obtenerMaestros(academiaActual.getIdAcademia());
    } catch (Exception e) {
      mensaje("Error", "Error en la conexión a la Base de Datos");
    }
    for (Maestro maestro : participantes) {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("/view/AsistenteAReunion.fxml"));
      try {
        loader.load();
      } catch (IOException ex) {
        Logger.getLogger(MinutaDeReunionController.class.getName()).log(Level.SEVERE, null, ex);
      }
      AsistenteAReunionController display = loader.getController();
      AnchorPane panel = loader.getRoot();
      display.llenarDatosAsistente(maestro.getNombre() + " " + maestro.getApellidos());
      listParticipantes.getItems().add(panel);
    }
  }

  /**
   * Inicialización y muestra de un JFXDialog al centro de la pantalla, mandando
   * una advertencia a alguna operación
   * 
   * @param head Título del dialog
   * @param body Texto principal del dialog
   */
  public void mensaje(String head, String body) {
    JFXDialogLayout content = new JFXDialogLayout();
    content.setHeading(new Text(head));
    content.setBody(new Text(body));
    JFXDialog dialog = new JFXDialog(rootPane, content, JFXDialog.DialogTransition.CENTER);
    JFXButton aceptar = new JFXButton("ACEPTAR");
    aceptar.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        dialog.close();
      }
    });
    content.setActions(aceptar);
    dialog.show();
  }

}