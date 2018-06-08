/**
 * DAO para las consultas necesarias para la Minuta de Academia
 * @author Daniel Escamilla Cortes
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.MyBatisUtils;
import model.pojos.Maestro;
import model.pojos.Participante;
import model.pojos.MinutaDeAcademia;
import org.apache.ibatis.session.SqlSession;

public class MinutaDeAcademiaDAO {
    /**
     * Obtiene una minuta en especifico con base a la id
     * @param idMinuta
     * @return minuta
     */
    public static MinutaDeAcademia obtenerMinuta(Integer idMinuta) {
        MinutaDeAcademia minuta = new MinutaDeAcademia();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            minuta = conn.selectOne("MinutaDeAcademia.obtenerMinuta", idMinuta);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return minuta;
    }

    /**
     * Obtener los maestros participantes de una minuta
     * @param idMinuta
     * @return maestros
     */
    public static List<Maestro> obtenerParticipantes(Integer idMinuta) {
        List<Maestro> lista = new ArrayList<Maestro>();
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("MinutaDeAcademia.obtenerParticipantes", idMinuta);
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
     * Guardar un participante de la minuta
     * @param participante relacion entre maestro y minuta
     * @return true si la consulta fue correcta
     */
    public static boolean guardarParticipante(Participante participante) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("MinutaDeAcademia.guardarParticipante", participante);
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
     * Guarda la minuta de academia
     * @param minuta 
     * @return true si la consulta fue correcta
     */
    public static boolean guardarMinuta(MinutaDeAcademia minuta) {
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            conn.insert("MinutaDeAcademia.guardarMinuta", minuta);
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
