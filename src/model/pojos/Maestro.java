package model.pojos;

/**
 *
 * @author Deklok
 */
public class Maestro {
    private Integer idUsuarioAcademico;
    private String noPersonal;
    private String tipo;

    public Maestro() {
    }

    public Maestro(Integer idUsuarioAcademico, String noPersonal, String tipo) {
        this.idUsuarioAcademico = idUsuarioAcademico;
        this.noPersonal = noPersonal;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
