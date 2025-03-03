/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercados;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Supermercados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        
        Proveedor p1 = new Proveedor("","","");
        Proveedor p2 = new Proveedor("","","");
        Proveedor p3 = new Proveedor("","","");
        Sucursal suc1 = new Sucursal("","",1,"",0.0f,p1,p2,p3);
             do{
                Scanner entrada=new Scanner(System.in);
                
                System.out.println("Supermercado");
                System.out.println("1.- Registar Datos");
                System.out.println("2.- Modificar datos");
                System.out.println("3.- Mostar Datos");
                System.out.println("4.- Salir");
                opc = entrada.nextInt();  
                switch(opc){
                    case 1:
                        String raSo;
                        System.out.println("PROVEEDOR 1");
                        System.out.println("Ingrese la RazonSocial");
                        raSo = entrada.next();
                        p1.setRazonSocial(raSo);
                        System.out.println("Ingrese la direccionFiscal");
                        p1.setDireccionFiscal(entrada.next());
                        System.out.println("Ingrese el RFC");
                        p1.setRFC(entrada.next());
                        System.out.println("PROVEEDOR 2");
                        System.out.println("Ingrese la RazonSocial");
                        p2.setRazonSocial(entrada.next());
                        System.out.println("Ingrese la direccionFiscal");
                        p2.setDireccionFiscal(entrada.next());
                        System.out.println("Ingrese el RFC");
                        p2.setRFC(entrada.next());
                        System.out.println("PROVEEDOR 3");
                        System.out.println("Ingrese la RazonSocial");
                        p3.setRazonSocial(entrada.next());
                        System.out.println("Ingrese la direccionFiscal");
                        p3.setDireccionFiscal(entrada.next());
                        System.out.println("Ingrese el RFC");
                        p3.setRFC(entrada.next());
                        System.out.println("SUCURSAL");
                        System.out.println("Ingrese el nombre");
                        suc1.setNombre(entrada.next());
                        System.out.println("Ingrese la direccionl");
                        suc1.setDireccion(entrada.next());
                        System.out.println("Ingrese el numero de empleados");
                        suc1.setNuEmpleados(entrada.nextInt());
                        System.out.println("CUENTA");
                        System.out.println("Ingrese la clave");
                        suc1.getCuenta().setClave(entrada.next());
                        System.out.println("Ingrese el monto");
                        suc1.getCuenta().setMonto(entrada.nextFloat());
                        break;
                    case 2:
                         int opc2,opc3,opc4,opc5;
                        do{
                        Scanner entrada2=new Scanner(System.in);
                        System.out.println("MODIFICAR DATOS"); 
                        System.out.println("1.- Sucursal");
                        System.out.println("2.- Cuenta");
                        System.out.println("3.- Proveedor 1");
                        System.out.println("4.- Proveedor 2");
                        System.out.println("5.- Proveedor 3");
                        System.out.println("6.- SALIR");
                        System.out.println("Ingrese una opcion: ");
                        opc2 = entrada2.nextInt();  
                            switch(opc2){
                                case 1:
                                    Scanner entrada3=new Scanner(System.in);
                                    System.out.println("SUCURSAL"); 
                                    System.out.println("1.- Nombre");
                                    System.out.println("2.- Direccion");
                                    System.out.println("3.- Numero De Empleados");
                                    System.out.println("4.- Salir");
                                    opc3 = entrada3.nextInt();
                                    switch(opc3){
                                        case 1:
                                            System.out.println("Ingrese el nombre actual es: "+suc1.getNombre());
                                            System.out.println("Ingrese el nuevo nombre");
                                            suc1.setNombre(entrada.next());
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la direccion actual es: "+suc1.getDireccion());
                                            System.out.println("Ingrese la nueva direccion");
                                            suc1.setDireccion(entrada.next());
                                            break;
                                        case 3:
                                            System.out.println("Ingrese el numero de empleados actual es: "+suc1.getNuEmpleados());
                                            System.out.println("Ingrese el nuevo Numero De Empleados");
                                            suc1.setNuEmpleados(entrada.nextInt());
                                            break;
                                        case 4:
                                            break;
                                    }
                                    break;
                                case 2:
                                    Scanner entrada4=new Scanner(System.in);
                                    System.out.println("CUENTA"); 
                                    System.out.println("1.- Clave");
                                    System.out.println("2.- Monto");
                                    System.out.println("3.- Salir");
                                    opc4 = entrada4.nextInt();
                                    switch(opc4){
                                        case 1:
                                            System.out.println("la Clave actual es: "+suc1.getCuenta().getClave());
                                            System.out.println("Ingrese la nueva clave");
                                            suc1.getCuenta().setClave(entrada.next());
                                            
                                            break;
                                        case 2:
                                            System.out.println("el monto actual es: "+suc1.getCuenta().getMonto());
                                            System.out.println("Ingrese el nuevo monto");
                                            suc1.getCuenta().setMonto(entrada.nextFloat());
                                            break;
                                        case 3:
                                            break;
                                    }
                                    break;
                                case 3:
                                            System.out.println("PROVEEDOR 1");
                                            System.out.println("la RazonSocial actual es: "+suc1.getProveedor().getRazonSocial());
                                            System.out.println("Ingrese la nueva RazonSocial: ");
                                            raSo = entrada.next();
                                            p1.setRazonSocial(raSo);
                                            System.out.println("la Direccion Fiscal actual es: "+suc1.getProveedor().getDireccionFiscal());
                                            System.out.println("Ingrese la nueva direccion fiscal: ");
                                            p1.setDireccionFiscal(entrada.next());
                                            System.out.println("el RFC actual es: "+suc1.getProveedor().getRFC());
                                            System.out.println("Ingrese el nuevo RFC: ");
                                            p1.setRFC(entrada.next());
                                    break;
                                case 4:
                                            System.out.println("PROVEEDOR 2");
                                            System.out.println("la RazonSocial actual es: "+suc1.getProveedor2().getRazonSocial());
                                            System.out.println("Ingrese la nueva RazonSocial: ");
                                            raSo = entrada.next();
                                            p2.setRazonSocial(raSo);
                                            System.out.println("la Direccion Fiscal actual es: "+suc1.getProveedor2().getDireccionFiscal());
                                            System.out.println("Ingrese la nueva direccion fiscal: ");
                                            p2.setDireccionFiscal(entrada.next());
                                            System.out.println("el RFC actual es: "+suc1.getProveedor2().getRFC());
                                            System.out.println("Ingrese el nuevo RFC: ");
                                            p2.setRFC(entrada.next());
                                    break;
                                case 5:
                                             System.out.println("PROVEEDOR 3");
                                            System.out.println("la RazonSocial actual es: "+suc1.getProveedor3().getRazonSocial());
                                            System.out.println("Ingrese la nueva RazonSocial: ");
                                            raSo = entrada.next();
                                            p3.setRazonSocial(raSo);
                                            System.out.println("la Direccion Fiscal actual es: "+suc1.getProveedor3().getDireccionFiscal());
                                            System.out.println("Ingrese la nueva direccion fiscal: ");
                                            p3.setDireccionFiscal(entrada.next());
                                            System.out.println("el RFC actual es: "+suc1.getProveedor3().getRFC());
                                            System.out.println("Ingrese el nuevo RFC: ");
                                            p3.setRFC(entrada.next());
                                    break;
                                case 6:
                                    break;
                            }
                        }while(opc2<=5);
                        break;
                    case 3:
                        Scanner entrada5=new Scanner(System.in);
                        System.out.println("MOSTRAR"); 
                        System.out.println("1.- Sucursal");
                        System.out.println("2.- Proveedores");
                        System.out.println("3.- Cuenta");
                        System.out.println("4.- Todo");
                        System.out.println("5.- Salir");
                        opc5 = entrada5.nextInt();
                        switch(opc5){
                            case 1:
                                 System.out.println("-------SUCURSAL------");
                                 System.out.println("Nombre             : "+suc1.getNombre());
                                 System.out.println("Direccion          : "+suc1.getDireccion());
                                 System.out.println("Numero De Empleados: "+suc1.getNuEmpleados());
                                break;
                            case 2:
                                 System.out.println("------PROVEEDORES-----");
                                 System.out.println("   PROVEEDOR 1 ");
                                 System.out.println("Razon Social     : "+suc1.getProveedor().getRazonSocial());
                                 System.out.println("Direccion Fiscal : "+suc1.getProveedor().getDireccionFiscal());
                                 System.out.println("RFC              : "+suc1.getProveedor().getRFC());
                                 System.out.println("------PROVEEDORES-----");
                                 System.out.println("   PROVEEDOR 2 ");
                                 System.out.println("Razon Social     : "+suc1.getProveedor2().getRazonSocial());
                                 System.out.println("Direccion Fiscal : "+suc1.getProveedor2().getDireccionFiscal());
                                 System.out.println("RFC              : "+suc1.getProveedor2().getRFC());
                                 System.out.println("------PROVEEDORES-----");
                                 System.out.println("   PROVEEDOR 3 ");
                                 System.out.println("Razon Social     : "+suc1.getProveedor3().getRazonSocial());
                                 System.out.println("Direccion Fiscal : "+suc1.getProveedor3().getDireccionFiscal());
                                 System.out.println("RFC              : "+suc1.getProveedor3().getRFC());
                                break;
                            case 3:
                                System.out.println("-------CUENTA------");
                                System.out.println("Clave : "+suc1.getCuenta().getClave());
                                System.out.println("Monto : "+suc1.getCuenta().getMonto());
                                break;
                            case 4:
                                System.out.println("-------TODOS lOS DATOS------");
                                
                                System.out.println("-------SUCURSAL------");
                                System.out.println("Nombre             : "+suc1.getNombre());
                                System.out.println("Direccion          : "+suc1.getDireccion());
                                System.out.println("Numero De Empleados: "+suc1.getNuEmpleados());
                                
                                System.out.println("------PROVEEDORES-----");
                                System.out.println("   PROVEEDOR 1 ");
                                System.out.println("Razon Social     : "+suc1.getProveedor().getRazonSocial());
                                System.out.println("Direccion Fiscal : "+suc1.getProveedor().getDireccionFiscal());
                                System.out.println("RFC              : "+suc1.getProveedor().getRFC());
                                System.out.println("------PROVEEDORES-----");
                                System.out.println("   PROVEEDOR 2 ");
                                System.out.println("Razon Social     : "+suc1.getProveedor2().getRazonSocial());
                                System.out.println("Direccion Fiscal : "+suc1.getProveedor2().getDireccionFiscal());
                                System.out.println("RFC              : "+suc1.getProveedor2().getRFC());
                                System.out.println("------PROVEEDORES-----");
                                System.out.println("   PROVEEDOR 3 ");
                                System.out.println("Razon Social     : "+suc1.getProveedor3().getRazonSocial());
                                System.out.println("Direccion Fiscal : "+suc1.getProveedor3().getDireccionFiscal());
                                System.out.println("RFC              : "+suc1.getProveedor3().getRFC());
                                 
                                System.out.println("-------CUENTA------");
                                System.out.println("Clave : "+suc1.getCuenta().getClave());
                                System.out.println("Monto : "+suc1.getCuenta().getMonto());
                                 
                                break;
                            case 5://SALIR
                                break;
                        }
                        break;
                    case 4: //salir
                        break;
                }
            }while(opc<=3);
        }
    }
   
