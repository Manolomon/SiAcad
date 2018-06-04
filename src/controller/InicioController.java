/*
 * InicioController.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Clase controladora de la escena de Inicio de SiAcad
 * 
 * @author Manolo Pérez
 * @since Mon May 07 2018
 * @version 0.1
 */
public class InicioController implements Initializable {
  @FXML
  private StackPane rootPane;

  @FXML
  private JFXTextField txtEmail;

  @FXML
  private JFXPasswordField txtPassword;

  @FXML
  private JFXButton btnLogin;

  @FXML
  private JFXButton btnSignUp;

  @FXML
  private ImageView btnInfo;

  @FXML
  void clickAcceder(ActionEvent event) {
    try {
      StackPane registroView;
      registroView = FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"));
      Scene newScene = new Scene(registroView);
      Stage curStage = (Stage) rootPane.getScene().getWindow();
      curStage.setScene(newScene);
      curStage.show();
    } catch (IOException e) {
      System.out.println("No se encontró: " + e);
    }
  }

  @FXML
  void clickSignUp(ActionEvent event) {

  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }

}
