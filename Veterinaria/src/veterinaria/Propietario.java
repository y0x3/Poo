/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author Diego
 */
public class Propietario {
    private String nombre;
    private String direccion;
    private String telefono;
    private Mascota mascota;

    public Propietario(String nombre, String direccion, String telefono, Mascota mascota) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mascota = mascota;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", mascota=" + mascota + '}';
    }
    
    
}
