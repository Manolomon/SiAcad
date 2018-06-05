package model.pojos;

/**
 *
 * @author Deklok
 */
public class Participante {
    private Integer idDocumento;
    private Integer idMaestro;

    public Participante() {
    }

    public Participante(Integer idDocumento, Integer idMaestro) {
        this.idDocumento = idDocumento;
        this.idMaestro = idMaestro;
    }
    
    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Integer getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(Integer idMaestro) {
        this.idMaestro = idMaestro;
    }
    
    
}
