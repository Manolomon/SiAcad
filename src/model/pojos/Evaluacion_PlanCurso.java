package model.pojos;

/**
 *
 * @author Deklok
 */
public class Evaluacion_PlanCurso {
    private Integer idEvaluacionP;
    private Integer unidad;
    private String criterioDeEvaluacion;
    private Integer porcentaje;
    private String fechas;
    private Integer idPlanDeCurso;

    public Evaluacion_PlanCurso() {
    }

    
    
    public Evaluacion_PlanCurso(Integer idEvaluacionP, Integer unidad, String criterioDeEvaluacion, Integer porcentaje, String fechas, Integer idPlanDeCurso) {
        this.idEvaluacionP = idEvaluacionP;
        this.unidad = unidad;
        this.criterioDeEvaluacion = criterioDeEvaluacion;
        this.porcentaje = porcentaje;
        this.fechas = fechas;
        this.idPlanDeCurso = idPlanDeCurso;
    }

    public Integer getIdEvaluacionP() {
        return idEvaluacionP;
    }

    public void setIdEvaluacionP(Integer idEvaluacionP) {
        this.idEvaluacionP = idEvaluacionP;
    }

    public Integer getUnidad() {
        return unidad;
    }

    public void setUnidad(Integer unidad) {
        this.unidad = unidad;
    }

    public String getCriterioDeEvaluacion() {
        return criterioDeEvaluacion;
    }

    public void setCriterioDeEvaluacion(String criterioDeEvaluacion) {
        this.criterioDeEvaluacion = criterioDeEvaluacion;
    }

    public Integer getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Integer porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getFechas() {
        return fechas;
    }

    public void setFechas(String fechas) {
        this.fechas = fechas;
    }

    public Integer getIdPlanDeCurso() {
        return idPlanDeCurso;
    }

    public void setIdPlanDeCurso(Integer idPlanDeCurso) {
        this.idPlanDeCurso = idPlanDeCurso;
    }
    
    
}
