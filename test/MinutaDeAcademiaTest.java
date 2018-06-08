/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import model.dao.MinutaDeAcademiaDAO;
import model.pojos.Maestro;
import model.pojos.MinutaDeAcademia;
import model.pojos.Participante;
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
public class MinutaDeAcademiaTest {
    
    public MinutaDeAcademiaTest() {
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
     * Test of obtenerMinuta method, of class MinutaDeAcademiaDAO.
     */
    @Test
    public void testObtenerMinuta() {
        System.out.println("obtenerMinuta");
        Integer idMinuta = null;
        MinutaDeAcademia expResult = null;
        MinutaDeAcademia result = MinutaDeAcademiaDAO.obtenerMinuta(idMinuta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se ha podido obtener la minuta.");
    }

    /**
     * Test of obtenerParticipantes method, of class MinutaDeAcademiaDAO.
     */
    @Test
    public void testObtenerParticipantes() {
        System.out.println("obtenerParticipantes");
        Integer idMinuta = null;
        List<Maestro> expResult = null;
        List<Maestro> result = MinutaDeAcademiaDAO.obtenerParticipantes(idMinuta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se pueden obtener los participantes.");
    }

    /**
     * Test of guardarParticipante method, of class MinutaDeAcademiaDAO.
     */
    @Test
    public void testGuardarParticipante() {
        System.out.println("guardarParticipante");
        Participante participante = null;
        boolean expResult = false;
        boolean result = MinutaDeAcademiaDAO.guardarParticipante(participante);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se han podido guardar los participantes.");
    }

    /**
     * Test of guardarMinuta method, of class MinutaDeAcademiaDAO.
     */
    @Test
    public void testGuardarMinuta() {
        System.out.println("guardarMinuta");
        MinutaDeAcademia minuta = null;
        boolean expResult = false;
        boolean result = MinutaDeAcademiaDAO.guardarMinuta(minuta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se ha podido guardar la minuta.");
    }
    
}
