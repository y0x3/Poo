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
public class Cuenta {
    
    private String clave;
    private float monto;

    public Cuenta(String clave, float monto) {
        this.clave = clave;
        this.monto = monto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "clave=" + clave + ", monto=" + monto + '}';
    }
    
    
}
