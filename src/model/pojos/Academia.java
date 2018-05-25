package model.pojos;

/**
 *
 * @author Deklok
 */
public class Academia {
    private Integer idAcademia;
    private String nombre;

    public Academia() {
    }

    public Academia(Integer idAcademia, String nombre) {
        this.idAcademia = idAcademia;
        this.nombre = nombre;
    }

    public Integer getIdAcademia() {
        return idAcademia;
    }

    public void setIdAcademia(Integer idAcademia) {
        this.idAcademia = idAcademia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
