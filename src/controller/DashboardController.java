/*
 * InicioController.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.dao.AcademiaDAO;
import model.pojos.Academia;
import model.pojos.UsuarioAcademico;

/**
 * Clase controladora de la escena de Dashboard de SiAcad
 * 
 * @author Manolo Pérez
 * @since Mon May 13 2018
 * @version 0.1
 */
public class DashboardController implements Initializable {

  @FXML
  private StackPane rootPane;

  @FXML
  private AnchorPane panelTopBar;

  @FXML
  private JFXButton btnHamburger;

  @FXML
  private JFXButton btnModoMaestro;

  @FXML
  private AnchorPane panelMaestro;

  @FXML
  private JFXButton btnLogOut;

  @FXML
  private ImageView imageLogOut;

  @FXML
  private Label lblnombreMaestro;

  @FXML
  private Label lblMaestro;

  @FXML
  private JFXButton btnModoCoordinador;

  @FXML
  private AnchorPane panelCoordinador;

  @FXML
  private Label lblCoordinador;

  @FXML
  private Label lblAcademia;

  @FXML
  private JFXDrawer drawer;

  private String modoDeUsuario = "Maestro";

  private UsuarioAcademico usuario;

  private Integer idAcademia;

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    drawer.setResizeContent(true);
    drawer.setOverLayVisible(false);
    drawer.setResizableOnDrag(true);
  }

  @FXML
  public void cerrarDrawer(MouseEvent event) {
    drawer.close();
    drawer.setMouseTransparent(true);
  }

  public void cargarUsuario(UsuarioAcademico usuario) {
    this.usuario = usuario;
    lblnombreMaestro.setText(usuario.getNombre() + " " + usuario.getApellidos());
    Academia academia = AcademiaDAO.obtenerCoordinacion(usuario.getIdUsuarioAcademico());
    idAcademia = academia.getIdAcademia();
    lblAcademia.setText(academia.getNombre());
  }

  public void cargarPantalla(String nombrePantalla) {
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("/view/" + nombrePantalla + ".fxml"));
    try {
      loader.load();
    } catch (IOException ex) {
      Logger.getLogger(DashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    if(nombrePantalla == "PlanDeCurso") {
      PlanDeCursoController planCurso = loader.getController();
      planCurso.setIdMaestro(usuario.getIdUsuarioAcademico());
    }
    if(nombrePantalla == "PlanDeTrabajo"){
      PlanDeTrabajoController planTrabajo = loader.getController();
      planTrabajo.iniciarDatosUsuario(usuario.getIdUsuarioAcademico(), this.idAcademia);
    }
    if(nombrePantalla == "MinutaDeReunion"){
    }
    // FXMLVerMisCursosController display = loader.getController();
    // display.asignarDatos(user);
    StackPane agregarView = loader.getRoot();
    Scene newScene = new Scene(agregarView);
    Stage curStage = (Stage) rootPane.getScene().getWindow();
    newScene.getStylesheets().add(getClass().getResource("/resources/CSS/Styles.css").toExternalForm());
    curStage.setScene(newScene);
    curStage.show();
  }

  @FXML
  public void clickHamburger(ActionEvent event) {
    try {
      VBox box;
      if (modoDeUsuario.equals("Maestro")) {
        box = FXMLLoader.load(getClass().getResource("/view/DrawerMaestro.fxml"));
      } else {
        box = FXMLLoader.load(getClass().getResource("/view/DrawerCoordinador.fxml"));
      }
      for (Node node : box.getChildren()) {
        node.addEventHandler(MouseEvent.MOUSE_CLICKED, (e) -> {
          if (node.getAccessibleText() != null) {
            switch (node.getAccessibleText()) {
            case "Inicio":
              drawer.close();
              drawer.setMouseTransparent(true);
              break;
            case "Calendario":
              break;
            case "Planes de Curso":
              cargarPantalla("PlanDeCurso");
              break;
            case "Avances Programáticos":
              break;
            case "Perfil":
              break;
            case "Planes de Trabajo":
              cargarPantalla("PlanDeTrabajo");
              break;
            case "Reuniones":
              cargarPantalla("MinutaDeReunion");
              break;
            }
            drawer.close();
            drawer.setMouseTransparent(true);
          }
        });
      }
      drawer.setSidePane(box);
      drawer.setEffect(new DropShadow());
      drawer.open();
      drawer.setMouseTransparent(false);
    } catch (IOException e) {

    }
  }

  public void cambiarModoMaestro() {
    modoDeUsuario = "Maestro";
    System.out.println("Click en modo maestro");
    imageLogOut.setImage(new Image(getClass().getResourceAsStream("/resources/ic_close_circle_white_36dp.png")));
    panelMaestro.setStyle(
        "-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #728EF9, #675DF9); -fx-background-radius: 10 10 0 0;");
    lblnombreMaestro.setTextFill(Color.web("#FFFFFF"));
    lblMaestro.setTextFill(Color.web("#FFFFFF"));
    panelCoordinador.setStyle("-fx-background-color: #FFFFFF; -fx-background-radius: 0 0 10 10;");
    lblCoordinador.setTextFill(Color.web("#656565"));
    lblAcademia.setTextFill(Color.web("#656565"));
    panelTopBar.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #728EF9, #675DF9);");
  }

  public void cambiarModoCoordinador() {
    modoDeUsuario = "Coordinador";
    System.out.println("Click en modo Coordinador");
    imageLogOut.setImage(new Image(getClass().getResourceAsStream("/resources/ic_close_circle_grey600_36dp.png")));
    panelCoordinador.setStyle(
        "-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #D4218D, #873A94); -fx-background-radius: 0 0 10 10;");
    lblCoordinador.setTextFill(Color.web("#FFFFFF"));
    lblAcademia.setTextFill(Color.web("#FFFFFF"));
    panelMaestro.setStyle("-fx-background-color: #FFFFFF; -fx-background-radius: 10 10 0 0;");
    lblnombreMaestro.setTextFill(Color.web("#656565"));
    lblMaestro.setTextFill(Color.web("#656565"));
    panelTopBar.setStyle("-fx-background-color: linear-gradient(from 25% 25% to 100% 100%, #D4218D, #873A94);");
  }

  @FXML
  public void clickLogOut(ActionEvent event) {
    try {
      StackPane Login;
      Login = FXMLLoader.load(getClass().getResource("/view/Inicio.fxml"));
      Scene newScene = new Scene(Login);
      Stage curStage = (Stage) rootPane.getScene().getWindow();
      curStage.setScene(newScene);
      curStage.show();
    } catch (IOException e) {
      System.out.println("No se enecontró: " + e);
    }
  }

  @FXML
  public void clickModoCoordinador(ActionEvent event) {
    cambiarModoCoordinador();
  }

  @FXML
  public void clickModoMaestro(ActionEvent event) {
    cambiarModoMaestro();
  }

}
