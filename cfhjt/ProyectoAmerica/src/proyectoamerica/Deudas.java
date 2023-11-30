
package proyectoamerica;

import java.util.Scanner;


public class Deudas {
   String [][] ClientesDeuda=new String[34][7];
  
   public Deudas(String [][] CD2)
    {
        ClientesDeuda=CD2;
    }
      
   
   
  
      public void Buscador2(){
        String x;
        int a=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Coloque ID del cliente, si no la conoce consultelo en TODOS LOS CLIENTES: ");
        x = entrada.next();
        
        System.out.println("es "+ClientesDeuda.length);
        for (int ren = 0; ren < ClientesDeuda.length; ren++) 
        {
            if(x.equals(ClientesDeuda[ren][0]))
            {
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println(ClientesDeuda[ren][1]+"\t"+ClientesDeuda[ren][2]+"\t"+ClientesDeuda[ren][3]+"\t"+ClientesDeuda[ren][4]+"\t"+ClientesDeuda[ren][5]+"\t"+ClientesDeuda[ren][6]);
                System.out.println("----------------------------------------------------------------------------------");
            } 
        }
    }
}
