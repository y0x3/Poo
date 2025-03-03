/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Diego
 */
public class Entrenador extends SeleccionFutbool{
    private String idSeleccion;
    private int anosExperiencia;

    public Entrenador(String idSeleccion, int anosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idSeleccion = idSeleccion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getIdSeleccion() {
        return idSeleccion;
    }

    public void setIdSeleccion(String idSeleccion) {
        this.idSeleccion = idSeleccion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void dirigirPartido(){
        System.out.println("Dirigiendo partido....");
    }
     public void entrenamiento(){
        System.out.println("entrenamiento intensivo....");
    }
}
