package model.pojos;

import java.util.Date;

/**
 *
 * @author Daniel Escamilla Cortés
 */
public class PlanDeTrabajo {
    private Integer idPlanDetrabajo;
    private String formato;
    private Date fechaAprobacion;
    private String objetivoGeneral;
    private String programaEducativo;

    public PlanDeTrabajo() {
    }

    public PlanDeTrabajo(Integer idPlanDetrabajo, String formato, Date fechaAprobacion, String objetivoGeneral, String programaEducativo) {
        this.idPlanDetrabajo = idPlanDetrabajo;
        this.formato = formato;
        this.fechaAprobacion = fechaAprobacion;
        this.objetivoGeneral = objetivoGeneral;
        this.programaEducativo = programaEducativo;
    }

    public Integer getIdPlanDetrabajo() {
        return idPlanDetrabajo;
    }

    public void setIdPlanDetrabajo(Integer idPlanDetrabajo) {
        this.idPlanDetrabajo = idPlanDetrabajo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public String getProgramaEducativo() {
        return programaEducativo;
    }

    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }
    
    
}
