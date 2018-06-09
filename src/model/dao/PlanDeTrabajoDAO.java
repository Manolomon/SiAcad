/**
 * DAO Para las consultas necesarias para el Plan de Trabajo
 * @author Daniel Escamilla Cortes
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.MyBatisUtils;
import model.pojos.Actividad;
import model.pojos.Bibliografia;
import model.pojos.Curso;
import model.pojos.EEPlanTrabajo;
import model.pojos.Evaluacion;
import model.pojos.Evaluacion_PlanCurso;
import model.pojos.Maestro;
import model.pojos.ObjetivoParticular;
import model.pojos.PlanDeCurso;
import model.pojos.PlanDeTrabajo;
import model.pojos.Planeacion;
import model.pojos.Tema;
import org.apache.ibatis.session.SqlSession;

public class PlanDeTrabajoDAO {
    /**
     * Obtener un plan de curso en especifico
     * @param idCurso curso del cual sacar el plan de curso
     * @return plan de curso
     */
    public static PlanDeTrabajo obtenerPlanDeTrabajo(Integer idAcademia) {
        PlanDeTrabajo plan = new PlanDeTrabajo();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            plan = conn.selectOne("PlanDeTrabajo.obtenerPlanDeTrabajo", idAcademia);
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
    public static List<ObjetivoParticular> obtenerObjetivoParticulares(Integer idPlanDeTrabajo) {
        List<ObjetivoParticular> lista = new ArrayList<ObjetivoParticular>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerObjetivosParticulares", idPlanDeTrabajo);
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
    public static List<Actividad> obtenerActividades(Integer idPlanDeTrabajo) {
        List<Actividad> lista = new ArrayList<Actividad>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerActividades", idPlanDeTrabajo);
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
    public static List<EEPlanTrabajo> obtenerEEPlanTrabajo(Integer idPlanDeTrabajo) {
        List<EEPlanTrabajo> lista = new ArrayList<EEPlanTrabajo>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerEEPlanTrabajo", idPlanDeTrabajo);
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
    public static List<Evaluacion> obtenerEvaluaciones(Integer idPlanDeCurso) {
        List<Evaluacion> lista = new ArrayList<Evaluacion>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerEvaluaciones", idPlanDeCurso);
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
    public static List<Tema> obtenerTemas(Integer idPlanDeCurso) {
        List<Tema> lista = new ArrayList<Tema>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerTemas", idPlanDeCurso);
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
    public static List<Maestro> obtenerParticipantes(Integer idPlanDeTrabajo) {
        List<Maestro> lista = new ArrayList<Maestro>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("PlanDeTrabajo.obtenerParticipantes", idPlanDeTrabajo);
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
    public static boolean guardarEvaluacion(Evaluacion evaluacion) {
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
