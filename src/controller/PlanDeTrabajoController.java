/**
 * PlanDeTrabajoController.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

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
  private JFXTreeTableView<?> tablePlaneacion;

  @FXML
  private JFXTreeTableColumn<?, ?> planeacionTemas;

  @FXML
  private JFXTreeTableColumn<?, ?> planeacionFechas;

  @FXML
  private JFXTreeTableColumn<?, ?> planeacionTecnica;

  @FXML
  private JFXButton btnMenosActividades;

  @FXML
  private JFXButton btnMasActividades;

  @FXML
  private JFXTextArea txtObjetivoParticular;

  @FXML
  private JFXTextArea txtMeta;

  @FXML
  private JFXTabPane tabPanelEE;

  @FXML
  private JFXTextArea txtObjetivoGeneral;

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
  public void clickMasPlaneacion(ActionEvent event) {
    
  }

  @FXML
  public void clickMenosPlaneacion(ActionEvent event) {

  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    for (int i = 0; i < 17; i++) {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("/view/AsistenteAReunion.fxml"));
      try {
        loader.load();
      } catch (IOException ex) {
        Logger.getLogger(MinutaDeReunionController.class.getName()).log(Level.SEVERE, null, ex);
      }
      AsistenteAReunionController display = loader.getController();
      AnchorPane p = loader.getRoot();
      // display.asignarDatos(curso);
      listParticipantes.getItems().add(p);
    }

    String[] nombres = { "Requerimientos de Software", "Verificación y Validación de Software", "Principos de Diseño de Software"};

    for (String nombre : nombres) {
      FXMLLoader loader = new FXMLLoader();
      loader.setLocation(getClass().getResource("/view/FormaDeEvaluacion.fxml"));
      try {
        loader.load();
      } catch (IOException ex) {
        Logger.getLogger(MinutaDeReunionController.class.getName()).log(Level.SEVERE, null, ex);
      }
      AsistenteAReunionController display = loader.getController();
      AnchorPane p = loader.getRoot();
      Tab tab = new Tab(nombre);
      tab.setContent(p);
      tabPanelEE.getTabs().add(tab);
    }
  }
}