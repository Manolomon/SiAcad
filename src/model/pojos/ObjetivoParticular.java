package model.pojos;

/**
 *
 * @author Daniel Escamilla Cortés
 */
public class ObjetivoParticular {
    private Integer idObjetivoParticular;
    private String objetivo;
    private String metas;
    private Integer idPlanDeTrabajo;

    public ObjetivoParticular() {
    }

    public ObjetivoParticular(Integer idObjetivoParticular, String objetivo, String metas, Integer idPlanDeTrabajo) {
        this.idObjetivoParticular = idObjetivoParticular;
        this.objetivo = objetivo;
        this.metas = metas;
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }

    public Integer getIdObjetivoParticular() {
        return idObjetivoParticular;
    }

    public void setIdObjetivoParticular(Integer idObjetivoParticular) {
        this.idObjetivoParticular = idObjetivoParticular;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas;
    }

    public Integer getIdPlanDeTrabajo() {
        return idPlanDeTrabajo;
    }

    public void setIdPlanDeTrabajo(Integer idPlanDeTrabajo) {
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }
    
    
}
