

package com.mycompany.multiplo;
public class Multiplo {
package com.mycompany.v1trifiv;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class V1TRIFIV {

    public static void main(String[] args) throws IOException {
        //declaracion de datos
        int numero1;
        int multa3;
        int multa5;
        BufferedReader bufEntrada= new BufferedReader(new InputStreamReader(System.in));
   
        //entrada de datos
        System.out.println("dame el numero");
        numero1= Integer.parseInt(bufEntrada.readLine());
        
        //Proceso de salida
        multa3= numero1%3;
        multa5= numero1%5;
        //salida de datos
        if(multa3==0){ System.out.println("Try");
        
        }if(multa5==0){ System.out.println("Five");
        
        }if(multa3==0 && multa5== 0){ System.out.println("try five");
        }
        

    }
    }
    
   

    }
    }
    }
}
