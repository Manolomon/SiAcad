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
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.dao.PlanDeTrabajoDAO;
import model.pojos.Actividad;
import model.pojos.Evaluacion;
import model.pojos.Maestro;
import model.pojos.ObjetivoParticular;
import model.pojos.Participante;
import model.pojos.PlanDeTrabajo;
import model.pojos.Tema;

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
  
  private PlanDeTrabajo plandetrabajo;

  private List<List<Evaluacion>> evaluacionesEE;

  private List<Tema> listaTemasEE;

  private final ListChangeListener<Actividad> selectorTablaActividades=new ListChangeListener<Actividad>(){@Override public void onChanged(ListChangeListener.Change<?extends Actividad>c){ponerActividadSeleccionada();}};

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
  
  private void guardarActividades() {
      ObjetivoParticular objetivoPart = new ObjetivoParticular();
      objetivoPart.setIdObjetivoParticular(PlanDeTrabajoDAO.contarObjetivosParticulares()+1);
      objetivoPart.setMetas(txtMeta.getText());
      objetivoPart.setObjetivo(txtObjetivoParticular.getText());
      listaActividades.forEach(actividad ->{
          if(!PlanDeTrabajoDAO.guardarActividad(actividad)) {
              mensaje("Error","Error en la conexion con la base de datos");
          }
      });
  }
  
  private void guardarParticipantes() {
      listaParticipantes.forEach(participante ->{
          if(!PlanDeTrabajoDAO.guardarParticipante(
            new Participante(
                    plandetrabajo.getIdPlanDetrabajo(),participante.getIdUsuarioAcademico()))) {
            mensaje("Error","Error en la conexion con la base de datos");
          }
      });
  }

  private void obtenerEELlenadas() {
    ObservableList<Tab> tabs = tabPanelEE.getTabs();
    for (Tab t : tabs) {
      System.out.println("Holis");
      StackPane contenido = (StackPane) t.getContent();
      AnchorPane contenedor = (AnchorPane) contenido.getChildren().get(0);
      for (Node node : contenedor.getChildren()) {
         if (node.getAccessibleText() != null) {
          switch (node.getAccessibleText()) {
          case "Tablita"://Actividad que vayas a hacer con la tablita
            break;
          case "Primer Parcial"://Con los textfields
            break;
          case "Segundo Parcial":
            break;
          case "Posterior":
            break;
          }
        }
      }
    }
  }

  @FXML
  void clickEnviar(ActionEvent event) {
    obtenerEELlenadas();
  }

  @FXML
  void clickGuardar(ActionEvent event) {
      guardarActividades();
      guardarParticipantes();
      if (!PlanDeTrabajoDAO.guardarPlanDeTrabajo(plandetrabajo)) {
          mensaje("Error","Error en la conexion con la base de datos");
      }
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