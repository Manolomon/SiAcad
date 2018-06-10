package model.pojos;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 
 * @author Daniel Escamilla Cortes
 */
public class Bibliografia {
    private Integer idBibliografia;
    private SimpleStringProperty titulo = new SimpleStringProperty();
    private SimpleStringProperty autor = new SimpleStringProperty();
    private SimpleStringProperty editorial = new SimpleStringProperty();
    private SimpleIntegerProperty anio = new SimpleIntegerProperty();
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
        this.titulo = new SimpleStringProperty(titulo);
        this.autor = new SimpleStringProperty(autor);
        this.editorial = new SimpleStringProperty(editorial);
        this.anio = new SimpleIntegerProperty(anio);
        this.idPlanDeCurso = idPlanDeCurso;
    }

    public Bibliografia(String titulo, String autor, String editorial, Integer anio) {
        this.titulo = new SimpleStringProperty(titulo);
        this.autor = new SimpleStringProperty(autor);
        this.editorial = new SimpleStringProperty(editorial);
        this.anio = new SimpleIntegerProperty(anio);
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
        return titulo.get();
    }

    /**
     * Asignar el titulo del libro
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        this.titulo = new SimpleStringProperty(titulo);
    }

    /**
     * Obtener el autor del libro
     * @return autor del libro
     */
    public String getAutor() {
        return autor.get();
    }

    /**
     * Asignar el autor del libro
     * @param autor 
     */
    public void setAutor(String autor) {
        this.autor = new SimpleStringProperty(autor);
    }

    /**
     * Obtener la editorial del libro
     * @return editorial del libro
     */
    public String getEditorial() {
        return editorial.get();
    }

    /**
     * Asignar la editorial del libro
     * @param editorial 
     */
    public void setEditorial(String editorial) {
        this.editorial = new SimpleStringProperty(editorial);
    }

    /**
     * Obtener el año de publicacion del libro
     * @return año de publicacion del libro
     */
    public Integer getAnio() {
        return anio.get();
    }

    /**
     * Asignar el año de publicacion del libro
     * @param anio 
     */
    public void setAnio(Integer anio) {
        this.anio = new SimpleIntegerProperty(anio);
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
