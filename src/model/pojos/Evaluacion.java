package model.pojos;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Deklok
 */
public class Evaluacion {
  private Integer idEvaluacion;
  private SimpleIntegerProperty porcentaje = new SimpleIntegerProperty();
  private SimpleStringProperty instrumento = new SimpleStringProperty();
  private Integer idEEPlanTrabajo;

  /**
    * Constructor por default de la clase
    */
  public Evaluacion() {
  }

  public Evaluacion(Integer porcentaje, String instrumento) {
    this.porcentaje = new SimpleIntegerProperty(porcentaje);
    this.instrumento = new SimpleStringProperty(instrumento);
}

  /**
    * Constructor de la clase con todos sus atributos
    * @param idEvaluacion identificador del objeto
    * @param porcentaje el valor de la evaluacion
    * @param instrumento el instrumento que se utiliza para la evaluacion
    * @param idPlanDeTrabajo identificador del plan de trabajo al que esta asociada la evaluacion
    */
    public Evaluacion(Integer idEvaluacion, Integer porcentaje, String instrumento, Integer idPlanDeTrabajo) {
        this.idEvaluacion = idEvaluacion;
        this.porcentaje = new SimpleIntegerProperty(porcentaje);
        this.instrumento = new SimpleStringProperty(instrumento);
        this.idEEPlanTrabajo = idPlanDeTrabajo;
    }

    /**
    * Retorna el identificador de la evaluacion
    * @return idEvaluacion
    */
    public Integer getIdEvaluacion() {
        return idEvaluacion;
    }

    /**
    * Establece el identificador de la evaluacion
    * @param idEvaluacion
    */
    public void setIdEvaluacion(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    /**
    * Retorna el porcentaje de la evaluacion
    * @return porcentaje
    */
    public Integer getPorcentaje() {
        return porcentaje.get();
    }

    /**
    * Establece el porcentaje de la evaluacion
    * @param porcentaje
    */
    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = new SimpleIntegerProperty(porcentaje);
    }

    /**
    * Retorna el instrumento de  evaluacion
    * @return instrumento
    */
    public String getInstrumento() {
        return instrumento.get();
    }

    /**
    * Establece el instrumento de  evaluacion
    * @param instrumento
    */
    public void setInstrumento(String instrumento) {
        this.instrumento = new SimpleStringProperty(instrumento);
    }

    public Integer getIdEEPlanTrabajo() {
        return idEEPlanTrabajo;
    }

    public void setIdEEPlanTrabajo(Integer idEEPlanTrabajo) {
        this.idEEPlanTrabajo = idEEPlanTrabajo;
    }

    

  
}
