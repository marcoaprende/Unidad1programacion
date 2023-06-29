package com.mycompany.menus1;

import java.util.Scanner;
import java.io.*;


public class App {
public static  Scanner entrada = new Scanner(System.in);
public static  int opcion1,opcion2;
public static double ingresodato,retiro,saldo;
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

       // Entrada de datos
        System.out.println("Su total de compra es: $" + PV + "\n");
        System.out.println("Tienes un codigo de descuento, escríbelo:");
        codPromocion = entrada.next();
        codPromocion = codPromocion.toUpperCase();
         
        // Proceso
        // Salida de datos
        switch(codPromocion) {
            case "PLATINOOCTUBRE":
                descuento = 20;
                break; 
               
            case "SILVEROCTUBRE":
                descuento = 50; 
                break;
             
            case "BRONCEOCTUBRE":
                descuento = 35;
                break;
                
            case "OROOCTUBRE":
                descuento = 75;
                break;    
                
            default:
                System.out.println("Se ha introducido un código de descuento inválido.");
                break;
                
                
                
        }
        
       preciofinal = PV - (PV * descuento / 100); // Restar el descuento al precio original
        System.out.println("El total con el descuento aplicado es: $" + preciofinal);
   
 }
   
   
     static void Cajero() {
     System.out.println("Operacion de un Cajero:"); 
     
    
    public static void LecturaOpcion(){
    //Menu para ingresar opciones  
System.out.println("Depositar con 1");
System.out.println("Retirar con 2");
opcion1 = entrada.nextInt();
    
    }
 public static void Opciones()  {
     //Muestra el saldo antes del movimiento
System.out.println("Tu saldo es de " + saldo);
     //PROCESO DESPUES DE LA SELECCION DE OPCIONES PRECESO
     if (opcion1 == 1){
    System.out.println("Ingresa monto del deposito");
    ingresodato = entrada.nextDouble();
    saldo =(saldo + ingresodato); 
    System.out.println("Tu saldo es de " + saldo);
 }    
  if (opcion1 == 2){
   
        System.out.println("Ingresa monto del retiro");
      ingresodato = entrada.nextDouble();
    if(ingresodato<=saldo){
        saldo =(saldo - ingresodato);
            System.out.println("Tu saldo es de " + saldo);
    }
    else
    {
     System.out.println("No saldo");   
    }
   } 
 
 }
 public static void Bucle(){
  //Variable para bucle  
     int c=1; 
 //Bucle
     while(c==1){
         System.out.println("¿Quieres movimiento en tu cuenta?");
     
          System.out.println("Coloca 1 para SI////Coloca 2 para NO");
            opcion2=entrada.nextInt();
   if(opcion2 == 1)  
     {
         Lecturaopcion();
         Opciones();
     }
   else{
     System.out.println("Vuelva Pronto");  
     c++;
   }
     }
    
 }    
          

  
}



