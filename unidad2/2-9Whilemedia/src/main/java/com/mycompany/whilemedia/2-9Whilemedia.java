

package com.mycompany.whilemedia;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num,suma, elementos;
        float media;
        System.out.println("Introduzca un numero");
        num=entrada.nextInt();
        
        suma=entrada.nextInt();
        suma=0;
        elementos=0;
        
        while(num<=0){
              suma+=num;
              elementos++;
         System.out.println("Introduzca otro numero");
          num=entrada.nextInt();
         

        
        }
         media=(float)suma/elementos;
            //castear un dato media=(float) 
         System.out.println("La media es de:"+ media);
        
        
        
        
        
                
    }
}
