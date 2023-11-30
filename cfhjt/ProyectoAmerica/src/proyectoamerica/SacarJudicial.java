
package proyectoamerica;
import static proyectoamerica.BusquedaCliente.ren;

public class SacarJudicial {
    
    String [][] ClientesDeuda=new String[34][10];
    
   public SacarJudicial(String[][] CD2) {

        ClientesDeuda = CD2;
    }
    
     public void Coloreo(){
   
         int x=Integer.parseInt(ClientesDeuda[ren][1]);
     if(x>3){
    
ClientesDeuda[ren][9] =  " Judicial".replaceAll("\\s+", " ");
     }
    
    
}
}