

package com.mycompany.banderacalificacion;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
         Scanner Brenda =new Scanner(System.in);
    int Calificacion1=0;
    int  Calificacion2=0;
    int  Calificacion3=0;
    int  Calificacion4=0;
    int  Calificacion5=0;
    boolean bandera1; 
    boolean bandera2; 
    boolean bandera3; 
    boolean bandera4; 
    boolean bandera5; 
    
         
   System.out.println("Dame la Calificacion 1:");
    Calificacion1 = Brenda.nextInt();
   System.out.println("Dame la Calificacion 2:");
    Calificacion2 = Brenda.nextInt();
   System.out.println("Dame la Calificacion 3:");
    Calificacion3 = Brenda.nextInt();
   System.out.println("Dame la Calificacion 4:");
    Calificacion4 = Brenda.nextInt();
   System.out.println("Dame la Calificacion 5:");
    Calificacion5 = Brenda.nextInt();
    
    
       bandera1=false;
       bandera1=(Calificacion1<=6);
       System.out.println("Calificiacion1 Reprobatoria:"+bandera1);
      
       bandera1=true;
       bandera1=(Calificacion1>=7);
       System.out.println("Calificiacion1 Aprovatoria:"+bandera1);
//********************************************************

       bandera2=false;
       bandera2=(Calificacion2<=6);
       System.out.println(" Calificiacion2 Reprobatoria:"+bandera2);
      
       bandera2=true;
       bandera2=(Calificacion2>=7);
       System.out.println("Calificiacion2  Aprovatoria:"+bandera2);
    //********************************************************
    
       bandera3=false;
       bandera3=(Calificacion3<=6);
       System.out.println("Calificiacion3  Reprobatoria:"+bandera3);
       
       bandera3=true;
       bandera3=(Calificacion3>=7);
       System.out.println("Calificiacion3 Aprovatoria:"+bandera3);
     //********************************************************
     
       bandera4=false;
       bandera4=(Calificacion4<=6);
       System.out.println("Calificiacion4 Reprobatoria:"+bandera4);
       
       bandera4=true;
       bandera4=(Calificacion4>=7);
       System.out.println("Calificiacion4 Aprovatoria:"+bandera4);
      //********************************************************
      
      
       bandera5=false;
       bandera5=(Calificacion5<=6);
       System.out.println("Calificiacion5 Reprobatoria:"+bandera5);
       
       bandera5=true;
       bandera5=(Calificacion5>=7);
       System.out.println("Calificiacion5 Aprovatoria:"+bandera5);





}

}

