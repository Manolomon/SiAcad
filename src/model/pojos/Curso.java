/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.pojos;

/**
 *
 * @author Deklok
 */
public class Curso {
    private Integer idCurso;
    private String NRC;
    private String programaEducativo;
    private Integer bloque;
    private Integer seccion;
    private Integer idExperienciaEducativa;

    public Curso(Integer idCurso, String NRC, String programaEducativo, Integer bloque, Integer seccion, Integer idExperienciaEducativa) {
        this.idCurso = idCurso;
        this.NRC = NRC;
        this.programaEducativo = programaEducativo;
        this.bloque = bloque;
        this.seccion = seccion;
        this.idExperienciaEducativa = idExperienciaEducativa;
    }

    public Curso() {
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    public String getProgramaEducativo() {
        return programaEducativo;
    }

    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }

    public Integer getBloque() {
        return bloque;
    }

    public void setBloque(Integer bloque) {
        this.bloque = bloque;
    }

    public Integer getSeccion() {
        return seccion;
    }

    public void setSeccion(Integer seccion) {
        this.seccion = seccion;
    }

    public Integer getIdExperienciaEducativa() {
        return idExperienciaEducativa;
    }

    public void setIdExperienciaEducativa(Integer idExperienciaEducativa) {
        this.idExperienciaEducativa = idExperienciaEducativa;
    }
    
    
}
