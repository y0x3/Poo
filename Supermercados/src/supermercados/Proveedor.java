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
public class Proveedor {
    
    private String razonSocial;
    private String direccionFiscal;
    private String RFC;
    

    public Proveedor(String razonSocial, String direccionFiscal, String RFC) {
        this.razonSocial = razonSocial;
        this.direccionFiscal = direccionFiscal;
        this.RFC = RFC;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccionFiscal() {
        return direccionFiscal;
    }

    public void setDireccionFiscal(String direccionFiscal) {
        this.direccionFiscal = direccionFiscal;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "razonSocial=" + razonSocial + ", direccionFiscal=" + direccionFiscal + ", RFC=" + RFC + '}';
    }
    
    
}
