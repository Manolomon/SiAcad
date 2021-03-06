package model.pojos;

/**
 *
 * @author Deklok
 */
public class Participante {
    private Integer idDocumento;
    private Integer idMaestro;
    
    /**
    *Constructor por default del objeto.
    */
    public Participante() {
    }

    /**
    * Constructor del objeto con todos sus atributos.
    * @param idDocumento Corresponde al identificador del documento
    * @param idMaestro Corresponde al identificador del maestro que esta asociado.
    */
    public Participante(Integer idDocumento, Integer idMaestro) {
        this.idDocumento = idDocumento;
        this.idMaestro = idMaestro;
    }
    
    /**
    *Retorna el identificador del documento.
    * @return idDocumento
    */
    public Integer getIdDocumento() {
        return idDocumento;
    }

    /**
    *Establece el identificador del documento al que se hace referencia.
    * @param idDocumento Corresponde al identificador del documento.
    */
    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    /**
    *Retorna el identificador del maestro.
    * @return idMaestro
    */
    public Integer getIdMaestro() {
        return idMaestro;
    }

    /**
    *Establece el identificador del maestro.
    * @param idMaestro Corresponde al identificador del maestro
    */
    public void setIdMaestro(Integer idMaestro) {
        this.idMaestro = idMaestro;
    }
    
    
}
