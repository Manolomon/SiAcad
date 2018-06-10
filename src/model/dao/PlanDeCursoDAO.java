/**
 * DAO Para las consultas necesarias para el Plan de Curso
 * @author Daniel Escamilla Cortes
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.MyBatisUtils;
import model.pojos.Bibliografia;
import model.pojos.Curso;
import model.pojos.Evaluacion;
import model.pojos.Evaluacion_PlanCurso;
import model.pojos.PlanDeCurso;
import model.pojos.Planeacion;
import org.apache.ibatis.session.SqlSession;

public class PlanDeCursoDAO {
    
    public static Integer contarPlanes() {
        Integer num = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            num = new Integer(conn.selectOne("PlanDeCurso.contarPlanes"));
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return num;
    }
    
    public static String obtenerNombreCurso(Integer idEE) {
        String name = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            name = conn.selectOne("PlanDeCurso.obtenerNombreCurso", idEE);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return name;
    }
    /**
     * Obtener un plan de curso en especifico
     * @param idCurso curso del cual sacar el plan de curso
     * @return plan de curso
     */
    public static PlanDeCurso obtenerPlanDeCurso(Integer idCurso) {
        PlanDeCurso plan = new PlanDeCurso();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            plan = conn.selectOne("PlanDeCurso.obtenerPlanDeCurso", idCurso);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return plan;
    }

    /**
     * Obtener las evaluaciones base obtenidas con base al Plan de Trabajo de la Academia perteneciente
     * @param idCurso id del curso del cual se esta creando el plan de curso
     * @return evaluaciones
     */
    public static List<Evaluacion> obtenerEvaluacionesDePlanDeTrabajo(Integer idCurso) {
        List<Evaluacion> lista = new ArrayList<Evaluacion>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeCurso.obtenerEvaluacionDePlanDeTrabajo", idCurso);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    /**
     * Obtener todos los cursos de un determinado maestro
     * @param idMaestro id del maestro
     * @return cursos del maestro
     */
    public static List<Curso> obtenerCursoesDeMaestro(Integer idMaestro) {
        List<Curso> lista = new ArrayList<Curso>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeCurso.obtenerCursosDeMaestro", idMaestro);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }

    /**
     * Obtener las evaluaciones de un Plan de Curso
     * @param idPlanDeCurso id del plan de curso
     * @return evaluaciones
     */
    public static List<Evaluacion_PlanCurso> obtenerEvaluaciones(Integer idPlanDeCurso) {
        List<Evaluacion_PlanCurso> lista = new ArrayList<Evaluacion_PlanCurso>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeCurso.obtenerEvaluaciones", idPlanDeCurso);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    /**
     * Obtener las planeaciones de un Plan de Curso
     * @param idPlanDeCurso id del plan de curso
     * @return planeaciones
     */
    public static List<Planeacion> obtenerPlaneaciones(Integer idPlanDeCurso) {
        List<Planeacion> lista = new ArrayList<Planeacion>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeCurso.obtenerPlaneaciones", idPlanDeCurso);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    /**
     * Obtener las bibliografias de un Plan de Curso
     * @param idPlanDeCurso id del plan de curso
     * @return bibliografias
     */
    public static List<Bibliografia> obtenerBibliografias(Integer idPlanDeCurso) {
        List<Bibliografia> lista = new ArrayList<Bibliografia>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeCurso.obtenerBibliografias", idPlanDeCurso);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return lista;
    }
    
    /**
     * Guarda un objeto planeacion en la BD
     * @param planeacion
     * @return true si la consulta fue correcta
     */
    public static boolean guardarPlaneacion(Planeacion planeacion) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeCurso.guardarPlaneaciones", planeacion);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    /**
     * Guarda un objeto bibliografia en la BD
     * @param bib bibliografia a guardar
     * @return true si la consulta fue correcta
     */
    public static boolean guardarBibliografia(Bibliografia bib) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeCurso.guardarBibliografias", bib);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

    /**
     * Guarda un objeto evaluacion en la BD
     * @param evaluacion
     * @return true si la consulta fue correcta
     */
    public static boolean guardarEvaluacion(Evaluacion_PlanCurso evaluacion) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeCurso.guardarEvaluaciones", evaluacion);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }
    
    /**
     * Guarda el Plan de Curso en la BD
     * @param plan plan de curso a guardar
     * @return true si la consulta fue correcta
     */
    public static boolean guardarPlanDeCurso(PlanDeCurso plan) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("PlanDeCurso.guardarPlanDeCurso", plan);
            conn.commit();
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return false;
    }

}
