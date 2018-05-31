package model.pojos;

/**
 *
 * @author Deklok
 */
public class Academia {
    private Integer idAcademia;
    private String nombre;
    private String coordinador;

    public Academia() {
    }

    public Academia(Integer idAcademia, String nombre, String coordinador) {
        this.idAcademia = idAcademia;
        this.nombre = nombre;
        this.coordinador = coordinador;
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

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }
    
    
}
