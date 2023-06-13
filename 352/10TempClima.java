

package com.mycompany.temperatura;

import java.util.Scanner;


public class App {

    public static double Temperatura;
    public static void main(String[] args) {
  Temperatura();
  Si();
    }
    public static void Temperatura()
      {
      // Climas
     System.out.println("dime la temperatura");
     Scanner sc = new Scanner(System.in);
      Temperatura = sc.nextInt();      
      }
    public static void Si()
    {
        double Temperatura=0;
        if ( Temperatura <=10 )
        {
             System.out.println("Clima Frio ");
        }
        if (Temperatura >=10 && Temperatura <=20 )
        {
             System.out.println("Clima Nublado");
        }   
        if (Temperatura >=20 && Temperatura <=30 )
        {
             System.out.println("Clima Caluroso");
        }
                if ( Temperatura >=30 )
        {
             System.out.println("Clima Tropical");
        }
             
        }    
        }

