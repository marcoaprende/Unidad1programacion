

package com.mycompany.banderas;


public class App {

    public static void main(String[] args) {
         
        int edadJuan=22;
        int edadPedro=20;
        int edadLupe=35;
        boolean bandera1;
        boolean bandera2;
        boolean bandera3;
        bandera1 = (edadJuan>edadPedro);
        System.out.println("Resultado de bandera1:"+bandera1);
        bandera2=(edadLupe<edadPedro);
        System.out.println("Resultado de bandera2"+bandera2);
        bandera3 = (bandera1 && bandera2);
        System.out.println("Resultado de bandera3"+bandera3);
        
        
    }
}
