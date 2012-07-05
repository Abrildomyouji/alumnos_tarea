/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import DAO.CarreraDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author 666-MAGH-666
 */
public class main_alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno=new Alumno();
        alumno.setNombre("Monica");
        Carrera carrera=new Carrera();
        carrera.setNombre("Ingenieria en Siestemas Estrategicos de Informacion");
        alumno.setCarrera(carrera);
        JOptionPane.showMessageDialog(null, "La alumna "+alumno.getNombre()+" estudia la carrera "+alumno.getCarrera().getNombre());
        CarreraDAO carreradao=new CarreraDAO();
        
        carreradao.insert(carrera);
    }
}
