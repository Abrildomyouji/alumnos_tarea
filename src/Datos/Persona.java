/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author 666-MAGH-666
 */
public class Persona implements Bean{
    private String Nombre;
    private String Ap_pater;
    private String Ap_mater;
    private String Telefono;
    private String Direccion;

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Ap_pater
     */
    public String getAp_pater() {
        return Ap_pater;
    }

    /**
     * @param Ap_pater the Ap_pater to set
     */
    public void setAp_pater(String Ap_pater) {
        this.Ap_pater = Ap_pater;
    }

    /**
     * @return the Ap_mater
     */
    public String getAp_mater() {
        return Ap_mater;
    }

    /**
     * @param Ap_mater the Ap_mater to set
     */
    public void setAp_mater(String Ap_mater) {
        this.Ap_mater = Ap_mater;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
}
