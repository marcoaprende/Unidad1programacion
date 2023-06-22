

package com.mycompany.examenunidad1;

 import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    
        

//Varaibles
    public static float peso,altura,Formula;
    public static void main(String[] args) {
  //Ingresa datos
  datos();
 //Hace el calculo
  Proceso();
// Te da las dietas
  Dietas();
    }
    public static void datos()
    {
      System.out.println("Ingresa peso");
      Scanner sc = new Scanner(System.in);
      peso = sc.nextFloat();       
        System.out.println("Ingresa altura");
      altura = sc.nextFloat();
      
    }
    public static void Proceso()
    {
        //Formula

  Formula = (peso/(altura*altura));

  
    }
public static void Dietas()
{
//Decimal
    
DecimalFormat df = new DecimalFormat (".00");
/////////////////////////////////////////////////////////////////////////////////////
if (Formula<16)
{
 System.out.println("Indice de peso " + df.format(Formula)+ " Delgadez Severa " + "Menu 2 ");    
}
if (Formula>=16 && Formula<=16.99)
{
 System.out.println("Indice de peso " + df.format(Formula)+ " Delgadez Moderada " + "Menu 2 ");    
}
if (Formula>=17 && Formula<=18.49)
{
 System.out.println("Indice de peso " + df.format(Formula)+ " Delgadez " + "Menu 2 ");    
}
if (Formula>=18.49 && Formula<=24.99)
{
 System.out.println("Indice de peso " + df.format(Formula)+ " Normal " + "Menu Normal ");    
}
if (Formula>=25 && Formula<=29.99)
{
 System.out.println("Indice de peso " + df.format(Formula)+ " Sobre peso " + "Menu 3 ");    
}
if (Formula>=30 && Formula<=34.99)
{
 System.out.println("Indice de peso " + df.format(Formula)+ " Obeso 1 " + "Menu 3 ");    
}
if (Formula>=35 && Formula<=40)
{
 System.out.println("Indice de peso " + df.format(Formula)+ " Obeso 2 " + "Menu 3 ");    
}
if (Formula>40)
{
 System.out.println("No existe clasificacion, tal vez Morbida");    
}
}
}
