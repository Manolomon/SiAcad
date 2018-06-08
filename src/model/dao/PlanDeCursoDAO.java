/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
