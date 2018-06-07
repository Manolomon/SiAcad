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

  public Evaluacion() {
  }

    public Evaluacion(Integer idEvaluacion, Integer porcentaje, String instrumento, Integer idPlanDeTrabajo) {
        this.idEvaluacion = idEvaluacion;
        this.porcentaje = porcentaje;
        this.instrumento = instrumento;
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }

    public Integer getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Integer idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public Integer getIdPlanDeTrabajo() {
        return idPlanDeTrabajo;
    }

    public void setIdPlanDeTrabajo(Integer idPlanDeTrabajo) {
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }

  
}
