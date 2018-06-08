package model.pojos;

/**
 * 
 * @author Daniel Escamilla Cortes
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
    
    /**
     * Constructor para bibliografia
     * @param idBibliografia
     * @param titulo titulo del libro
     * @param autor autor(es) del libro
     * @param editorial editorial del libro
     * @param anio año del libro
     * @param idPlanDeCurso id del plan de curso al que pertenece
     */
    public Bibliografia(Integer idBibliografia, String titulo, String autor, String editorial, Integer anio, Integer idPlanDeCurso) {
        this.idBibliografia = idBibliografia;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.idPlanDeCurso = idPlanDeCurso;
    }

    /**
     * Obtener el id del libro
     * @return id del libro
     */
    public Integer getIdBibliografia() {
        return idBibliografia;
    }

    /**
     * Asiganr id al libro
     * @param idBibliografia nuevo id del libro
     */
    public void setIdBibliografia(Integer idBibliografia) {
        this.idBibliografia = idBibliografia;
    }

    /**
     * Obtener el titulo del libro
     * @return titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Asignar el titulo del libro
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtener el autor del libro
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Asignar el autor del libro
     * @param autor 
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtener la editorial del libro
     * @return editorial del libro
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Asignar la editorial del libro
     * @param editorial 
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Obtener el año de publicacion del libro
     * @return año de publicacion del libro
     */
    public Integer getAnio() {
        return anio;
    }

    /**
     * Asignar el año de publicacion del libro
     * @param anio 
     */
    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    /**
     * Obtener el id del plan de curso perteneciente
     * @return id
     */
    public Integer getIdPlanDeCurso() {
        return idPlanDeCurso;
    }

    /**
     * Asignar el id del plan de curso perteneciente
     * @param idPlanDeCurso 
     */
    public void setIdPlanDeCurso(Integer idPlanDeCurso) {
        this.idPlanDeCurso = idPlanDeCurso;
    }
    
    
}
