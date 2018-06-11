package model.pojos;

import java.util.Date;

/**
 *
 * @author Deklok
 */
public class MinutaDeAcademia {
    private Integer idMinutaDeAcademia;
    private Integer idReunion;
    private Date fecha;
    private String hora;
    private String objetivo;
    private String temas;
    private String conclusiones;

    /**
    * Constructor por default del objeto
    */
    public MinutaDeAcademia() {
    }

    /**
    * Constructor del objeto con todos sus atributos
    * @param idReunion identificador del objeto
    * @param fecha la fecha en la cual se realizó el documento
    * @param hora la hora a la que se creó el documento
    * @param objetivo el objetivo de la minuta
    * @param temas los temas que se trataron durante la reunion de la academia
    * @param conclusiones las conclusiones a las que se llegaron 
    */
    public MinutaDeAcademia(Integer idReunion, Date fecha, String hora, String objetivo, String temas, String conclusiones) {
        this.idReunion = idReunion;
        this.fecha = fecha;
        this.hora = hora;
        this.objetivo = objetivo;
        this.temas = temas;
        this.conclusiones = conclusiones;
    }

    /**
    * Retornar el identificador de la minuta de academia
    * @return idMinutaDeAcademia
    */
    public Integer getIdMinutaDeAcademia() {
        return idMinutaDeAcademia;
    }

    /**
    * Establecer el identificador de la minuta de academia
    * @param idMinutaDeAcademia
    */
    public void setIdMinutaDeAcademia(Integer idMinutaDeAcademia) {
        this.idMinutaDeAcademia = idMinutaDeAcademia;
    }

    /**
    * Retornar el identificador de la reunion a la que pertenece la minuta
    * @return idReunion
    */
    public Integer getIdReunion() {
        return idReunion;
    }

    /**
    * Establecer el identificador de la reunion a la que pertenece la minuta
    * @param idReunion
    */
    public void setIdReunion(Integer idReunion) {
        this.idReunion = idReunion;
    }

    /**
    * Retornar la fecha de creacion de .la minuta
    * @return fecha
    */
    public Date getFecha() {
        return fecha;
    }

    /**
    * Establecer la fecha de creacion de .la minuta
    * @param fecha
    */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
    * Retornar la hora de creacion de .la minuta
    * @return hora
    */
    public String getHora() {
        return hora;
    }

    /**
    * Establecer la hora de creacion de .la minuta
    * @param hora
    */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
    * Retornar el objetivo de.la minuta
    * @return objetivo
    */
    public String getObjetivo() {
        return objetivo;
    }

    /**
    * Establecer el objetivo de.la minuta
    * @param objetivo
    */
    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    /**
    * Retornar los temas de.la minuta
    * @return temas
    */
    public String getTemas() {
        return temas;
    }

    /**
    * Establecer los temas de.la minuta
    * @param temas
    */
    public void setTemas(String temas) {
        this.temas = temas;
    }

    /**
    * Retornar las conclusiones de.la minuta
    * @return conclusiones
    */
    public String getConclusiones() {
        return conclusiones;
    }

    /**
    * Establecer las conclusiones de.la minuta
    * @param conclusiones
    */
    public void setConclusiones(String conclusiones) {
        this.conclusiones = conclusiones;
    }
    
    
}
