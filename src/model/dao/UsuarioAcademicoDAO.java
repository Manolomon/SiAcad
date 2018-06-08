/**
 * UsuarioAcademicoDAO.java
 *
 * Copyright (c) 2018, Royal Mango Developers
 * All rights reserved.
 */

package model.dao;

import model.MyBatisUtils;
import model.pojos.UsuarioAcademico;
import org.apache.ibatis.session.SqlSession;

/**
 * @author Manolo Pérez
 * @since Thu Jun 07 2018
 * @version 0.1
 */

public class UsuarioAcademicoDAO {
    public static UsuarioAcademico login(UsuarioAcademico datos) {
        UsuarioAcademico user = null;
        SqlSession conn = null;
        try {
            conn = MyBatisUtils.getSession();
            user = conn.selectOne("UsuarioAcademico.login", datos);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return user;
    }
}