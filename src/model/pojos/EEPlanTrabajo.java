package model.pojos;

/**
 *
 * @author Deklok
 */
public class EEPlanTrabajo {
    private Integer idEEPlanTrabajo;
    private String nombre;
    private String herramientas;
    private Integer idPlanDeTrabajo;

    public EEPlanTrabajo() {
    }

    public EEPlanTrabajo(Integer idEEPlanTrabajo, String nombre, String herramientas, Integer idPlanDeTrabajo) {
        this.idEEPlanTrabajo = idEEPlanTrabajo;
        this.nombre = nombre;
        this.herramientas = herramientas;
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }

    public Integer getIdEEPlanTrabajo() {
        return idEEPlanTrabajo;
    }

    public void setIdEEPlanTrabajo(Integer idEEPlanTrabajo) {
        this.idEEPlanTrabajo = idEEPlanTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }

    public Integer getIdPlanDeTrabajo() {
        return idPlanDeTrabajo;
    }

    public void setIdPlanDeTrabajo(Integer idPlanDeTrabajo) {
        this.idPlanDeTrabajo = idPlanDeTrabajo;
    }
    
    
}
