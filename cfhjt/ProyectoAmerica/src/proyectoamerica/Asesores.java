
package proyectoamerica;
public class  Asesores {
int Nace =16;
         String [][] AsesoresDatos=new String[31][6];
         String [][] EstadosDeMexico=new String[32][6];
    public Asesores (String [][] CD,String [][] CD2)
    {
        AsesoresDatos=CD;
        EstadosDeMexico=CD2;
    }
        public void TablaAsesor(){
           int a=0;int b=0; int c=0;
              int  Edo2 = 16;
            for (int ren = 0; ren < Nace; ren++) 
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
                System.out.println("");
            }
        
}
