
package proyectoamerica;

import java.util.Scanner;



public class AsignacionAsesor {
    String [][] ClientesDatos=new String[34][6];
    String [][] ClientesDeuda=new String[34][10];
    String [][] ClientesAcuerdo=new String[34][6];
    String [][] AsesoresDatos=new String[31][6];
    String [][] EstadosDeMexico=new String[32][6];
    private int x1=0; 
    public  AsignacionAsesor (String[][] CD, String[][] CD2,String[][] CD5,String[][] CD4,String[][] CD3)
            
    {
        ClientesDatos = CD;
        ClientesDeuda = CD2;
        EstadosDeMexico= CD3;
        AsesoresDatos = CD4;
        ClientesAcuerdo= CD5;
    }
     public  void VisualDatosA(){         
      
      
  System.out.println("----------------------------------------------------------------------------------");    
   System.out.println("Desea modificar los estados de su chambeador");
    System.out.println("1: SI-------------------------- 2: NO");
                
               while(x1<2){
                       Scanner entrada= new Scanner(System.in);
    System.out.println("Digitalise opción si desea cambiar el del Asesor: ");
    x1 = entrada.nextInt();
    System.out.println("----------------------------------------------------------------------------------");
    
      switch (x1){
         case 1 -> { 
             Reasignacion();
             break;
         }
              case 2 -> {
                  break;
              }
         }  
          
          
 }
 }
     
     public void Reasignacion(){
     String x="",NewID; 
     int ren=0;
    Scanner entrada= new Scanner(System.in);
    System.out.println("Digitalise ID: ");
    x = entrada.next();
    System.out.println("----------------------------------------------------------------------------------"); 
         for (ren = 0; ren < AsesoresDatos.length; ren++) 
        {     

         if(x.equals(AsesoresDatos[ren][0])){
             
               int a=0;int b=0; int c=0;
              int  Edo2 = 16;
            for (int ren = 0; ren < AsesoresDatos.length; ren++) 
            {
                 int  Edo = ren;
              
                            System.out.println("----------------------------------------------------------------------------------");
                  System.out.printf("%-4s %-35s %-18s %-25s%n",
                        "ID", "Nombre",  "ID Estado","Estado");

     
                // Imprimir datos del cliente
                     System.out.printf("%-4s %-35s %-18s %-25s%n",
                        AsesoresDatos[ren][0], AsesoresDatos[ren][1] + " " + AsesoresDatos[ren][2] + " " + AsesoresDatos[ren][3],
                        AsesoresDatos[ren][4]+ "/"+ AsesoresDatos[ren][5],EstadosDeMexico[Edo][1]+ "/"+EstadosDeMexico[Edo2][1]);
     Edo2--;
                    
                }         
    System.out.println("Digitalise la nueva ID de Estado: ");
    NewID = entrada.next();
    System.out.println("----------------------------------------------------------------------------------"); 
             
    AsesoresDatos[ren][4] =  NewID.replaceAll("\\s+", " ");
             
                }
             
}
 }
 }

     


