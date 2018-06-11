/**
 * PlanDeTrabajoController.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextArea;
import controller.dialog.ActividadDialogController;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.pojos.Actividad;
import model.pojos.Evaluacion;
import model.pojos.Maestro;

/**
 * @author Manolo Pérez
 * @since Tue Jun 05 2018
 * @version 0.1
 */

public class PlanDeTrabajoController implements Initializable {

  @FXML
  private StackPane rootPane;

  @FXML
  private JFXListView<AnchorPane> listParticipantes;

  @FXML
  private AnchorPane panelTopBar;

  @FXML
  private JFXButton btnHamburger;

  @FXML
  private JFXButton btnEnviar;

  @FXML
  private JFXButton btnGuardar;

  @FXML
  private JFXButton btnMenosActividades;

  @FXML
  private JFXButton btnMasActividades;

  @FXML
  private JFXTextArea txtObjetivoParticular;

  @FXML
  private JFXTextArea txtMeta;

  @FXML
  private TableView<Actividad> tableActividad;

  @FXML
  private TableColumn<Actividad, String> actividadActividad;

  @FXML
  private TableColumn<Actividad, String> actividadFechas;

  @FXML
  private TableColumn<Actividad, String> actividadFormaOperar;

  @FXML
  private JFXTabPane tabPanelEE;

  @FXML
  private JFXTextArea txtObjetivoGeneral;

  private List<Maestro> listaParticipantes;
  
  private ObservableList<Actividad> listaActividades;

  private int posicionTablaActividad;

  private final ListChangeListener<Actividad> selectorTablaActividades = new ListChangeListener<Actividad>(){
      @Override 
      public void onChanged(ListChangeListener.Change<?extends Actividad>c){
          ponerActividadSeleccionada();
      }
  };
  
  public Actividad getTablaActividadSeleccionada() {
    if (tableActividad != null) {
      List<Actividad> tabla = tableActividad.getSelectionModel().getSelectedItems();
      if (tabla.size() == 1) {
        final Actividad competicionSeleccionada = tabla.get(0);
        return competicionSeleccionada;
      }
    }
    return null;
  }

  private void ponerActividadSeleccionada() {
    final Actividad act = getTablaActividadSeleccionada();
    posicionTablaActividad = listaActividades.indexOf(act);
    if (act != null) {
    }
  }

  private void inicializarTablaActividad() {
    actividadActividad.setCellValueFactory(new PropertyValueFactory<Actividad, String>("accion"));
    actividadFechas.setCellValueFactory(new PropertyValueFactory<Actividad, String>("fecha"));
    actividadFormaOperar.setCellValueFactory(new PropertyValueFactory<Actividad, String>("formaDeOperar"));
    listaActividades = FXCollections.observableArrayList();
    tableActividad.setItems(listaActividades);
  }

  @FXML
  void clickEnviar(ActionEvent event) {

  }

  @FXML
  void clickGuardar(ActionEvent event) {

  }

  @FXML
  void clickMasActividad(ActionEvent event) {
    JFXDialogLayout content = new JFXDialogLayout();
    content.setHeading(new Text("Actividades"));
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("/view/Dialog/ActividadDialog.fxml"));
    try {
      loader.load();
    } catch (IOException ex) {
      Logger.getLogger(PlanDeTrabajoController.class.getName()).log(Level.SEVERE, null, ex);
    }
    ActividadDialogController display = loader.getController();
    AnchorPane p = loader.getRoot();
    content.setBody(p);
    JFXDialog dialog = new JFXDialog(rootPane, content, JFXDialog.DialogTransition.CENTER);
    JFXButton aceptar = new JFXButton("ACEPTAR");

    aceptar.setOnAction((ActionEvent e) -> {
      Actividad act = display.crearActividad();
      listaActividades.add(act);
      dialog.close();
    });

    content.setActions(aceptar);
    dialog.show();
  }

  @FXML
  void clickMenosActividad(ActionEvent event) {
      if (listaActividades.size() > 0) {
      listaActividades.remove(listaActividades.size() - 1);
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

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    inicializarTablaActividad();
   for (int i = 0; i < 17; i++) {
     FXMLLoader loader = new FXMLLoader();
     loader.setLocation(getClass().getResource("/view/AsistenteAReunion.fxml"));
     try {
       loader.load();
     } catch (IOException ex) {
       Logger.getLogger(MinutaDeReunionController.class.getName()).log(Level.SEVERE, null, ex);
     }
     AsistenteAReunionController display = loader.getController();
     AnchorPane pan = loader.getRoot();
     // display.asignarDatos(curso);
     listParticipantes.getItems().add(pan);
   }

   String[] nombres = { "Requerimientos de Software", "Verificación y Validación de Software", "Principos de Diseño de Software"};

   for (String nombre : nombres) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/FormaDeEvaluacion.fxml"));
        try {
            loader.load();
        } catch (IOException ex) {
            Logger.getLogger(PlanDeTrabajoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        EvaluacionController display = loader.getController();
        StackPane p = loader.getRoot();
        Tab tab = new Tab(nombre);
        tab.setContent(p);
        tabPanelEE.getTabs().add(tab);
   }
  }
}