/**
 * CalendarioDialogController.java
 *
 * Copyright (c) 2018, Royal Mango Developers
 * All rights reserved.
 */

package controller.dialog;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.pojos.Evaluacion_PlanCurso;

/**
 * @author Manolo Pérez
 * @since Sun Jun 10 2018
 * @version 0.1
 */

public class CalendarioDialogController implements Initializable {

  @FXML
  private JFXTextField txtUnidad;

  @FXML
  private JFXTextField txtFechas;

  @FXML
  private JFXTextField txtCriterio;

  @FXML
  private JFXTextField txtPorcentage;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
  
  public void ponerDatos(Integer unidad,String fechas, String criterio, Integer porcentage){
    txtUnidad.setText(unidad.toString());
    txtFechas.setText(fechas);
    txtCriterio.setText(criterio);
    txtPorcentage.setText(porcentage.toString());
  }

  public Evaluacion_PlanCurso crearEvaluacion(Integer unidad, Integer porcentage) {
    Evaluacion_PlanCurso evaluacion = new Evaluacion_PlanCurso(unidad, txtCriterio.getText(), porcentage, txtFechas.getText());
    return evaluacion;
  }
}