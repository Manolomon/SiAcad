/**
 * ActividadDialogController.java
 *
 * Copyright (c) 2018, Royal Mango Developers
 * All rights reserved.
 */

package controller.dialog;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.pojos.Actividad;

/**
 * @author Manolo Pérez
 * @since Sun Jun 10 2018
 * @version 0.1
 */

public class ActividadDialogController implements Initializable {
    
  @FXML
  private JFXTextField txtFechas;

  @FXML
  private JFXTextArea txtFormaOperar;

  @FXML
  private JFXTextArea txtAcciones;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }

  public Actividad crearActividad() {
    Actividad act = new Actividad(txtAcciones.getText(), txtFechas.getText(), txtFormaOperar.getText());
    return act;
  }

}