/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg2;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    float x=4.5f;
    Figura circulo = new Figura(0.0f,0.0f,3.5f);
//getters
    System.out.println(circulo.getAltura());
    System.out.println(circulo.getBase());
    System.out.println(circulo.getRadio());
//to string
    System.out.println(circulo.toString());
    circulo.getRadio();
//setters
//circulo.setAltura(1.3f);
//circulo.setAltura(x);
Scanner circulo2 = new Scanner(System.in);
System.out.println("dijita la altura");
//circulo2.nextFloat();
circulo.setAltura(circulo2.nextFloat());
System.out.println(circulo2.toString());
}
    
}
