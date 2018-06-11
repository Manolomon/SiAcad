/**
 * PlanDeCursoController.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextArea;
import controller.dialog.BibliografiaDialogController;
import controller.dialog.CalendarioDialogController;
import controller.dialog.PlaneacionDialogController;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import model.dao.PlanDeCursoDAO;
import model.pojos.Bibliografia;
import model.pojos.Curso;
import model.pojos.Evaluacion;
import model.pojos.Evaluacion_PlanCurso;
import model.pojos.PlanDeCurso;
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
  private JFXComboBox<Curso> cmbCurso;

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
  private JFXButton btnEdit;

  @FXML
  private JFXButton btnMasCalendario;

  @FXML
  private JFXTextArea txtObjetivo;

  private ObservableList<Planeacion> listaPlaneaciones;

  private ObservableList<Bibliografia> listaBibliografias;

  private ObservableList<Evaluacion_PlanCurso> listaEvaluaciones;

  private int posicionTablaPlaneacion;

  private int posicionTablaBibliografia;

  private int posicionTablaCalendario;
  
  private PlanDeCurso plandecurso;

  private List<Curso> cursosDelMaestro;

  private Integer idMaestro;

  public void setIdMaestro(Integer idMaestro){
    this.idMaestro = idMaestro;
  }
  /**
   * Listener de la tabla personas
   */
  private final ListChangeListener<Planeacion> selectorTablaPlaneaciones = new ListChangeListener<Planeacion>() {
    @Override
    public void onChanged(ListChangeListener.Change<? extends Planeacion> c) {
      ponerPlaneacionSeleccionada();
    }
  };

  private final ListChangeListener<Bibliografia> selectorTablaBibliografia = new ListChangeListener<Bibliografia>() {
    @Override
    public void onChanged(ListChangeListener.Change<? extends Bibliografia> c) {
      ponerBibliografiaSeleccionada();
    }
  };

  private final ListChangeListener<Evaluacion_PlanCurso> selectorTablaCalendario = new ListChangeListener<Evaluacion_PlanCurso>() {
    @Override
    public void onChanged(ListChangeListener.Change<? extends Evaluacion_PlanCurso> c) {
      ponerCalendarioSeleccionado();
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

  public Bibliografia getTablaBibliografiaSeleccionada() {
    if (tableBibliografia != null) {
      List<Bibliografia> tabla = tableBibliografia.getSelectionModel().getSelectedItems();
      if (tabla.size() == 1) {
        final Bibliografia competicionSeleccionada = tabla.get(0);
        return competicionSeleccionada;
      }
    }
    return null;
  }

  public Evaluacion_PlanCurso getTablaCalendarioSeleccionado() {
    if (tableCalendario != null) {
      List<Evaluacion_PlanCurso> tabla = tableCalendario.getSelectionModel().getSelectedItems();
      if (tabla.size() == 1) {
        final Evaluacion_PlanCurso competicionSeleccionada = tabla.get(0);
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
    }
  }

  private void ponerBibliografiaSeleccionada() {
    final Bibliografia bibliografia = getTablaBibliografiaSeleccionada();
    posicionTablaBibliografia = listaPlaneaciones.indexOf(bibliografia);
    if (bibliografia != null) {
    }
  }

  private void ponerCalendarioSeleccionado() {
    final Evaluacion_PlanCurso evaluacion = getTablaCalendarioSeleccionado();
    posicionTablaCalendario = listaEvaluaciones.indexOf(evaluacion);
    if (evaluacion != null) {
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

  private void inicializarTablaBibliografia() {
    bibliografiaAutor.setCellValueFactory(new PropertyValueFactory<Bibliografia, String>("autor"));
    bibliografiaTitulo.setCellValueFactory(new PropertyValueFactory<Bibliografia, String>("titulo"));
    bibliografiaEditorial.setCellValueFactory(new PropertyValueFactory<Bibliografia, String>("editorial"));
    biblioYear.setCellValueFactory(new PropertyValueFactory<Bibliografia, Integer>("anio"));
    listaBibliografias = FXCollections.observableArrayList();
    tableBibliografia.setItems(listaBibliografias);
  }

  private void inicializarTablaCalendario() {
    calendarioUnidad.setCellValueFactory(new PropertyValueFactory<Evaluacion_PlanCurso, Integer>("unidad"));
    calendarioCriterio.setCellValueFactory(new PropertyValueFactory<Evaluacion_PlanCurso, String>("criterioDeEvaluacion"));
    calendarioFechas.setCellValueFactory(new PropertyValueFactory<Evaluacion_PlanCurso, String>("fechas"));
    calendarioPorcentage.setCellValueFactory(new PropertyValueFactory<Evaluacion_PlanCurso, Integer>("porcentaje"));
    listaEvaluaciones = FXCollections.observableArrayList();
    tableCalendario.setItems(listaEvaluaciones);
  }
  
  private void guardarBibliografias() {
      listaBibliografias.forEach((bib) -> {
          if (!PlanDeCursoDAO.guardarBibliografia(bib)) {
              mensaje("Error","Error en la conexion con la base de datos");
          }
      });
  }
  
  private void guardarPlaneaciones() {
      listaPlaneaciones.forEach((plan) -> {
          if (!PlanDeCursoDAO.guardarPlaneacion(plan)) {
              mensaje("Error","Error en la conexion con la base de datos");
          }
      });
  }
  
  private void guardarEvaluaciones() {
      listaEvaluaciones.forEach((eval) -> {
          if (!PlanDeCursoDAO.guardarEvaluacion(eval)) {
              mensaje("Error","Error en la conexion con la base de datos");
          }
      });
  }

  @FXML
  public void clickEnviar(ActionEvent event) {
      
  }

  @FXML
  public void clickGuardar(ActionEvent event) {
      guardarBibliografias();
      guardarPlaneaciones();
      guardarEvaluaciones();
      plandecurso.setObjetivoGeneral(txtObjetivo.getText());
      if(!PlanDeCursoDAO.guardarPlanDeCurso(plandecurso)) {
         mensaje("Error","Error en la conexion con la base de datos"); 
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

  @FXML
  public void clickMasBibliografia(ActionEvent event) {
    JFXDialogLayout content = new JFXDialogLayout();
    content.setHeading(new Text("Bibliografía"));
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("/view/Dialog/BibliografiaDialog.fxml"));
    try {
      loader.load();
    } catch (IOException ex) {
      Logger.getLogger(PlanDeCursoController.class.getName()).log(Level.SEVERE, null, ex);
    }
    BibliografiaDialogController display = loader.getController();
    AnchorPane p = loader.getRoot();
    content.setBody(p);
    JFXDialog dialog = new JFXDialog(rootPane, content, JFXDialog.DialogTransition.CENTER);
    JFXButton aceptar = new JFXButton("ACEPTAR");

    aceptar.setOnAction((ActionEvent e) -> {
      Bibliografia bibliografia = display.crearBibliografia();
      listaBibliografias.add(bibliografia);
      dialog.close();
    });

    content.setActions(aceptar);
    dialog.show();
  }

  @FXML
  public void clickMasPlaneacion(ActionEvent event) {
    JFXDialogLayout content = new JFXDialogLayout();
    content.setHeading(new Text("Planeación"));
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("/view/Dialog/PlaneacionDialog.fxml"));
    try {
      loader.load();
    } catch (IOException ex) {
      Logger.getLogger(PlanDeCursoController.class.getName()).log(Level.SEVERE, null, ex);
    }
    PlaneacionDialogController display = loader.getController();
    AnchorPane p = loader.getRoot();
    content.setBody(p);
    JFXDialog dialog = new JFXDialog(rootPane, content, JFXDialog.DialogTransition.CENTER);
    JFXButton aceptar = new JFXButton("ACEPTAR");

    aceptar.setOnAction((ActionEvent e) -> {
      Planeacion planeacion = display.crearPlaneacion(listaPlaneaciones.size() + 1);
      listaPlaneaciones.add(planeacion);
      dialog.close();
    });

    content.setActions(aceptar);
    dialog.show();
  }

  @FXML
  public void clickMenosBibliografia(ActionEvent event) {
    if (listaBibliografias.size() > 0) {
      listaBibliografias.remove(listaBibliografias.size() - 1);
    }
  }

  @FXML
  public void clickMenosPlaneacion(ActionEvent event) {
    if (listaPlaneaciones.size() > 0) {
      listaPlaneaciones.remove(listaPlaneaciones.size() - 1);
    }
  }
  
  @FXML
  void clickEditCalendario(ActionEvent event) {
    JFXDialogLayout content = new JFXDialogLayout();
    content.setHeading(new Text("Calendario para Evaluación"));
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("/view/Dialog/CalendarioDialog.fxml"));
    try {
      loader.load();
    } catch (IOException ex) {
      Logger.getLogger(PlanDeCursoController.class.getName()).log(Level.SEVERE, null, ex);
    }
    CalendarioDialogController display = loader.getController();
    AnchorPane p = loader.getRoot();
    content.setBody(p);
    JFXDialog dialog = new JFXDialog(rootPane, content, JFXDialog.DialogTransition.CENTER);
    JFXButton aceptar = new JFXButton("ACEPTAR");
    Evaluacion_PlanCurso evaluacionSeleccionada = listaEvaluaciones.get(posicionTablaCalendario);
    display.ponerDatos(evaluacionSeleccionada.getUnidad(), evaluacionSeleccionada.getFechas(), evaluacionSeleccionada.getCriterioDeEvaluacion(), evaluacionSeleccionada.getPorcentaje());
    aceptar.setOnAction((ActionEvent e) -> {
      Evaluacion_PlanCurso evaluacion = display.crearEvaluacion(evaluacionSeleccionada.getUnidad(), evaluacionSeleccionada.getPorcentaje());
      listaEvaluaciones.set(posicionTablaCalendario, evaluacion);
      dialog.close();
    });

    content.setActions(aceptar);
    dialog.show();
  }

  /**
   * Inicialización del comboBox con las reuniones
   */
  public void cargarCursos() {
    try {
      cursosDelMaestro = PlanDeCursoDAO.obtenerCursoesDeMaestro(this.idMaestro);//TODO: Sacada de Datos
    } catch (Exception e) {
      mensaje("Error", "Error en la conexión a la Base de Datos");
    }
    cmbCurso.getItems().addAll(cursosDelMaestro);
    cmbCurso.setConverter(new StringConverter<Curso>() {

      @Override
      public String toString(Curso curso) {
        if (curso == null) {
          return "";
        } else {
          return PlanDeCursoDAO.obtenerNombreCurso(curso.getIdExperienciaEducativa()); //TODO: No sé si dejar el NRC o sacar el nombre de la EE
        }
      }

      @Override
      public Curso fromString(String string) {
        throw new UnsupportedOperationException("Not supported yet.");
      }

    });
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
  
  private void recuperarEvaluacionesDePlanTrabajo(Integer idCurso) {
      Curso cursoTemp = cmbCurso.getSelectionModel().getSelectedItem();
      List<Evaluacion> listaEvalTemp = PlanDeCursoDAO.obtenerEvaluacionesDePlanDeTrabajo(
              cursoTemp.getIdCurso());
      List<Evaluacion_PlanCurso> listaEval = new ArrayList<>();
      listaEvalTemp.forEach((evalTemp) -> {
          Evaluacion_PlanCurso eval = new Evaluacion_PlanCurso();
          eval.setCriterioDeEvaluacion(evalTemp.getInstrumento());
          eval.setPorcentaje(evalTemp.getPorcentaje());
          listaEval.add(eval);
      });
      listaEvaluaciones.addAll(listaEval);
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    inicializarTablaPlaneacion();
    inicializarTablaBibliografia();
    inicializarTablaCalendario();
    //listaEvaluaciones.add(new Evaluacion_PlanCurso(1, "Muchas cosas huuuu", 10, "Toda la vida"));
    plandecurso = new PlanDeCurso();
    plandecurso.setIdPlanDeCurso(PlanDeCursoDAO.contarPlanes()+1);
    plandecurso.setFormato("plancurso");
  }

}