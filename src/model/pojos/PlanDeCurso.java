package model.pojos;

import java.util.Date;

/**
 *
 * @author Deklok
 */
public class PlanDeCurso {
  private Integer idPlanDeCurso;
  private String formato;
  private String objetivoGeneral;
  private Date fecha;
  private Integer idCurso;

  public PlanDeCurso() {
  }

  public PlanDeCurso(Integer idPlanDeCurso, String formato, String objetivoGeneral, Date fecha,Integer idCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
    this.formato = formato;
    this.objetivoGeneral = objetivoGeneral;
    this.fecha = fecha;
    this.idCurso = idCurso;
  }

  public Integer getIdPlanDeCurso() {
    return idPlanDeCurso;
  }

  public void setIdPlanDeCurso(Integer idPlanDeCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
  }

  public String getFormato() {
    return formato;
  }

  public void setFormato(String formato) {
    this.formato = formato;
  }

  public String getObjetivoGeneral() {
    return objetivoGeneral;
  }

  public void setObjetivoGeneral(String objetivoGeneral) {
    this.objetivoGeneral = objetivoGeneral;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public Integer getIdCurso() {
    return idCurso;
  }

  public void setIdCurso(Integer idCurso) {
    this.idCurso = idCurso;
  }

}
