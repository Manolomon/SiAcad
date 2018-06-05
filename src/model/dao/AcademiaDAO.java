/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.MyBatisUtils;
import model.pojos.Academia;
import model.pojos.ExperienciaEducativa;
import model.pojos.Maestro;
import model.pojos.Reunion;
import org.apache.ibatis.session.SqlSession;

public class AcademiaDAO {
    public static List<Academia> obtenerAcademias()
    {
        List<Academia> lista = new ArrayList<Academia>();
        SqlSession conn = null;
        try{
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("Academia.obtenerAcademias");
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return lista;
    }
    
    public static List<ExperienciaEducativa> obtenerExperienciasEducativas()
    {
        List<ExperienciaEducativa> lista = new ArrayList<ExperienciaEducativa>();
        SqlSession conn = null;
        try{
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("Academia.obtenerExperienciasEducativas");
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return lista;
    }
    
    public static List<Reunion> obtenerReuniones()
    {
        List<Reunion> lista = new ArrayList<Reunion>();
        SqlSession conn = null;
        try{
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("Academia.obtenerReuniones");
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return lista;
    }
        
    public static boolean guardarAcademia(String nombreAcademia){
        SqlSession conn = null;
        try{
            conn = MyBatisUtils.getSession();
            conn.insert("Academia.guardarAcademia",nombreAcademia);
            conn.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return false;
    }
    
    public static boolean eliminarAcademia(Integer id){
        SqlSession conn = null;
        try{
            conn = MyBatisUtils.getSession();
            conn.delete("Academia.eliminarAcademia",id);
            conn.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return false;
    }
    
   public static List<Maestro> obtenerMaestros(Integer idAcademia)
    {
        List<Maestro> lista = new ArrayList<Maestro>();
        SqlSession conn = null;
        try{
            conn = MyBatisUtils.getSession();
            lista = conn.selectList("Academia.obtenerMaestros",idAcademia);
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
            if(conn!=null){
                conn.close();
            }
        }
        return lista;
    }
}
