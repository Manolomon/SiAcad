package model.pojos;

/**
 *
 * @author Deklok
 */
public class Maestro {
  private Integer idUsuarioAcademico;
  private String nombre;
  private String apellidos;

  public Maestro() {
  }

    public Maestro(Integer idUsuarioAcademico, String nombre, String apellidos) {
        this.idUsuarioAcademico = idUsuarioAcademico;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Integer getIdUsuarioAcademico() {
        return idUsuarioAcademico;
    }

    public void setIdUsuarioAcademico(Integer idUsuarioAcademico) {
        this.idUsuarioAcademico = idUsuarioAcademico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
  
  
}
