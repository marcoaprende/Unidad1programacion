

package com.mycompany.menu1;
import java.io.*;
import java.util.Scanner;

public class Menu1 {
public static  Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
  
    int opcion=0;
    
     do{  
   System.out.println("Menu");
   System.out.println("1-Calificacion:");
   System.out.println("2-Monto:");
   System.out.println("3-Cajero:");
   System.out.println("Digitaliza una opcion:");
         
        opcion=entrada.nextInt();
        switch(opcion){
        case 1: Calificacion(); break;
        case 2: Monto();  break;
        case 3: Cajero(); break;
        default: System.out.println("Opcion Incorrecta");
    }    
     }while(opcion!=4); 
       System.out.println("El programa a finalizado");
    }
    
    static void Calificacion() {
    System.out.println("Operacion de Calificacion:");

         int calificacion;
        //Datos de Entrada
        System.out.println("Introduce la Calificacion");
        calificacion = entrada.nextInt();
        //Proceso de Operacion Matematica.     
        //Datos de Salida.
        switch(calificacion){
            case 0:
        System.out.println("Muy Mal");
        break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        System.out.println("Insuficiente");
        break;
            case 6:
        System.out.println("Suficiente");      
        break;
             case 7:
             case 8:
        System.out.println("Bien");  
        break;
             case 9:
        System.out.println("Notable");  
        break;
             case 10:
        System.out.println("Sobre Saliente");
        break;
        
             default:
        System.out.println("Error de Calificacion");
        break;
        
    }
    }
    
       static void Monto() {
       System.out.println("Operacion de Monto:");  
       //Definicion de Variables.
       double PV =1000;
       
       int descuento=0;
       double preciofinal;
       String codPromocion;    
       System.out.print("2.Calculo de monto");
       //Entrada de Datos
       System.out.println("Su total de compra es: $"+ PV + "\n");
       System.out.println("Tines un codigo de descuento Escribelo:");
       codPromocion = entrada.next();
        codPromocion = codPromocion.toUpperCase();

        //Proceso.
        
        //Salida de Datos
        
        switch(codPromocion){
            case  "PlatiOctubre":
              descuento= 20;
              break;
            case  "SilverOctubre":  
              descuento= 50;
              break;
            case "BronceOctubre":
              descuento = 35;
              break;
            case "OroOctubre":
               descuento =75;
               break;
            default:
               System.out.println("Has introsucido un codigo no valido:"); 
        }
        
       
   
 }
   
   
    static void Cajero() {
       System.out.println("Operacion de un Cajero:"); 
        
       //Variables
       final int saldo_inicial=1000;
       int opcion;
       double ingreso,SaldoActual,retiro;
       
       
       System.out.println("1. Ingresa Dinero a la Cuenta:");
       System.out.println("2. Retirar Dinero de la  Cuenta:");
       System.out.println("3. Salir");

        
       System.out.println(" Ingresa un Numero");
       opcion = entrada.nextInt();
       
       switch(opcion){
           case 1:
       System.out.println("Digita la cantidad que desea ingresar en la cuenta:");
       ingreso=entrada.nextDouble();
       SaldoActual = saldo_inicial+ingreso;  
       System.out.println("El saldo actual es "+ SaldoActual);
       break;
       
        case 2:
       System.out.println("Digite la cantidad que desea retirar:");
       retiro=entrada.nextDouble();
       if(retiro>=saldo_inicial){
           SaldoActual=saldo_inicial-retiro;
       System.out.println("Dinero en cuentra:"+SaldoActual);
           
       }

         
     System.out.println("No cuentas con el  saldo suficiente");   
         
         break;
           case 3:
           break;
           default:
          
    }

    

    
    }

    

}
    

