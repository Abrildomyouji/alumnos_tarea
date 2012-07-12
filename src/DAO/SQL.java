/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author 666-MAGH-666
 */
public class SQL {
    public static String insertaralumno="INSERT INTO alumno(matricula,nombre, ap_paterno,ap_materno,telefono,direccion) values (?,?,?,?,?,?)";
    public static String insertarcarrera="INSERT INTO carrera(id_carrera,nombre) values (?,?)";
    public static String buscarcarrera="select*from carrera where id_carrera=?";
}
