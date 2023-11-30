
package proyectoamerica;
import java.util.Scanner;


public class BusquedaCliente {
    String [][] ClientesDatos=new String[34][6];
    String [][] ClientesDeuda=new String[34][13];
    String [][] ClientesAcuerdo=new String[34][6];
    String [][] AsesoresDatos=new String[31][6];
    String [][] EstadosDeMexico=new String[32][6];
    public static int ren=0;
 
    
 public BusquedaCliente(String[][] CD, String[][] CD2,String[][] CD5,String[][] CD4,String[][] CD3) {

        ClientesDatos = CD;
        ClientesDeuda = CD2;
        EstadosDeMexico= CD3;
        AsesoresDatos = CD4;
        ClientesAcuerdo= CD5;
    }


 
 
    public void Buscador(){
        String x;
        int a=0,Edo=0;
        int c=0;
     Menu menuInstance = new Menu();
float Moratorio2 = menuInstance.MoratorioActual;
float IVA2 = menuInstance.IVAActual;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Coloque ID del cliente, si no la conoce consultelo en TODOS LOS CLIENTES: ");
        x = entrada.next();

        for (ren = 0; ren < ClientesDatos.length; ren++) 
        {
            if(x.equals(ClientesDatos[ren][0]))
            {
                  
                if((AsesoresDatos[InicioSesion.num][4]).equals (ClientesDatos[ren][5]) ||(AsesoresDatos[InicioSesion.num][5]).equals (ClientesDatos[ren][5]))
                {
              
    Edo = Integer.parseInt(ClientesDatos[ren][5]) - 1;

                 ClientesDeuda[ren][4] = String.valueOf(Moratorio2).replaceAll("\\s+", " ");
                  ClientesDeuda[ren][5] = String.valueOf(IVA2).replaceAll("\\s+", " ");
               //CALCULOS GENERALES PARA LA TABLA//             
               Calculos invo13 =new Calculos(ClientesDeuda);
                                 invo13.Meses();
               
               Calculos invo14 =new Calculos(ClientesDeuda);
                                 invo14.Ordinario();
                 Calculos invo11 =new Calculos(ClientesDeuda);
                                 invo11.Moratorio();
                                 
                   Calculos invo12 =new Calculos(ClientesDeuda);
                                 invo12.Total();
                
                                 //////////////MOSTRAR SI VA A JUDICIAL/////////////
                    SacarJudicial invo2 = new SacarJudicial(ClientesDeuda);
                                    invo2.Coloreo();
               /////////////////////////////////////////////////////////////////////////////////////
                // Imprimir títulos de las columnas
                System.out.println("----------------------------------------------------------------------------------");
System.out.printf( "%-4s %-35s %-30s %-20s  %-25s %-25s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-25s%n",
                        "ID", "Nombre", "Estado", "Mensualidades","F.Venta", "F.Pago","Interes Ordinario", "Moratorio", "IVA", "SV", "SA","Asesor","Clave Estado", "Capital","Estatus de cliente","TOTAL");

          
                // Imprimir datos del cliente
           System.out.printf( "%-4s %-35s %-30s %-20s  %-25s %-25s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-25s%n",
                        ClientesDatos[ren][0], ClientesDatos[ren][1] + " " + ClientesDatos[ren][2] + " " + ClientesDatos[ren][3],
                        EstadosDeMexico[Edo][1], ClientesDeuda[ren][1],ClientesDeuda[ren][11],ClientesDeuda[ren][12],ClientesDeuda[ren][13], ClientesDeuda[ren][4],
                        ClientesDeuda[ren][5], ClientesDeuda[ren][7], ClientesDeuda[ren][6],AsesoresDatos[ren][1] + " " + AsesoresDatos[ren][2] + " " + AsesoresDatos[ren][3],ClientesDatos[ren][5], ClientesDeuda[ren][2],ClientesDeuda[ren][9],ClientesDeuda[ren][8],ClientesDeuda[ren][9]);
                System.out.println("----------------------------------------------------------------------------------");
               
               System.out.printf("Duracion de la ultima llamada:   %s:%s:%s%n", ClientesAcuerdo[ren][4], ClientesAcuerdo[ren][3], ClientesAcuerdo[ren][2]);
                   System.out.println("Hora  "+ (ClientesAcuerdo[ren][6]));
                   System.out.println("Fecha  "+(ClientesAcuerdo[ren][5]));
                    System.out.println(ClientesAcuerdo[ren][1]);
                System.out.println("----------------------------------------------------------------------------------");
                System.out.println("¿Desea Relizar la llamada y modificacion de de acuerdos?");
                     while(c<2){
                            System.out.println("1 para si y 2 para no ");
                             System.out.println("----------------------------------------------------------------------------------");
                             c = entrada.nextInt();
                             
                                 switch(c){
                                     case 1 -> {
                                         Acuerdos invo7 =new Acuerdos(ClientesAcuerdo);
                                         invo7.TablaAcuerdo();
                         }
                                     case 2 ->{ ClientesDeuda[ren][4] = String.valueOf(Moratorio2).replaceAll("\\s+", " ");
                                               ClientesDeuda[ren][5] = String.valueOf(IVA2).replaceAll("\\s+", " ");
                                    
                                 }}
                            System.out.println("----------------------------------------------------------------------------------");
                     }
                    
                } 
                else 
                 {
                    System.out.println("Este Cliente no esta asignado a su Zona "); 
                 }
            }
                
            }
            
        }

    }


