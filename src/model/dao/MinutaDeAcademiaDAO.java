/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
