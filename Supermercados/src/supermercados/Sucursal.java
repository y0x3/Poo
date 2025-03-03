/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercados;

/**
 *
 * @author Diego
 */
public class Sucursal {
    
    private String nombre;
    private String direccion;
    private int nuEmpleados;
    private Cuenta cuenta;
    private Proveedor proveedor;
    private Proveedor proveedor2;
    private Proveedor proveedor3;

    public Sucursal(String nombre, String direccion, int nuEmpleados,String clave,float monto, Proveedor proveedor, Proveedor proveedor2, Proveedor proveedor3) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nuEmpleados = nuEmpleados;
        this.cuenta = new Cuenta(clave, monto);
        this.proveedor = proveedor;
        this.proveedor2 = proveedor2;
        this.proveedor3 = proveedor3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNuEmpleados() {
        return nuEmpleados;
    }

    public void setNuEmpleados(int nuEmpleados) {
        this.nuEmpleados = nuEmpleados;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Proveedor getProveedor2() {
        return proveedor2;
    }

    public void setProveedor2(Proveedor proveedor2) {
        this.proveedor2 = proveedor2;
    }

    public Proveedor getProveedor3() {
        return proveedor3;
    }

    public void setProveedor3(Proveedor proveedor3) {
        this.proveedor3 = proveedor3;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "nombre=" + nombre + ", direccion=" + direccion + ", nuEmpleados=" + nuEmpleados + ", cuenta=" + cuenta + ", proveedor=" + proveedor + ", proveedor2=" + proveedor2 + ", proveedor3=" + proveedor3 + '}';
    }
    
    

  

    
    
}
