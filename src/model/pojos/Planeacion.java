package model.pojos;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Daniel Escamilla Cortés
 * @version 1.0
 */
public class Planeacion {
  private Integer idPlaneacion;
  private SimpleStringProperty fechas = new SimpleStringProperty();
  private SimpleStringProperty temas = new SimpleStringProperty();
  private SimpleIntegerProperty unidad = new SimpleIntegerProperty();
  private SimpleStringProperty tecnicasDidacticas = new SimpleStringProperty();
  private Integer idPlanDeCurso;

    /**
    * Constructor por default de la clase Planeacion.
    */  
  public Planeacion() {
  }

    /**
    * Constructor de la clase con todos sus atributos.
    * @param idPlaneacion Corresponde al identificador del objeto.
    * @param fechas Corresponde a las fechas que estand destinadas para la planeacion.
    * @param temas Corresponde a los temas que abarca la evaluación.
    * @param unidad Corresponde a la unidad de la cual es parte la planeacion.
    * @param tecnicasDidacticas Corresponde a las tecnicas que se utilizan para
    * planeacion.
    * @param idPlanDeCurso Corresponde al identificador del Plan de Curso 
    * asociado a la planeacion.
    */  
  public Planeacion(Integer idPlaneacion, String fechas, String temas, Integer unidad, String tecnicasDidacticas,
      Integer idPlanDeCurso) {
    this.idPlaneacion = idPlaneacion;
    this.fechas = new SimpleStringProperty(fechas);
    this.temas = new SimpleStringProperty(temas);
    this.unidad = new SimpleIntegerProperty(unidad);
    this.tecnicasDidacticas = new SimpleStringProperty(tecnicasDidacticas);
    this.idPlanDeCurso = idPlanDeCurso;
  }

    /**
    * Constructor de la clase con solo algunos de sus atributos.
    * @param fechas Corresponde a las fechas que estand destinadas para la planeacion.
    * @param temas Corresponde a los temas que abarca la evaluación.
    * @param unidad Corresponde a la unidad de la cual es parte la planeacion.
    * @param tecnicasDidacticas Corresponde a las tecnicas que se utilizan para
    * planeacion.
    */  
  public Planeacion(String fechas, String temas, Integer unidad, String tecnicasDidacticas) {
    this.fechas = new SimpleStringProperty(fechas);
    this.temas = new SimpleStringProperty(temas);
    this.unidad = new SimpleIntegerProperty(unidad);
    this.tecnicasDidacticas = new SimpleStringProperty(tecnicasDidacticas);
  }

  /**
   *Retorna el identificador del objeto
   * @return idPlaneacion
   */
  public Integer getIdPlaneacion() {
    return idPlaneacion;
  }

  /**
   *Establece el identificador de la planeacion.
   * @param idPlaneacion Corresponde al identificador de la planeacion.
   */
  public void setIdPlaneacion(Integer idPlaneacion) {
    this.idPlaneacion = idPlaneacion;
  }

    /**
   *Retorna las fechas que hay dentro de la planeacion
   * @return fechas
   */
  public String getFechas() {
    return fechas.get();
  }

  /**
   *Establece las fechas en las que se lleva a cabo la planeacion.
   * @param fechas Corresponde a las fechas que abarca la planeacion.
   */
  public void setFechas(String fechas) {
    this.fechas = new SimpleStringProperty(fechas);
  }

    /**
   *Retorna los temas de la Planeacion
   * @return temas
   */
  public String getTemas() {
    return temas.get();
  }

  /**
   *Establece los temas que cubre la planeacion
   * @param temas Corresponde a los temas que abarca la planeacion.
   */
  public void setTemas(String temas) {
    this.temas = new SimpleStringProperty(temas);
  }

    /**
   *Retorna la unidad a la que pertenece la Planeacion
   * @return unidad
   */
  public Integer getUnidad() {
    return unidad.get();
  }

  /**
   *Establece la unidad de la que es parte la planeacion.
   * @param unidad Corresponde a la unidad a la que pertenece la planeacion.
   */
  public void setUnidad(Integer unidad) {
    this.unidad = new SimpleIntegerProperty(unidad);
  }

    /**
   *Retorna las tecnicas didacticas que pertenecen a la planeacion.
   * @return tecnicasDidacticas
   */
  public String getTecnicasDidacticas() {
    return tecnicasDidacticas.get();
  }

  /**
   *Establece las tecnicas didacticas que contiene
   * @param tecnicasDidacticas Corresponde a las tecnicas didacticas que estan
   * dentro de la planeacion.
   */
  public void setTecnicasDidacticas(String tecnicasDidacticas) {
    this.tecnicasDidacticas = new SimpleStringProperty(tecnicasDidacticas);
  }

    /**
   *Retorna el identificador del plan de curso al que pertenece la planeacion.
   * @return idPlanDeCurso
   */
  public Integer getIdPlanDeCurso() {
    return idPlanDeCurso;
  }

    /**
   *Establece el identificador del plan de curso al que pertence la planeacion.
   * @param idPlanDeCurso Corresponde al identificador del plan de curso al que
   * pertenece la planeacion.
   */
  public void setIdPlanDeCurso(Integer idPlanDeCurso) {
    this.idPlanDeCurso = idPlanDeCurso;
  }

}
