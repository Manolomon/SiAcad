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
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
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
  private JFXTreeTableColumn<Planeacion, String> planeacionUnidad;

  @FXML
  private JFXTreeTableColumn<Planeacion, String> planeacionTemas;

  @FXML
  private JFXTreeTableColumn<Planeacion, String> planeacionFechas;

  @FXML
  private JFXTreeTableColumn<Planeacion, String> planeacionTareas;

  @FXML
  private JFXTreeTableColumn<Planeacion, String> planeacionTecnicas;

  @FXML
  private JFXTreeTableView<?> editableTreeTableView1;

  @FXML
  private JFXTreeTableColumn<Bibliografia, String> bibliografiaAutor;

  @FXML
  private JFXTreeTableColumn<Bibliografia, String> bibliografiaTitulo;

  @FXML
  private JFXTreeTableColumn<Bibliografia, String> bibliografiaEditorial;

  @FXML
  private JFXTreeTableColumn<Bibliografia, String> biblioYear;

  @FXML
  private JFXButton btnMenosBibliografia;

  @FXML
  private JFXButton btnMasBibliografia;

  @FXML
  private JFXTreeTableView<?> editableTreeTableView2;

  @FXML
  private JFXTreeTableColumn<Evaluacion_PlanCurso, String> calendarioUnidad1;

  @FXML
  private JFXTreeTableColumn<Evaluacion_PlanCurso, String> calendarioFechas;

  @FXML
  private JFXTreeTableColumn<Evaluacion_PlanCurso, String> calendarioCriterio;

  @FXML
  private JFXTreeTableColumn<Evaluacion_PlanCurso, String> calendarioInstrumento;

  @FXML
  private JFXTreeTableColumn<Evaluacion_PlanCurso, String> calendarioPorcentage;

  @FXML
  private JFXButton btnMasCalendario;

  @FXML
  private JFXTextArea txtObjetivo;

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

  }

  @FXML
  public void clickMenosBibliografia(ActionEvent event) {

  }

  @FXML
  public void clickMenosPlaneacion(ActionEvent event) {

  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }

}