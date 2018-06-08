package model.pojos;

/**
 *
 * @author Deklok
 */
public class Planeacion {
  private Integer idPlaneacion;
  private String fechas;
  private String temas;
  private Integer unidad;
  private String tecnicasDidacticas;
  private Integer idPlanDeCurso;

  public Planeacion() {
  }

  public Planeacion(Integer idPlaneacion, String fechas, String temas, Integer unidad, String tecnicasDidacticas,
      Integer idPlanDeCurso) {
    this.idPlaneacion = idPlaneacion;
    this.fechas = fechas;
    this.temas = temas;
    this.unidad = unidad;
    this.tecnicasDidacticas = tecnicasDidacticas;
    this.idPlanDeCurso = idPlanDeCurso;
  }

  public Planeacion(String fechas, String temas, Integer unidad, String tecnicasDidacticas) {
    this.fechas = fechas;
    this.temas = temas;
    this.unidad = unidad;
    this.tecnicasDidacticas = tecnicasDidacticas;
  }

  public Integer getIdPlaneacion() {
    return idPlaneacion;
  }

  public void setIdPlaneacion(Integer idPlaneacion) {
    this.idPlaneacion = idPlaneacion;
  }

  public String getFechas() {
    return fechas;
  }

  public void setFechas(String fechas) {
    this.fechas = fechas;
  }

  public String getTemas() {
    return temas;
  }

  public void setTemas(String temas) {
    this.temas = temas;
  }

  public Integer getUnidad() {
    return unidad;
  }

  public void setUnidad(Integer unidad) {
    this.unidad = unidad;
  }

  public String getTecnicasDidacticas() {
    return tecnicasDidacticas;
  }

  public void setTecnicasDidacticas(String tecnicasDidacticas) {
    this.tecnicasDidacticas = tecnicasDidacticas;
  }

  public Integer getIdPlanDeCurso() {
    return idPlanDeCurso;
  }

  public void setIdPlanDeCurso(Integer idPlanDeCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
  }

}
