/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import model.dao.AcademiaDAO;
import model.pojos.Academia;
import model.pojos.ExperienciaEducativa;
import model.pojos.Maestro;
import model.pojos.Reunion;
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
public class AcademiaDAOTest {
    
    public AcademiaDAOTest() {
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
     * Test of obtenerAcademias method, of class AcademiaDAO.
     */
    @Test
    public void testObtenerAcademias() {
        System.out.println("obtenerAcademias");
        List<Academia> expResult = null;
        List<Academia> result = AcademiaDAO.obtenerAcademias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("La operacion ha fallado al obtener las academias");
    }

    /**
     * Test of obtenerAcademiaId method, of class AcademiaDAO.
     */
    @Test
    public void testObtenerAcademiaId() {
        System.out.println("obtenerAcademiPorId");
        Integer idAcademia = 1;
        Academia expResult = null;
        Academia result = AcademiaDAO.obtenerAcademiaId(idAcademia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No hay una academia con esa ID");
    }

    /**
     * Test of obtenerExperienciasEducativas method, of class AcademiaDAO.
     */
    @Test
    public void testObtenerExperienciasEducativas() {
        System.out.println("obtenerExperienciasEducativas");
        List<ExperienciaEducativa> expResult = null;
        List<ExperienciaEducativa> result = AcademiaDAO.obtenerExperienciasEducativas(1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se han obtenido las EE.");
    }

    /**
     * Test of obtenerReuniones method, of class AcademiaDAO.
     */
    @Test
    public void testObtenerReuniones() throws Exception {
        System.out.println("obtenerReuniones");
        Academia academia = null;
        List<Reunion> expResult = null;
        List<Reunion> result = AcademiaDAO.obtenerReuniones(academia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se han obtenido las reuniones.");
    }

    /**
     * Test of guardarAcademia method, of class AcademiaDAO.
     */
    @Test
    public void testGuardarAcademia() {
        System.out.println("guardarAcademia");
        String nombreAcademia = "";
        boolean expResult = false;
        boolean result = AcademiaDAO.guardarAcademia(nombreAcademia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se han podido guardar academias.");
    }

    /**
     * Test of eliminarAcademia method, of class AcademiaDAO.
     */
    @Test
    public void testEliminarAcademia() {
        System.out.println("eliminarAcademia");
        Integer id = null;
        boolean expResult = false;
        boolean result = AcademiaDAO.eliminarAcademia(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se ha podido eliminar esa academia.");
    }

    /**
     * Test of obtenerMaestros method, of class AcademiaDAO.
     */
    @Test
    public void testObtenerMaestros() throws Exception {
        System.out.println("obtenerMaestros");
        Integer idAcademia = null;
        List<Maestro> expResult = null;
        List<Maestro> result = AcademiaDAO.obtenerMaestros(idAcademia);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No se han podido botener tales maestros.");
    }
    
}
