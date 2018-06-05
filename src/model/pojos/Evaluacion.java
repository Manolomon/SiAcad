package model.pojos;

/**
 *
 * @author Deklok
 */
public class Evaluacion {
  private Integer idEvaluacion;
  private Integer unidad;
  private String fechas;
  private String tecnicasDidacticas;
  private String temas;
  private Integer idPlanDeTrabajo;
  private Integer idPlanDeCurso;

  public Evaluacion() {
  }

  public Evaluacion(Integer idEvaluacion, Integer unidad, String fechas, String tecnicasDidacticas, String temas,
      Integer idPlanDeTrabajo, Integer idPlanDeCurso) {
    this.idEvaluacion = idEvaluacion;
    this.unidad = unidad;
    this.fechas = fechas;
    this.tecnicasDidacticas = tecnicasDidacticas;
    this.temas = temas;
    this.idPlanDeTrabajo = idPlanDeTrabajo;
    this.idPlanDeCurso = idPlanDeCurso;
  }

  public Integer getIdEvaluacion() {
    return idEvaluacion;
  }

  public void setIdEvaluacion(Integer idEvaluacion) {
    this.idEvaluacion = idEvaluacion;
  }

  public Integer getUnidad() {
    return unidad;
  }

  public void setUnidad(Integer unidad) {
    this.unidad = unidad;
  }

  public String getFechas() {
    return fechas;
  }

  public void setFechas(String fechas) {
    this.fechas = fechas;
  }

  public String getTecnicasDidacticas() {
    return tecnicasDidacticas;
  }

  public void setTecnicasDidacticas(String tecnicasDidacticas) {
    this.tecnicasDidacticas = tecnicasDidacticas;
  }

  public String getTemas() {
    return temas;
  }

  public void setTemas(String temas) {
    this.temas = temas;
  }

  public Integer getIdPlanDeTrabajo() {
    return idPlanDeTrabajo;
  }

  public void setIdPlanDeTrabajo(Integer idPlanDeTrabajo) {
    this.idPlanDeTrabajo = idPlanDeTrabajo;
  }

  public Integer getIdPlanDeCurso() {
    return idPlanDeCurso;
  }

  public void setIdPlanDeCurso(Integer idPlanDeCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
  }

}
