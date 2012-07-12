/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Datos.Alumno;
import Datos.Bean;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 666-MAGH-666
 */
public class AlumnoDAO implements OperacionesDAO{

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Alumno alumno=(Alumno) bean;
        Connection conexion=(Connection) DAOFactory.getConexion();
        PreparedStatement ps=null;
        try {
            ps=(PreparedStatement)conexion.prepareCall(SQL.insertaralumno);
            ps.setString(1,alumno.getMatricula());
            ps.setString(2,alumno.getNombre());
            ps.setString(3, alumno.getAp_pater());
            ps.setString(4, alumno.getAp_mater());
            ps.setString(5, alumno.getTelefono());
            ps.setString(6, alumno.getDireccion());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Bean find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
