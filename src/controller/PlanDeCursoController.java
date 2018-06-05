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
  private JFXTreeTableView<?> tablePlaneacion;

  @FXML
  private JFXTreeTableColumn<?, ?> planeacionUnidad;

  @FXML
  private JFXTreeTableColumn<?, ?> planeacionTemas;

  @FXML
  private JFXTreeTableColumn<?, ?> planeacionFechas;

  @FXML
  private JFXTreeTableColumn<?, ?> planeacionTareas;

  @FXML
  private JFXTreeTableColumn<?, ?> planeacionTecnica;

  @FXML
  private JFXButton btnMenosPlaneacion;

  @FXML
  private JFXButton btnMasPlaneacion;

  @FXML
  private JFXTreeTableView<?> editableTreeTableView1;

  @FXML
  private JFXTreeTableColumn<?, ?> bibliografiaAutor;

  @FXML
  private JFXTreeTableColumn<?, ?> bibliografiaTitulo;

  @FXML
  private JFXTreeTableColumn<?, ?> bibliografiaEditorial;

  @FXML
  private JFXTreeTableColumn<?, ?> biblioYear;

  @FXML
  private JFXButton btnMenosBibliografia;

  @FXML
  private JFXButton btnMasBibliografia;

  @FXML
  private JFXTreeTableView<?> editableTreeTableView2;

  @FXML
  private JFXTreeTableColumn<?, ?> calendarioUnidad;

  @FXML
  private JFXTreeTableColumn<?, ?> calendarioFechas;

  @FXML
  private JFXTreeTableColumn<?, ?> calendarioCriterio;

  @FXML
  private JFXTreeTableColumn<?, ?> calendarioInstrumento;

  @FXML
  private JFXTreeTableColumn<?, ?> calendarioPorcentage;

  @FXML
  private JFXButton btnMasCalendario;

  @FXML
  private JFXTextArea txtObjetivo;

  @FXML
  void clickEnviar(ActionEvent event) {

  }

  @FXML
  void clickGuardar(ActionEvent event) {

  }

  @FXML
  void clickHamburger(ActionEvent event) {
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
  void clickMasBibliografia(ActionEvent event) {

  }

  @FXML
  void clickMasPlaneacion(ActionEvent event) {

  }

  @FXML
  void clickMenosBibliografia(ActionEvent event) {

  }

  @FXML
  void clickMenosPlaneacion(ActionEvent event) {

  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }

}