/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mascota mas1 = new Mascota("can ","juan ", 2, "12/02/2021","ta enfermo :v"); 
        Propietario pro1 = new Propietario("JuanDueño","pachuca","771324231",mas1);//agregacion 
        
        //tarea hacer menu
        
        Scanner entrada=new Scanner(System.in);
        int opc;
        do{
        System.out.println("VETERINARIA");
        System.out.println("1.- Registar Datos");
        System.out.println("2.- Modificar datos");
        System.out.println("3.- Mostar Datos");
        System.out.println("4.- Salir");
        opc = entrada.nextInt();
        switch(opc){
            case 1:
                Scanner entrada2=new Scanner(System.in);
                int opc2;
                System.out.println("OPCIONES");
                System.out.println("1.- Registar Datos del propietario");
                System.out.println("2.- Registar datos de la mascota");
                System.out.println("3.- Registar Diagnostico");
                System.out.println("4.- Salir");
                opc2 = entrada2.nextInt();
                switch(opc2){
                    case 1:
                        System.out.println("Ingresar nombre");
                        pro1.setNombre(entrada.next());
                        System.out.println("Ingresar la direccion");
                        pro1.setDireccion(entrada.next());
                        System.out.println("Ingresar el telefono");
                        pro1.setTelefono(entrada.next());               
                        break;
                    case 2:
                        System.out.println("Ingresar nombre");
                        mas1.setNombre(entrada.next());
                        System.out.println("Ingresar especie");
                        mas1.setEspecie(entrada.next());
                        System.out.println("Ingresar edad");
                        mas1.setEdad(entrada.nextInt());
                        
                        break;
                    case 3:
                        String leer;
                        System.out.println("Ingresar fecha");
                        leer=entrada.next();
                        System.out.println("Ingresar Descripcion");
                        Diagnostico diag2 = new Diagnostico("","");
                        mas1.setDiagnostico(diag2);
                        break;
                    case 4:
                        break;
                
                }
                break;
            case 2:
                Scanner entrada3=new Scanner(System.in);
                int opc3;
                System.out.println("OPCIONES DE MODIFICACION");
                System.out.println("1.- Propietario");
                System.out.println("2.- Mascota");
                System.out.println("3.- Diagnostico");
                System.out.println("4.- Salir");
                opc3 = entrada3.nextInt();
                switch(opc3){
                    case 1:
                        Scanner entrada4=new Scanner(System.in);
                         int opc4;
                          System.out.println("OPCIONES DE MODIFICACION");
                          System.out.println("PROPIETARIO");
                          System.out.println("1.- Nombre");
                          System.out.println("2.- Direccion");
                          System.out.println("3.- Telefono");
                          opc4 = entrada4.nextInt();
                          switch(opc4){
                              case 1:
                                  System.out.println("Ingrese el nuevo nombre");
                                  pro1.setNombre(entrada.next());
                                  break;
                              case 2:
                                  System.out.println("Ingrese la nueva direccion");
                                  pro1.setDireccion(entrada.next());
                                  break;
                              case 3:
                                  System.out.println("Ingrese el nuevo telefono");
                                  pro1.setTelefono(entrada.next());
                                  break;
                          }
                        break;
                    case 2:
                        Scanner entrada5=new Scanner(System.in);
                         int opc5;
                        System.out.println("OPCIONES DE MODIFICACION");
                        System.out.println("MASCOTA");
                        System.out.println("1.- Especie");
                        System.out.println("2.- Nombre");
                        System.out.println("3.- Edad");
                        opc5 = entrada5.nextInt();
                        switch(opc5){
                            case 1:
                                System.out.println("Ingrese la nueva especie");
                                  mas1.setEspecie(entrada.next());
                                break;
                            case 2:
                                System.out.println("Ingrese el nuevo nombre");
                                  mas1.setNombre(entrada.next());
                                break;
                            case 3:
                                System.out.println("Ingrese la nueva edad");
                                  mas1.setEdad(entrada.nextInt());
                                break;
                        }
                        break;
                    case 3:
                        Scanner entrada6=new Scanner(System.in);
                         int opc6;
                        System.out.println("OPCIONES DE MODIFICACION");
                        System.out.println("DIAGNOSTICO");
                        System.out.println("1.- Fecha");
                        System.out.println("2.- Diagnostico");
                        opc6 = entrada6.nextInt();
                        switch(opc6){
                            case 1:
                                System.out.println("ingrese la nueva fecha");
                                pro1.getMascota().getDiagnostico().setFecha(leer.next());
                                break;
                            case 2:
                                System.out.println("ingrese el nuevo diagnostico");
                                pro1.getMascota().getDiagnostico().setDescripcion(leer.next());
                                break;
                        }
                        break;
                    case 4: //salir
                        break;
                }
                
                break;
            case 3:
                System.out.println(mas1);
                System.out.println(pro1);
                       
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opcion Invalida");
                break;
        }
        }while(opc<=3);
        
    }
    
}
