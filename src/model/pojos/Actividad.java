package model.pojos;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Daniel Escamilla Cortés
 */
public class Actividad {
    private Integer idActividad;
    private SimpleStringProperty accion = new SimpleStringProperty();
    private SimpleStringProperty fecha = new SimpleStringProperty();
    private SimpleStringProperty formaDeOperar = new SimpleStringProperty();
    private Integer idObjetivoParticular;

    public Actividad() {
    }

    public Actividad(String accion, String fecha, String formaDeOperar) {
        this.accion = new SimpleStringProperty(accion);
        this.fecha = new SimpleStringProperty(fecha);
        this.formaDeOperar = new SimpleStringProperty(formaDeOperar);
    }

    public Actividad(Integer idActividad, String accion, String fecha, String formaDeOperar, Integer idObjetivoParticular) {
        this.idActividad = idActividad;
        this.accion = new SimpleStringProperty(accion);
        this.fecha = new SimpleStringProperty(fecha);
        this.formaDeOperar = new SimpleStringProperty(formaDeOperar);
        this.idObjetivoParticular = idObjetivoParticular;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getAccion() {
        return accion.get();
    }

    public void setAccion(String accion) {
        this.accion = new SimpleStringProperty(accion);
    }

    public String getFecha() {
        return fecha.get();
    }

    public void setFecha(String fecha) {
        this.fecha = new SimpleStringProperty(fecha);
    }

    public String getFormaDeOperar() {
        return formaDeOperar.get();
    }

    public void setFormaDeOperar(String formaDeOperar) {
        this.formaDeOperar = new SimpleStringProperty(formaDeOperar);
    }

    public Integer getIdObjetivoParticular() {
        return idObjetivoParticular;
    }

    public void setIdObjetivoParticular(Integer idObjetivoParticular) {
        this.idObjetivoParticular = idObjetivoParticular;
    }
    
    
}
