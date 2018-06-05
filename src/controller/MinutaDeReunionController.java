/**
 * MinutaDeReunionController.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextArea;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

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
  private JFXComboBox<?> cmbReunion;

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
  }
}