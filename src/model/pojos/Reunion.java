package model.pojos;

import java.util.Date;

/**
 *
 * @author Deklok
 */
public class Reunion {
    private Integer idReunion;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private String informacionAdicional;
    private String lugar;
    private Integer idMinutaAcademia;

    public Reunion() {
    }

    public Reunion(Integer idReunion, String nombre, Date fechaInicio, Date fechaFin, String informacionAdicional, String lugar, Integer idMinutaAcademia) {
        this.idReunion = idReunion;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.informacionAdicional = informacionAdicional;
        this.lugar = lugar;
        this.idMinutaAcademia = idMinutaAcademia;
    }

    public Integer getIdReunion() {
        return idReunion;
    }

    public void setIdReunion(Integer idReunion) {
        this.idReunion = idReunion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Integer getIdMinutaAcademia() {
        return idMinutaAcademia;
    }

    public void setIdMinutaAcademia(Integer idMinutaAcademia) {
        this.idMinutaAcademia = idMinutaAcademia;
    }
    
    
}
