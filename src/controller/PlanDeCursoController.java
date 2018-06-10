/**
 * PlanDeCursoController.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.pojos.Bibliografia;
import model.pojos.Evaluacion_PlanCurso;
import model.pojos.Planeacion;

/**
 * @author Manolo Pérez
 * @since Tue Jun 05 2018
 * @version 0.1
 */

public class PlanDeCursoController implements Initializable {

  @FXML
  private StackPane rootPane;

  @FXML
  private AnchorPane panelTopBar;

  @FXML
  private JFXButton btnHamburger;

  @FXML
  private JFXComboBox<?> cmbCurso;

  @FXML
  private JFXButton btnEnviar;

  @FXML
  private JFXButton btnGuardar;

  @FXML
  private JFXButton btnMenosPlaneacion;

  @FXML
  private JFXButton btnMasPlaneacion;

  @FXML
  private TableView<Planeacion> tablePlaneacion;

  @FXML
  private TableColumn<Planeacion, Integer> planeacionUnidad;

  @FXML
  private TableColumn<Planeacion, String> planeacionTemas;

  @FXML
  private TableColumn<Planeacion, String> planeacionFechas;

  @FXML
  private TableColumn<Planeacion, String> planeacionTecnicas;

  @FXML
  private TableView<Bibliografia> tableBibliografia;

  @FXML
  private TableColumn<Bibliografia, String> bibliografiaAutor;

  @FXML
  private TableColumn<Bibliografia, String> bibliografiaTitulo;

  @FXML
  private TableColumn<Bibliografia, String> bibliografiaEditorial;

  @FXML
  private TableColumn<Bibliografia, Integer> biblioYear;

  @FXML
  private JFXButton btnMenosBibliografia;

  @FXML
  private JFXButton btnMasBibliografia;

  @FXML
  private TableView<Evaluacion_PlanCurso> tableCalendario;

  @FXML
  private TableColumn<Evaluacion_PlanCurso, Integer> calendarioUnidad;

  @FXML
  private TableColumn<Evaluacion_PlanCurso, String> calendarioFechas;

  @FXML
  private TableColumn<Evaluacion_PlanCurso, String> calendarioCriterio;

  @FXML
  private TableColumn<Evaluacion_PlanCurso, Integer> calendarioPorcentage;

  @FXML
  private JFXButton btnMasCalendario;

  @FXML
  private JFXTextArea txtObjetivo;

  private ObservableList<Planeacion> listaPlaneaciones;

  private ObservableList<Bibliografia> listaBibliografias;

  private ObservableList<Evaluacion_PlanCurso> listaEvaluaciones;

  private int posicionTablaPlaneacion;

  /**
   * Listener de la tabla personas
   */
  private final ListChangeListener<Planeacion> selectorTablaPlaneaciones = new ListChangeListener<Planeacion>() {
    @Override
    public void onChanged(ListChangeListener.Change<? extends Planeacion> c) {
      ponerPlaneacionSeleccionada();
    }
  };

  /**
   * PARA SELECCIONAR UNA CELDA DE LA TABLA "tablaPersonas"
   */

  public Planeacion getTablaPlaneacionSeleccionada() {
    if (tablePlaneacion != null) {
      List<Planeacion> tabla = tablePlaneacion.getSelectionModel().getSelectedItems();
      if (tabla.size() == 1) {
        final Planeacion competicionSeleccionada = tabla.get(0);
        return competicionSeleccionada;
      }
    }
    return null;
  }

  /**
   * 
   * Método para poner en los textFields la tupla que selccionemos
   * 
   */

  private void ponerPlaneacionSeleccionada() {
    final Planeacion plan = getTablaPlaneacionSeleccionada();
    posicionTablaPlaneacion = listaPlaneaciones.indexOf(plan);
    if (plan != null) {
//      // Pongo los textFields con los datos correspondientes
//      nombreTF.setText(persona.getNombre());
//      apellidoTF.setText(persona.getApellido());
//      edadTF.setText(persona.getEdad().toString());
//      telefonoTF.setText(persona.getTelefono());
//      // Pongo los botones en su estado correspondiente
//      modificarBT.setDisable(false);
//      eliminarBT.setDisable(false);
//      aniadirBT.setDisable(true);
    }
  }

  /**
   * 
   * Método para inicializar la tabla
   * 
   */

  private void inicializarTablaPlaneacion() {
    planeacionUnidad.setCellValueFactory(new PropertyValueFactory<Planeacion, Integer>("unidad"));
    planeacionTemas.setCellValueFactory(new PropertyValueFactory<Planeacion, String>("temas"));
    planeacionFechas.setCellValueFactory(new PropertyValueFactory<Planeacion, String>("fechas"));
    planeacionTecnicas.setCellValueFactory(new PropertyValueFactory<Planeacion, String>("tecnicasDidacticas"));
    listaPlaneaciones = FXCollections.observableArrayList();
    tablePlaneacion.setItems(listaPlaneaciones);

  }

  @FXML
  public void clickEnviar(ActionEvent event) {

  }

  @FXML
  public void clickGuardar(ActionEvent event) {

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

  @FXML
  public void clickMasBibliografia(ActionEvent event) {

  }

  @FXML
  public void clickMasPlaneacion(ActionEvent event) {
    Planeacion plan = new Planeacion("Hola", "Hola", listaPlaneaciones.size(), "Hola");
    listaPlaneaciones.add(plan);
  }

  @FXML
  public void clickMenosBibliografia(ActionEvent event) {

  }

  @FXML
  public void clickMenosPlaneacion(ActionEvent event) {
    if (listaPlaneaciones.size() > 0) {
        listaPlaneaciones.remove(listaPlaneaciones.size() - 1);
    }
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    inicializarTablaPlaneacion();
  }

}