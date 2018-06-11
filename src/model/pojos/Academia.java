package model.pojos;

/**
 *
 * @author Daniel Escamilla Cortés
 */
public class Academia {
  private Integer idAcademia;
  private String nombre;
  private String coordinador;

  /**
    * Constructor por defecto de la clase
    */
  public Academia() {
  }

  /**
    * Constructor de la clase con todos sus atributos
    * @param idAcademia identificador del objeto
    * @param nombre nombre que tiene la academia
    * @param coordinador coordinador de la academia
    */
  public Academia(Integer idAcademia, String nombre, String coordinador) {
    this.idAcademia = idAcademia;
    this.nombre = nombre;
    this.coordinador = coordinador;
  }

  /**
    * Retorna el identificador de la academia
    * @return idAcademia
    */
  public Integer getIdAcademia() {
    return idAcademia;
  }

  /**
    * Establece el identificador de la academia
    * @param idAcademia
    */
  public void setIdAcademia(Integer idAcademia) {
    this.idAcademia = idAcademia;
  }

  /**
    * Retorna el nombre de la academia
    * @return nombre
    */
  public String getNombre() {
    return nombre;
  }

  /**
    * Establece el nombre de la academia
    * @param nombre
    */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
    * Retorna el coordinador de la academia
    * @return coordinador
    */
  public String getCoordinador() {
    return coordinador;
  }

  /**
    * Establece el coordinador de la academia
    * @param coordinador
    */
  public void setCoordinador(String coordinador) {
    this.coordinador = coordinador;
  }

}
