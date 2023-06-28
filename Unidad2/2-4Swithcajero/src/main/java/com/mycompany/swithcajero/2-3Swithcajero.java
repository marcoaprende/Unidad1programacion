

package com.mycompany.swithcajero;

import java.util.Scanner;
public class Swithcajero {

    public static void main(String[] args) {
       //Variables
       final int saldo_inicial=1000;
       int opcion;
       double ingreso,SaldoActual,retiro;
       Scanner entrada=new Scanner(System.in);
       
       
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

         {
     System.out.println("No cuentas con el  saldo suficiente");   
         }
         break;
           case 3:
           break;
           default:
           
           
           
       }
        
        
        
        
        
    }
}
