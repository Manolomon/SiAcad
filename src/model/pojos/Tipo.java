package model.pojos;

/**
 *
 * @author Deklok
 */
public class Tipo {
    private Integer idTipo;
    private String nombre;

    public Tipo() {
    }

    public Tipo(Integer idTipo, String nombre) {
        this.idTipo = idTipo;
        this.nombre = nombre;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
