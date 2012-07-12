/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import DAO.AlumnoDAO;
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
        alumno.setMatricula("UP100164");
        alumno.setNombre("Monica");
        alumno.setAp_pater("Gonzalez");
        alumno.setAp_mater("Herrera");
        alumno.setTelefono("01800lalalalala");
        alumno.setDireccion("mi casa");
        Carrera carrera=new Carrera();
        carrera.setNombre("ISEI");
        carrera.setClave("1");
        alumno.setCarrera(carrera);
        JOptionPane.showMessageDialog(null, "La alumna "+alumno.getNombre()+" "+alumno.getAp_pater()+" "+alumno.getAp_mater()+"estudia la carrera "+alumno.getCarrera().getNombre());
        CarreraDAO carreradao=new CarreraDAO();
        AlumnoDAO alumnodao=new AlumnoDAO();
        alumnodao.insert(alumno);
        carreradao.insert(carrera);
        
        
    }
}
