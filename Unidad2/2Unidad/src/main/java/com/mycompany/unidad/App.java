

package com.mycompany.unidad;

//importar Librerias.
import java.io.*;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        
        //Definir Variables
    Scanner entrada=new Scanner(System.in);
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
}
