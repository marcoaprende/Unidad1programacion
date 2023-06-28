

package com.mycompany.menus;


public class Menus {
   

    public static void main(String[] args) {
    int i = 1;
        System.out.println("Numeros del uno al 100 CON Do: ");                                                             
        do{
                   System.out.println(i);
                   i++;
        }while(i<=100);
        
        System.out.println("Numeros del uno al 100 CON While: ");                                                            
         int j=1;
         while(j<=100) {
                   System.out.println(j);                                                                         
                   j++;
         }
        
     int num;
        
        System.out.println("Numeros del uno al 100 CON FOR ");

        for (num=1;num<=100;num++)
        {
            System.out.print(num+",");
        }
}   
}    
    