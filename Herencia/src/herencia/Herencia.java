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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Futbolista jugador1 = new Futbolista(10,"Delantero",1231,"Juan","perez",21);
        Entrenador en1 = new Entrenador ("FIFA",1,324,"Pedro","Martinez",31);
        Masajista mas1 = new Masajista ("Masajista profecional",3,234,"Carlos","Montes",24);
        
        System.out.println();
    
                
        jugador1.jugarPartido();
        jugador1.concentrarse();
        
        en1.dirigirPartido();
        en1.entrenamiento();
        
        mas1.darMasaje();
        mas1.viajar();
    }
    
}
