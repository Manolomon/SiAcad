package controller.dialog;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import model.pojos.Planeacion;

public class PlaneacionDialogController implements Initializable {

  @FXML
  private JFXTextArea txtTecnicas;

  @FXML
  private JFXTextField txtFechas;

  @FXML
  private JFXTextArea txtTemas;

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }

  public Planeacion crearPlaneacion(Integer unidad) {
    Planeacion planeacion = new Planeacion(txtFechas.getText(), txtTemas.getText(), unidad, txtTecnicas.getText());
    return planeacion;
  }

}