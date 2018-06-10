package model.pojos;

/**
 *
 * @author Daniel Escamilla Cortés
 * @version 1.0
 */
public class Tema {
  private Integer idTema;
  private String primerParcial;
  private String segundoParcial;
  private String resto;
  private Integer idEEPlanDeTrabajo;

  public Tema() {
  }
  /**
 * El constructor de la clase Tema.
 * @param  idTema corresponde al identificador de la instancia en un numero entero.
 * @param primerParcial palabras referentes al primer parcial.
 * @param segundoParcial palabras referentes al segundo parcial.
 * @param resto se refiere al resto de temas que no se cubren.
 * @param idEEPlanDeTrabajo corresponde al identificador del Plan de Trabajo que se quiere ligar a este tema.
 */
  public Tema(Integer idTema, String primerParcial, String segundoParcial, String resto, Integer idEEPlanDeTrabajo) {
    this.idTema = idTema;
    this.primerParcial = primerParcial;
    this.segundoParcial = segundoParcial;
    this.resto = resto;
    this.idEEPlanDeTrabajo = idEEPlanDeTrabajo;
  }
  
/**
 * Retorna el valor de la variable idTema.
 * @return idTema.
 */
  public Integer getIdTema() {
    return idTema;
  }

  /**
 * Reescribe el valor de la variable idTema con una variable externa.
 * @param idTema el valor del identificador del objeto.
 */
  public void setIdTema(Integer idTema) {
    this.idTema = idTema;
  }

  /**
 * Retorna el valor de la variable primerParcial.
 * @return primerParcial.
 */
  public String getPrimerParcial() {
    return primerParcial;
  }

  /**
 * Se reasigna el valor de la variable primerParcial con una variable externa.
 * @param primerParcial Corresponde a las palabras referentes al primer parcial.
 */
  public void setPrimerParcial(String primerParcial) {
    this.primerParcial = primerParcial;
  }

  /**
 * Retorna el valor de la variable segundoParcial.
 * @return segundoParcial.
 */
  public String getSegundoParcial() {
    return segundoParcial;
  }

   /**
 * Se reasigna el valor de la variable segundoParcial con una variable externa.
 * @param segundoParcial Corresponde a la spalabras referentes al segundo parcial.
 */
  public void setSegundoParcial(String segundoParcial) {
    this.segundoParcial = segundoParcial;
  }

  /**
 * Retorna el valor de la variable resto.
 * @return resto.
 */
  public String getResto() {
    return resto;
  }

   /**
 * Se reasigna el valor de la variable resto con una variable externa.
 * @param resto Corresponde al resto de temas . 
 */
  public void setResto(String resto) {
    this.resto = resto;
  }

  /**
 * Retorna el valor de la variable idEEPlanDeTrabajo.
 * @return idEEPlanDeTrabajo.
 */
  public Integer getIdEEPlanDeTrabajo() {
    return idEEPlanDeTrabajo;
  }

   /**
 * Se reasigna el valor de la variable idEEPlanDeTrabajo con una variable externa.
 * @param idEEPlanDeTrabajo Corresponde a la id del pLAN DE trabajo con la que se quiere asociar este tema.
 */
  public void setIdEEPlanDeTrabajo(Integer idEEPlanDeTrabajo) {
    this.idEEPlanDeTrabajo = idEEPlanDeTrabajo;
  }

}
