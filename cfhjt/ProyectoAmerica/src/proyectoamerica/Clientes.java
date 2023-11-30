
package proyectoamerica;

import static proyectoamerica.BusquedaCliente.ren;


public class Clientes {
    int nC =34; 
    String [][] ClientesDatos=new String[31][6];
     String [][] ClientesDeuda=new String[34][13];
      String [][] EstadosDeMexico=new String[32][6];    
      
    public Clientes(String [][] CD6,String [][] CD10,String [][] CD3)
    {
        ClientesDatos=CD6;
        ClientesDeuda=CD10;
        EstadosDeMexico= CD3;
    }

    public void TablaCliente (){
        int Edo=0;
        
     Menu menuInstance = new Menu();
    float Moratorio2 = menuInstance.MoratorioActual;
    float IVA2 = menuInstance.IVAActual;

                 System.out.println("----------------------------------------------------------------------------------");
System.out.printf( "%-4s %-35s %-30s %-20s  %-25s %-25s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-25s%n",
                        "ID", "Nombre", "Estado", "Mensualidades","F.Venta", "F.Pago","Interes Ordinario", "Moratorio", "IVA", "SV", "SA", "Capital","Estatus de cliente","TOTAL");

                    //CALCULOS GENERALES PARA LA TABLA//             
                 

               /////////////////////////////////////////////////////////////////////////////////////

    for (int ren = 0; ren < nC; ren++) {
                 Edo = Integer.parseInt(ClientesDatos[ren][5]) - 1;
                   ClientesDeuda[ren][5] = String.valueOf(IVA2).replaceAll("\\s+", " ");
                   ClientesDeuda[ren][4] = String.valueOf(Moratorio2).replaceAll("\\s+", " ");
Calculos invo = new Calculos(ClientesDeuda);
SacarJudicial invo2 = new SacarJudicial(ClientesDeuda);
if(BusquedaCliente.ren!=ren ||BusquedaCliente.ren==0 ){
 BusquedaCliente.ren=ren;   
// Calcular Moratorio y Total

invo.Meses();
invo.Ordinario();
invo.Moratorio();
invo.Total();

 //////////////MOSTRAR SI VA A JUDICIAL///////////////////
invo2.Coloreo();
}

                // Imprimir datos del cliente
                // Imprimir datos del cliente
                       System.out.printf( "%-4s %-35s %-30s %-20s  %-25s %-25s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-25s%n",
                        ClientesDatos[ren][0], ClientesDatos[ren][1] + " " + ClientesDatos[ren][2] + " " + ClientesDatos[ren][3],
                        EstadosDeMexico[Edo][1], ClientesDeuda[ren][1],ClientesDeuda[ren][11],ClientesDeuda[ren][12],ClientesDeuda[ren][13], ClientesDeuda[ren][4],
                        ClientesDeuda[ren][5], ClientesDeuda[ren][7], ClientesDeuda[ren][6], ClientesDeuda[ren][2],ClientesDeuda[ren][9],ClientesDeuda[ren][8],ClientesDeuda[ren][9]);
 ClientesDeuda[ren][4] = String.valueOf(Moratorio2).replaceAll("\\s+", " ");
  ClientesDeuda[ren][5] = String.valueOf(IVA2).replaceAll("\\s+", " ");
    }

    System.out.println("----------------------------------------------------------------------------------");
    }

}
