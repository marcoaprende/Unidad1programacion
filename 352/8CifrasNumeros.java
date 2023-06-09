

package com.mycompany.cifrasnumericas;

    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
               //declaracion de datos
        int cifra=0;
        BufferedReader bufEntrada= new BufferedReader(new InputStreamReader(System.in));
   
        //entrada de datos
        System.out.println("dame un numero determinado");
        cifra= Integer.parseInt(bufEntrada.readLine());
        
        //Proceso de salida
        
        //Salidas LOL
    
         if (cifra<=0){
         System.out.println("No existen cifras menos o iguales a cero");
         }else if (cifra<=10){
            System.out.println("es de una cifra");
            
        }
        else if(cifra <=100){
            System.out.println("es de dos cifras");
        }
          else if(cifra<=1000){
            System.out.println("es de tres cifras");
        } else if (cifra<10000){
          System.out.println("es de cuatro cifras");
        
        }else if (cifra<=100000){
            System.out.println("es de cinco cifras");
        
        }
         
}
}
