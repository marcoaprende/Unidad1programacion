
package com.mycompany.trifiv;

import java.util.Scanner;
public class 4V3TRIFIV{

    public static void main(String[] args) {
    
    //Declaracion de variables
    Scanner entrada =new Scanner(System.in);
    
    int numero;
    
    //Entrada de datos
    System.out.println("Dame un numero:");
    numero = entrada.nextInt();
    //salida de datos
    System.out.println("retornoMultiplo(numero)");       
    }
      public static String retornarMultiplo1(int num){
      //DECLARacion de Variables
          
      int mult3;
      int mult5;
      //PRECESAMIENTO DE DATOS
      mult3=num %3;
      mult5=num %5;
      //SALIDA DE DATOS
      if(mult3 ==0 && mult5== 0){
          return "TRIFIV";
      }else if (mult3==0){
      return "Tri";
      }else if (mult5==0){
      
      }
      return "Ningun caso";
      } 
    }

