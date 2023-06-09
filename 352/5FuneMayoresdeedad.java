

package com.mycompany.funemayordeedad;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        //Delaracion de variables
        int edad;
        Scanner norma =new Scanner(System.in);
        //entrada de datos
        System.out.println("Edad a calcular");
        edad=norma.nextInt();
        System.out.println(MooM (edad));
        //Salida
    }
    public static String MooM (int masuco)
    {
        //Salida de datos
        if(masuco>=18){
        return "Mayor de edad";
        }else if(masuco<18){
         return "Menor de edad";

        }
        
        return "default";
    }
}
