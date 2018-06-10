package model.pojos;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Deklok
 */
public class Evaluacion_PlanCurso {
  private Integer idEvaluacionP;
  private SimpleIntegerProperty unidad = new SimpleIntegerProperty();
  private SimpleStringProperty criterioDeEvaluacion = new SimpleStringProperty();
  private SimpleIntegerProperty porcentaje = new SimpleIntegerProperty();
  private SimpleStringProperty fechas = new SimpleStringProperty();
  private Integer idPlanDeCurso;

  public Evaluacion_PlanCurso() {
  }

  public Evaluacion_PlanCurso(Integer idEvaluacionP, Integer unidad, String criterioDeEvaluacion, Integer porcentaje,
      String fechas, Integer idPlanDeCurso) {
    this.idEvaluacionP = idEvaluacionP;
    this.unidad = new SimpleIntegerProperty(unidad);
    this.criterioDeEvaluacion = new SimpleStringProperty(criterioDeEvaluacion);
    this.porcentaje = new SimpleIntegerProperty(porcentaje);
    this.fechas = new SimpleStringProperty(fechas);
    this.idPlanDeCurso = idPlanDeCurso;
  }

  public Evaluacion_PlanCurso(Integer unidad, String criterioDeEvaluacion, Integer porcentaje, String fechas) {
    this.unidad = new SimpleIntegerProperty(unidad);
    this.criterioDeEvaluacion = new SimpleStringProperty(criterioDeEvaluacion);
    this.porcentaje = new SimpleIntegerProperty(porcentaje);
    this.fechas = new SimpleStringProperty(fechas);
  }

  public Integer getIdEvaluacionP() {
    return idEvaluacionP;
  }

  public void setIdEvaluacionP(Integer idEvaluacionP) {
    this.idEvaluacionP = idEvaluacionP;
  }

  public Integer getUnidad() {
    return unidad.get();
  }

  public void setUnidad(Integer unidad) {
    this.unidad = new SimpleIntegerProperty(unidad);
  }

  public String getCriterioDeEvaluacion() {
    return criterioDeEvaluacion.get();
  }

  public void setCriterioDeEvaluacion(String criterioDeEvaluacion) {
    this.criterioDeEvaluacion = new SimpleStringProperty(criterioDeEvaluacion);
  }

  public Integer getPorcentaje() {
    return porcentaje.get();
  }

  public void setPorcentaje(Integer porcentaje) {
    this.porcentaje = new SimpleIntegerProperty(porcentaje);
  }

  public String getFechas() {
    return fechas.get();
  }

  public void setFechas(String fechas) {
    this.fechas = new SimpleStringProperty(fechas);
  }

  public Integer getIdPlanDeCurso() {
    return idPlanDeCurso;
  }

  public void setIdPlanDeCurso(Integer idPlanDeCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
  }

}
