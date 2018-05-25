package model.pojos;

/**
 *
 * @author Deklok
 */
public class Maestro {
    private Integer idUsuarioAcademico;
    private String noPersonal;
    private Integer idTipo;

    public Maestro() {
    }

    public Maestro(Integer idUsuarioAcademico, String noPersonal, Integer idTipo) {
        this.idUsuarioAcademico = idUsuarioAcademico;
        this.noPersonal = noPersonal;
        this.idTipo = idTipo;
    }

    public Integer getIdUsuarioAcademico() {
        return idUsuarioAcademico;
    }

    public void setIdUsuarioAcademico(Integer idUsuarioAcademico) {
        this.idUsuarioAcademico = idUsuarioAcademico;
    }

    public String getNoPersonal() {
        return noPersonal;
    }

    public void setNoPersonal(String noPersonal) {
        this.noPersonal = noPersonal;
    }

    public Integer getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }
    
    
}
