/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import model.pojos.Curso;
import model.pojos.Evaluacion;
import model.pojos.Evaluacion_PlanCurso;
import model.pojos.PlanDeCurso;
import model.pojos.Planeacion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author texch_000
 */
public class PlanDeCursoDAOTest {
    
    public PlanDeCursoDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of obtenerPlanDeCurso method, of class PlanDeCursoDAO.
     */
    @Test
    public void testObtenerPlanDeCurso() {
        System.out.println("obtenerPlanDeCurso");
        Integer idCurso = null;
        PlanDeCurso expResult = null;
        PlanDeCurso result = PlanDeCursoDAO.obtenerPlanDeCurso(idCurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se puede obtener el PDC.");
    }

    /**
     * Test of obtenerEvaluacionesDePlanDeTrabajo method, of class PlanDeCursoDAO.
     */
    @Test
    public void testObtenerEvaluacionesDePlanDeTrabajo() {
        System.out.println("obtenerEvaluacionesDePlanDeTrabajo");
        Integer idCurso = null;
        List<Evaluacion> expResult = null;
        List<Evaluacion> result = PlanDeCursoDAO.obtenerEvaluacionesDePlanDeTrabajo(idCurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden obtener la EVPT.");
    }

    /**
     * Test of obtenerCursoesDeMaestro method, of class PlanDeCursoDAO.
     */
    @Test
    public void testObtenerCursoesDeMaestro() {
        System.out.println("obtenerCursoesDeMaestro");
        Integer idMaestro = null;
        List<Curso> expResult = null;
        List<Curso> result = PlanDeCursoDAO.obtenerCursoesDeMaestro(idMaestro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden obtener los CDM.");
    }

    /**
     * Test of obtenerEvaluaciones method, of class PlanDeCursoDAO.
     */
    @Test
    public void testObtenerEvaluaciones() {
        System.out.println("obtenerEvaluaciones");
        Integer idPlanDeCurso = null;
        List<Evaluacion_PlanCurso> expResult = null;
        List<Evaluacion_PlanCurso> result = PlanDeCursoDAO.obtenerEvaluaciones(idPlanDeCurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden obtener las Evaluaciones.");
    }

    /**
     * Test of obtenerPlaneaciones method, of class PlanDeCursoDAO.
     */
    @Test
    public void testObtenerPlaneaciones() {
        System.out.println("obtenerPlaneaciones");
        Integer idPlanDeCurso = null;
        List<Planeacion> expResult = null;
        List<Planeacion> result = PlanDeCursoDAO.obtenerPlaneaciones(idPlanDeCurso);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden obtener las evaluaciones.");
    }

    /**
     * Test of guardarPlaneacion method, of class PlanDeCursoDAO.
     */
    @Test
    public void testGuardarPlaneacion() {
        System.out.println("guardarPlaneacion");
        Planeacion planeacion = null;
        boolean expResult = false;
        boolean result = PlanDeCursoDAO.guardarPlaneacion(planeacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden guardar las planeaciones.");
    }

    /**
     * Test of guardarEvaluacion method, of class PlanDeCursoDAO.
     */
    @Test
    public void testGuardarEvaluacion() {
        System.out.println("guardarEvaluacion");
        Evaluacion_PlanCurso evaluacion = null;
        boolean expResult = false;
        boolean result = PlanDeCursoDAO.guardarEvaluacion(evaluacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden guardar las evaluaciones.");
    }

    /**
     * Test of guardarPlanDeCurso method, of class PlanDeCursoDAO.
     */
    @Test
    public void testGuardarPlanDeCurso() {
        System.out.println("guardarPlanDeCurso");
        PlanDeCurso plan = null;
        boolean expResult = false;
        boolean result = PlanDeCursoDAO.guardarPlanDeCurso(plan);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se ouede guadar ek PDC.");
    }
    
}
