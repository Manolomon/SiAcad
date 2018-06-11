package model.pojos;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Daniel Escamilla Cortés
 * @version 1.0
 */
public class Evaluacion_PlanCurso {
  private Integer idEvaluacionP;
  private SimpleIntegerProperty unidad = new SimpleIntegerProperty();
  private SimpleStringProperty criterioDeEvaluacion = new SimpleStringProperty();
  private SimpleIntegerProperty porcentaje = new SimpleIntegerProperty();
  private SimpleStringProperty fechas = new SimpleStringProperty();
  private Integer idPlanDeCurso;

  /**
    * Constructor por default de la clase
    */
  public Evaluacion_PlanCurso() {
  }

  /**
    * Constructor de la clase con todos sus atributos
    * @param idEvaluacionP identificador del objeto
    * @param unidad la unidad en la que se encuentra la evaluacion
    * @param criterioDeEvaluacion el criterio con el que se realiza la evaluacion
    * @param porcentaje el porcentaje de valor de la evaluacion
    * @param fechas las fechas de disponibilidad de la evaluacion
    * @param idPlanDeCurso el identificador del plan de curso al que esta ligado
    */
  public Evaluacion_PlanCurso(Integer idEvaluacionP, Integer unidad, String criterioDeEvaluacion, Integer porcentaje,
      String fechas, Integer idPlanDeCurso) {
    this.idEvaluacionP = idEvaluacionP;
    this.unidad = new SimpleIntegerProperty(unidad);
    this.criterioDeEvaluacion = new SimpleStringProperty(criterioDeEvaluacion);
    this.porcentaje = new SimpleIntegerProperty(porcentaje);
    this.fechas = new SimpleStringProperty(fechas);
    this.idPlanDeCurso = idPlanDeCurso;
  }

  /**
    * Constructor de la clase con algunos de sus atributos
    * @param unidad la unidad en la que se encuentra la evaluacion
    * @param criterioDeEvaluacion el criterio con el que se realiza la evaluacion
    * @param porcentaje el porcentaje de valor de la evaluacion
    * @param fechas las fechas de disponibilidad de la evaluacion
    */
  public Evaluacion_PlanCurso(Integer unidad, String criterioDeEvaluacion, Integer porcentaje, String fechas) {
    this.unidad = new SimpleIntegerProperty(unidad);
    this.criterioDeEvaluacion = new SimpleStringProperty(criterioDeEvaluacion);
    this.porcentaje = new SimpleIntegerProperty(porcentaje);
    this.fechas = new SimpleStringProperty(fechas);
  }

  /**
    * Retorna el identificador del objeto
    * @return  idEvaluacionP
    */
  public Integer getIdEvaluacionP() {
    return idEvaluacionP;
  }

  /**
    * Establece el identificador del objeto
    * @param idEvaluacionP
    */
  public void setIdEvaluacionP(Integer idEvaluacionP) {
    this.idEvaluacionP = idEvaluacionP;
  }

  /**
    * Retorna la unidad a la que pertenece la evaluacion
    * @return  unidad
    */
  public Integer getUnidad() {
    return unidad.get();
  }

  /**
    * Establece la unidad a la que pertenece la evaluacion
    * @param unidad
    */
  public void setUnidad(Integer unidad) {
    this.unidad = new SimpleIntegerProperty(unidad);
  }

  /**
    * Retorna el criterio de evaluacion que tiene la evaluacion 
    * @return  criterioDeEvaluacion
    */
  public String getCriterioDeEvaluacion() {
    return criterioDeEvaluacion.get();
  }

  /**
    * Establece el criterio de evaluacion que tiene la evaluacion 
    * @param criterioDeEvaluacion
    */
  public void setCriterioDeEvaluacion(String criterioDeEvaluacion) {
    this.criterioDeEvaluacion = new SimpleStringProperty(criterioDeEvaluacion);
  }

  /**
    * Retorna el porcentaje de valor que tiene la evaluacion 
    * @return  porcentaje
    */
  public Integer getPorcentaje() {
    return porcentaje.get();
  }

  /**
    * Establece el porcentaje de valor que tiene la evaluacion 
    * @param porcentaje
    */
  public void setPorcentaje(Integer porcentaje) {
    this.porcentaje = new SimpleIntegerProperty(porcentaje);
  }

  /**
    * Retorna las fechas que estará la evaluacion 
    * @return  fechas
    */
  public String getFechas() {
    return fechas.get();
  }

  /**
    * Establece las fechas que estará la evaluacion 
    * @param fechas
    */
  public void setFechas(String fechas) {
    this.fechas = new SimpleStringProperty(fechas);
  }

  /**
    * Retorna el identificador de plan de curso al que se asocia la evaluacion.
    * @return  idPlanDeCurso
    */
  public Integer getIdPlanDeCurso() {
    return idPlanDeCurso;
  }

  /**
    * Establece el identificador de plan de curso al que se asocia la evaluacion.
    * @param idPlanDeCurso
    */
  public void setIdPlanDeCurso(Integer idPlanDeCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
  }

}
