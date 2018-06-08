package model.pojos;

/**
 *
 * @author Deklok
 */
public class Bibliografia {
    private Integer idBibliografia;
    private String titulo;
    private String autor;
    private String editorial;
    private Integer anio;
    private Integer idPlanDeCurso;

    public Bibliografia() {
    }

    public Bibliografia(Integer idBibliografia, String titulo, String autor, String editorial, Integer anio, Integer idPlanDeCurso) {
        this.idBibliografia = idBibliografia;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.idPlanDeCurso = idPlanDeCurso;
    }

    public Integer getIdBibliografia() {
        return idBibliografia;
    }

    public void setIdBibliografia(Integer idBibliografia) {
        this.idBibliografia = idBibliografia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getIdPlanDeCurso() {
        return idPlanDeCurso;
    }

    public void setIdPlanDeCurso(Integer idPlanDeCurso) {
        this.idPlanDeCurso = idPlanDeCurso;
    }
    
    
}
