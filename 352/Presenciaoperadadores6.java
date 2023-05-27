

package com.mycompany.presenciaoperadadores6;

import java.util.Scanner;

public class Presenciaoperadadores6 {

    public static void main(String[] args) {
       
        calcularoperaciones();  
     
    
    
    } 
        
 public static void calcularoperaciones(){
       
     //Entrada de datos
      double a,b,c,d,f,g,h,j,e,i,m,n,q,r,s;
      float x,y,p;
      int opci;
   Scanner laura = new Scanner(System.in);
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
calcularA=((1.5)+(1.3));
System.out.println("a)"+ calcularA);

//********** IncisoB
double calcularB;
calcularB= ((1/(x-5)) - ((3*x*y)/4));
System.out.println("b)"+ calcularB);

//********** IncisoC
double calcularC;
calcularC= ((.5)+7);
System.out.println("c)"+ calcularC);

//********** IncisoD
double calcularD;
calcularD=(.5+7);
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
calcularI = ((m+(n/p))/(q-(r/s)));
System.out.println("i)"+ calcularI);

//********** IncisoJ
double calcularJ; 
calcularJ = (((3*a)+b)/c-(d+(5*e))/(f+(g/(2*h))));
System.out.println("j)"+ calcularJ);

//********** IncisoK
double calcularK; 
calcularK = (((a*a)+(2*a*b)+(b*b))/((1/(x*x))+2));
System.out.println("k)"+ calcularK);

    
        
        }
}

