/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.pkg2;

/**
 *
 * @author Diego
 */
public class Figura {

//atributos
    private float altura;
    private float base;
    private float radio;
    
//metodos
    public Figura(float altura,float base, float radio){
this.altura=altura;
this.base=base;
this.radio=radio;

    }
//geters y setters
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura=altura;

    }
    public float getBase(){
        return base;
    }
    public void setBase(float base){
        this.base=base;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float area(){
        return base*altura;     
    }
    public float perimetro(){
        return (base*altura)+2;
    }
    @Override
public String toString(){
    return"figura["+"altura" + altura + "base"+ base + ",radio" + radio + ']';
    } 

}

