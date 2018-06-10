package model.pojos;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Deklok
 */
public class Planeacion {
  private Integer idPlaneacion;
  private SimpleStringProperty fechas = new SimpleStringProperty();
  private SimpleStringProperty temas = new SimpleStringProperty();
  private SimpleIntegerProperty unidad = new SimpleIntegerProperty();
  private SimpleStringProperty tecnicasDidacticas = new SimpleStringProperty();
  private Integer idPlanDeCurso;

  public Planeacion() {
  }

  public Planeacion(Integer idPlaneacion, String fechas, String temas, Integer unidad, String tecnicasDidacticas,
      Integer idPlanDeCurso) {
    this.idPlaneacion = idPlaneacion;
    this.fechas = new SimpleStringProperty(fechas);
    this.temas = new SimpleStringProperty(temas);
    this.unidad = new SimpleIntegerProperty(unidad);
    this.tecnicasDidacticas = new SimpleStringProperty(tecnicasDidacticas);
    this.idPlanDeCurso = idPlanDeCurso;
  }

  public Planeacion(String fechas, String temas, Integer unidad, String tecnicasDidacticas) {
    this.fechas = new SimpleStringProperty(fechas);
    this.temas = new SimpleStringProperty(temas);
    this.unidad = new SimpleIntegerProperty(unidad);
    this.tecnicasDidacticas = new SimpleStringProperty(tecnicasDidacticas);
  }

  public Integer getIdPlaneacion() {
    return idPlaneacion;
  }

  public void setIdPlaneacion(Integer idPlaneacion) {
    this.idPlaneacion = idPlaneacion;
  }

  public String getFechas() {
    return fechas.get();
  }

  public void setFechas(String fechas) {
    this.fechas = new SimpleStringProperty(fechas);
  }

  public String getTemas() {
    return temas.get();
  }

  public void setTemas(String temas) {
    this.temas = new SimpleStringProperty(temas);
  }

  public Integer getUnidad() {
    return unidad.get();
  }

  public void setUnidad(Integer unidad) {
    this.unidad = new SimpleIntegerProperty(unidad);
  }

  public String getTecnicasDidacticas() {
    return tecnicasDidacticas.get();
  }

  public void setTecnicasDidacticas(String tecnicasDidacticas) {
    this.tecnicasDidacticas = new SimpleStringProperty(tecnicasDidacticas);
  }

  public Integer getIdPlanDeCurso() {
    return idPlanDeCurso;
  }

  public void setIdPlanDeCurso(Integer idPlanDeCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
  }

}
