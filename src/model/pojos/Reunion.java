package model.pojos;

import java.util.Date;

/**
 *
 * @author Daniel Escamilla Cortés 
 * @version 1.0
 */
public class Reunion {
    private Integer idReunion;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String informacionAdicional;
    private String lugar;
    private Integer idMinutaAcademia;
     /**
    * Constructor por default de la clase.
    */
    public Reunion() {
    }
    /**
    * Constructor de la clase con todos sus atributos.
    * @param idReunion Corresponde la identificador en numero entero del objeto.
    * @param nombre Corresponde al nombre que se le quiera asignar a la reunión.
    * @param fechaInicio Corresponde a la fecha en la que da inicio la reunion.
    * @param fechaFin Corresponde a la fecha en la que finaliza la reunión.
    * @param informacionAdicional Corresponde a los comentarios u observaciones
    * que se quieran hacer respecto a la reunión.
    * @param lugar Corresponde a la zona, o lugar especifico donde se llevó a 
    * cabo la reunión.
    * @param idMinutaAcademia Corresponde al identificador de la minuta de 
    * academia que se creará apartir de esta reunion.
    */    
    public Reunion(Integer idReunion, String nombre, Date fechaInicio, Date fechaFin, String informacionAdicional, String lugar, Integer idMinutaAcademia) {
        this.idReunion = idReunion;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.informacionAdicional = informacionAdicional;
        this.lugar = lugar;
        this.idMinutaAcademia = idMinutaAcademia;
    }

     /**
    * Retorna el identificador del objeto.
    * @return idReunion
    */
    public Integer getIdReunion() {
        return idReunion;
    }

    /**
    * Establece el valor para el identificador de la reunion.
    * @param idReunion Corresponde al identificador que tendrá la reunion.
    */
    public void setIdReunion(Integer idReunion) {
        this.idReunion = idReunion;
    }
    
    /**
    * Retorna el nombre que s ele haya otorgado a la reunion.
    * @return nombre
    */
    public String getNombre() {
        return nombre;
    }

    /**
    * Establece el valor para el nombre de la reunion.
    * @param nombre Corresponde al nombre que tendrá la reunion.
    */    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
    * Retorna la fecha en que inició la reunión.
    * @return fechaInicio
    */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
    * Establece el valor para la fecha de inicio de la reunion.
    * @param fechaInicio Corresponde a la fecha de inicio que tendrá la reunion.
    */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
    * Retorna la fecha en que finalizó la reunión.
    * @return fechaFin
    */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
    * Establece el valor para fecha de término de la reunion.
    * @param fechaFin Corresponde a la fecha de término que tendrá la reunion.
    */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
    * Retorna los comentarios u observaciones que se hayan hecho
    * durante la reunion.
    * @return informacionAdicional
    */
    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    /**
    * Establece el valor para la informacion adicional de la reunion.
    * @param infromacionAdicional Corresponde a las observaciones o comentarios que tendrá la reunion.
    */    
    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    /**
    * Retorna el lugar donde se llevó a cabo la reunion.
    * @return lugar
    */
    public String getLugar() {
        return lugar;
    }

    /**
    * Establece el valor para el lugar de la reunion.
    * @param lugar Corresponde al lugar donde se llevó a cabo la reunion.
    */    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    /**
    * Retorna el identificador de la minuta de academia 
    * asociada a la reunion.
    * @return idMinutaAcademia
    */
    public Integer getIdMinutaAcademia() {
        return idMinutaAcademia;
    }

    /**
    * Establece el valor para el identificador de la minuta de academia que se
    * relaciona con lareunion.
    * @param idMinutaAcademia Corresponde al identificador de la minuta de 
    * acadmeia que tendrá la reunion.
    */    
    public void setIdMinutaAcademia(Integer idMinutaAcademia) {
        this.idMinutaAcademia = idMinutaAcademia;
    }
    
    
}
