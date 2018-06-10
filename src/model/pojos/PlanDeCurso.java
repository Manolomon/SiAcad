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

  /**
   *Constructor por default de la clase 
   */
  public PlanDeCurso() {
  }

   /**
   *Constructor de la clase con todos sus atributos.
   * @param idPlanDeCurso Corresponde al identificador del objeto.
   * @param formato es el tipo de formato del objeto, en este caso es un
   * plan de curso.
   * @param fecha Corresponde a la fecha en la que se creó el objeto.
   * @param objetivoGeneral Corresponde a un solo objetivo general que es parte
   * del documento.
   * @param idCurso Corresponde al identificador del curso al que pertenece el
   * plan de curso.
   */
  public PlanDeCurso(Integer idPlanDeCurso, String formato, String objetivoGeneral, Date fecha,Integer idCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
    this.formato = formato;
    this.objetivoGeneral = objetivoGeneral;
    this.fecha = fecha;
    this.idCurso = idCurso;
  }

  /**
    *Retorna el identificador del plan de curso.
    * @return idPlanDeCurso
    */
  public Integer getIdPlanDeCurso() {
    return idPlanDeCurso;
  }

  /**
    *Establece el identificador del  plan de curso.
    * @param idPlanDeCurso Corresponde al identificador del plan de curso.
    */
  public void setIdPlanDeCurso(Integer idPlanDeCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
  }

  /**
    *Retorna el formato del plan de curso.
    * @return formato
    */
  public String getFormato() {
    return formato;
  }

  /**
    *Establece el formato del plan de curso.
    * @param formato Corresponde al formato del plan de curso.
    */
  public void setFormato(String formato) {
    this.formato = formato;
  }

  /**
    *Retorna el objetivo general del plan de curso.
    * @return objetivoGeneral
    */
  public String getObjetivoGeneral() {
    return objetivoGeneral;
  }

  /**
    * Establece el objetivo general del plan de curso.
    * @param objetivoGeneral Corresponde al objetivo general del plan de curso.
    */
  public void setObjetivoGeneral(String objetivoGeneral) {
    this.objetivoGeneral = objetivoGeneral;
  }

  /**
    *Retorna la fecha de creación del plan de curso.
    * @return fecha
    */
  public Date getFecha() {
    return fecha;
  }

  /**
    *Establece la fecha de creacion del plan de curso.
    * @param fecha Corresponde a la fecha de creacion del plan de curso.
    */
  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  /**
    *Retorna el identificador del curso que está ligado al plan de curso.
    * @return idCurso
    */
  public Integer getIdCurso() {
    return idCurso;
  }

  /**
    *Establece el identificador del curso asociado al plan de curso.
    * @param idCurso Corresponde al identificador del curso asociado al plan 
    * de curso.
    */
  public void setIdCurso(Integer idCurso) {
    this.idCurso = idCurso;
  }

}
