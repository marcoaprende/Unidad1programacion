

package com.mycompany.presenciaoperadadores6;

import java.util.Scanner;

public class Presenciaoperadadores6 {

       
        static double a=0,b=0,c=0,d=0,e=0,f=0,g=0,
                h=0,j=0,m=0,n=0,p=0,q=0,r=0,
                s=0,x=0,y=0;
      public static void main(String[] args) {
           pedirDatos();
    
    } 
        
 public static void pedirDatos(){
       Scanner laura=new Scanner(System.in);
     //Entrada de datos
      double a,b,c,d,f,g,h,j,e,i,m,n,q,r,s,x,y,p;
   System.out.println("Dame los Valores:");
             System.out.println("ValorA:"); 
                a = laura.nextInt();
            System.out.println("ValorB:");  
                b = laura.nextInt();
            System.out.println("ValorC:"); 
                c = laura.nextInt();
            System.out.println("ValorD:");
                d = laura.nextInt();
            System.out.println("ValorE:"); 
                e = laura.nextInt();
           System.out.println("ValorF:");  
                f = laura.nextInt();
            System.out.println("ValorG:");  
                g = laura.nextInt();
            System.out.println("ValorH:");
                h = laura.nextInt();
            System.out.println("ValorI:");  
                i = laura.nextInt();
            System.out.println("ValorJ:"); 
                j = laura.nextInt();
            System.out.println("ValorX:"); 
                x =laura.nextInt();
            System.out.println("valorY:"); 
                y = laura.nextInt();
            System.out.println("ValorM:"); 
                m = laura.nextInt();    
            System.out.println("ValorN:"); 
                n = laura.nextInt();  
            System.out.println("ValorS:"); 
                s = laura.nextInt(); 
            System.out.println("ValorP:"); 
                p = laura.nextInt(); 
            System.out.println("ValorQ:"); 
                q = laura.nextInt(); 
            System.out.println("ValorR:"); 
                r = laura.nextInt(); 

 //*********  IncisoA 
double calcularA;
calcularA=((3/2)+(4/3));
System.out.println("a)"+ calcularA);

//********** IncisoB
double calcularB;
calcularB= ((1/(x-5)) - ((3*x*y)/4));
System.out.println("b)"+ calcularB);

//********** IncisoC
double calcularC;
calcularC= ((1/2)+7);
System.out.println("c)"+ calcularC);

//********** IncisoD
double calcularD;
calcularD=((1/2)+7);
System.out.println("d)"+ calcularD);

//********** IncisoE
double calcularE;
calcularE= (((a*a) / (b-c))+ (d-e) / (f-((g*h) / j)));
System.out.println("e)"+ calcularE);
//********** IncisoF
double calcularF; 
calcularF= ((m/n)+p);
System.out.println("f)"+ calcularF);
//********** IncisoG
double calcularG; 
calcularG= (m+(n/(p-q)));
System.out.println("g)"+ calcularG);

//********** IncisoH
double calcularH; 
calcularH = (((a*a)/(b*b))+ ((c*c)/(d*d)));
System.out.println("H)"+ calcularH);

//********** Incisoi
double calcularI; 
calcularI = ((m+(n/p))/((q-(r/s))));
System.out.println("i)"+ calcularI);

//********** IncisoJ
double calcularJ; 
calcularJ = (((3*a)+b)/(c-(d+(5*e))/(f+(g/(2*h)))));
System.out.println("j)"+ calcularJ);

//********** IncisoK
double calcularK; 
calcularK = (((a*a)+(2*a*b)+(b*b))/((1/(x*x))+2));
System.out.println("k)"+ calcularK);

    
        
        }
}

