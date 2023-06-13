

package com.mycompany.descdiasema;

import java.util.Scanner;


public class App {
public static int Tp;
public static double Dinero;
public static String fecha;

    public static void main(String[] args) {
     
    Solicitar();
    Si();    
    }
public static void  Solicitar ()
    {
    // Montos
     Scanner Guardado =new Scanner(System.in);
     System.out.println("Ingresa monto");
     Tp= Guardado.nextInt();
     // Fecha
     System.out.println("Ingresa Fecha");
     Scanner sc = new Scanner(System.in);
      fecha = sc.nextLine();
    }
    public static void Si()
    {
 if ("martes".equals(fecha) ||"jueves".equals(fecha) )
 {
     double N = 0;
   Dinero=(N*0.15);
    System.out.println("Hoy toca descuento de " + Dinero);
   Dinero=(N-Dinero);
   System.out.println("El total de la compra es " + Dinero);
 }


}

}