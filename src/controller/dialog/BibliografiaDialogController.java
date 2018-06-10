/**
 * BibliografiaDialogController.java
 *
 * Copyright (c) 2018, SiAcad
 * All rights reserved.
 */

package controller.dialog;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.pojos.Bibliografia;

/**
 * @author Manolo Pérez
 * @since Sun Jun 10 2018
 * @version 0.1
 */

public class BibliografiaDialogController implements Initializable {

  @FXML
  private JFXTextField txtAutor;

  @FXML
  private JFXTextField txtTítulo;

  @FXML
  private JFXTextField txtEditorial;

  @FXML
  private JFXTextField txtYear;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }

  public Bibliografia crearBibliografia() {
    Bibliografia bibliografia = new Bibliografia(txtTítulo.getText(), txtAutor.getText(), txtEditorial.getText(),
        Integer.parseInt(txtYear.getText()));
    return bibliografia;
  }
}