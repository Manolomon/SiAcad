package model.pojos;

/**
 *
 * @author Deklok
 */
public class Evaluacion {
  private Integer idEvaluacion;
  private Integer porcentaje;
  private String instrumento;
  private Integer idPlanDeTrabajo;

  /**
    * Constructor por default de la clase
    */
  public Evaluacion() {
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
        this.porcentaje = porcentaje;
        this.instrumento = instrumento;
        this.idPlanDeTrabajo = idPlanDeTrabajo;
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
        return porcentaje;
    }

    /**
    * Establece el porcentaje de la evaluacion
    * @param porcentaje
    */
    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
    * Retorna el instrumento de  evaluacion
    * @return instrumento
    */
    public String getInstrumento() {
        return instrumento;
    }

    /**
    * Establece el instrumento de  evaluacion
    * @param instrumento
    */
    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    /**
    * Retorna el identificador del plan de trabajo asociado a la evaluacion
    * @return idPlanDeTrabajo
    */
    public Integer getIdPlanDeTrabajo() {
        return idPlanDeTrabajo;
    }

    /**
    * Establece el identificador del plan de trabajo asociado a la evaluacion
    * @param idPlanDeTrabajo
    */
    public void setIdPlanDeTrabajo(Integer idPlanDeTrabajo) {
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }

  
}
