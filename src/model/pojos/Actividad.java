package model.pojos;

/**
 *
 * @author Daniel Escamilla Cortés
 */
public class Actividad {
    private Integer idActividad;
    private String accion;
    private String fecha;
    private String formaDeOperar;
    private Integer idObjetivoParticular;

    public Actividad() {
    }

    public Actividad(Integer idActividad, String accion, String fecha, String formaDeOperar, Integer idObjetivoParticular) {
        this.idActividad = idActividad;
        this.accion = accion;
        this.fecha = fecha;
        this.formaDeOperar = formaDeOperar;
        this.idObjetivoParticular = idObjetivoParticular;
    }

    public Integer getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Integer idActividad) {
        this.idActividad = idActividad;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFormaDeOperar() {
        return formaDeOperar;
    }

    public void setFormaDeOperar(String formaDeOperar) {
        this.formaDeOperar = formaDeOperar;
    }

    public Integer getIdObjetivoParticular() {
        return idObjetivoParticular;
    }

    public void setIdObjetivoParticular(Integer idObjetivoParticular) {
        this.idObjetivoParticular = idObjetivoParticular;
    }
    
    
}
