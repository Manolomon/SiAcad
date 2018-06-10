/*
 * SiAcad.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * 
 * Clase principal de la ejecución
 * 
 * @author Manolo Pérez
 * @since Mon May 07 2018
 * @version 0.2
 */
public class SiAcad extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("/view/Inicio.fxml"));
    stage.setTitle("Sistema Integral de Control de Academias");
    Scene scene = new Scene(root);// new JFXDecorator(stage, root, false, false, true));
    scene.getStylesheets().add(getClass().getResource("/resources/CSS/Styles.css").toExternalForm());
    stage.getIcons().add(new Image(getClass().getResourceAsStream("/resources/Icon.png")));
    stage.setResizable(false);
    stage.sizeToScene();
    stage.setMaximized(true);
    stage.setScene(scene);
    stage.show();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

}
