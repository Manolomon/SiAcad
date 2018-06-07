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

    public MinutaDeAcademia() {
    }

    public MinutaDeAcademia(Integer idReunion, Date fecha, String hora, String objetivo, String temas, String conclusiones) {
        this.idReunion = idReunion;
        this.fecha = fecha;
        this.hora = hora;
        this.objetivo = objetivo;
        this.temas = temas;
        this.conclusiones = conclusiones;
    }

    public Integer getIdMinutaDeAcademia() {
        return idMinutaDeAcademia;
    }

    public void setIdMinutaDeAcademia(Integer idMinutaDeAcademia) {
        this.idMinutaDeAcademia = idMinutaDeAcademia;
    }

    public Integer getIdReunion() {
        return idReunion;
    }

    public void setIdReunion(Integer idReunion) {
        this.idReunion = idReunion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getTemas() {
        return temas;
    }

    public void setTemas(String temas) {
        this.temas = temas;
    }

    public String getConclusiones() {
        return conclusiones;
    }

    public void setConclusiones(String conclusiones) {
        this.conclusiones = conclusiones;
    }
    
    
}
