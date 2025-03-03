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
public class Mascota {
   private String especie;
   private String nombre;
   private  int edad;
   private Diagnostico diagnostico;

    public Mascota(String especie, String nombre, int edad,String fecha, String descripcion) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = new Diagnostico(fecha,descripcion);//relacion de composicion (agregando los valores de la calase de parametro)
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "Mascota{" + "especie=" + especie + ", nombre=" + nombre + ", edad=" + edad + ", diagnostico=" + diagnostico + '}';
    }
   
   
}
