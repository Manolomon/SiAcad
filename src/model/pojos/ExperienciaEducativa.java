package model.pojos;

/**
 *
 * @author Deklok
 */
public class ExperienciaEducativa {
    private Integer idExperienciaEducativa;
    private String nombre;
    private Integer idAcademia;

    public ExperienciaEducativa() {
    }

    public ExperienciaEducativa(Integer idExperienciaEducativa, String nombre, Integer idAcademia) {
        this.idExperienciaEducativa = idExperienciaEducativa;
        this.nombre = nombre;
        this.idAcademia = idAcademia;
    }

    public Integer getIdExperienciaEducativa() {
        return idExperienciaEducativa;
    }

    public void setIdExperienciaEducativa(Integer idExperienciaEducativa) {
        this.idExperienciaEducativa = idExperienciaEducativa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdAcademia() {
        return idAcademia;
    }

    public void setIdAcademia(Integer idAcademia) {
        this.idAcademia = idAcademia;
    }
    
    
}
