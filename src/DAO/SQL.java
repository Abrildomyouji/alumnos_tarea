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
    public static String insertaralumno="INSERT INTO alumno(matricula,nombre, ap_paterno,ap_materno,telefono,direccion,id_carrera) values (?,?,?,?,?,?,?)";
    public static String insertarcarrera="INSERT INTO carrera(nombre,id_carrera) values (?,?)";
    public static String buscarcarrera="select*from carrera where id_carrera=?";
}
