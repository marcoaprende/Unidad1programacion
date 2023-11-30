
package proyectoamerica;

import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static proyectoamerica.BusquedaCliente.ren;

public class Calculos {

    String [][] ClientesDeuda=new String[34][10];

    public float Moratorio=0;
     public float Total1=0;
     public Calculos(String[][] CD2) {

        ClientesDeuda = CD2;
    }
    
    public void Moratorio(){
          float dias=0;
          
        
        dias =Float.parseFloat(ClientesDeuda[ren][1])*10;
       Moratorio = dias * Float.parseFloat(ClientesDeuda[ren][4]);
        ClientesDeuda[ren][4] = String.valueOf(Moratorio).replaceAll("\\s+", " ");
        
    }
    
    public void Ordinario(){
        
        float interesActual;
        interesActual = (float) 11.2;
        float Ordinarios=0;
        Ordinarios=(float) (interesActual*Float.parseFloat(ClientesDeuda[ren][2]));
          ClientesDeuda[ren][13]= String.valueOf(Ordinarios).replaceAll("\\s+", " ");
    }
 public void Total(){
    
     Total1= ((Float.parseFloat(ClientesDeuda[ren][2])+Float.parseFloat(ClientesDeuda[ren][6])+Float.parseFloat(ClientesDeuda[ren][7])+Float.parseFloat(ClientesDeuda[ren][13])-Float.parseFloat(ClientesDeuda[ren][3]))*(Float.parseFloat(ClientesDeuda[ren][4])+Float.parseFloat(ClientesDeuda[ren][5])));
     ClientesDeuda[ren][8]= String.valueOf(Total1).replaceAll("\\s+", " ");
 }   
 
 public void Meses(){
       String Fecha="",Fecha2="";
    int MesesDeudados = 0;
     Fecha=( ClientesDeuda[ren][11]);
     Fecha2=( ClientesDeuda[ren][12]);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
try {
    Date fecha11 = sdf.parse(Fecha);
    Date fecha22 = sdf.parse(Fecha2);

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(fecha11);

    // Obtener la diferencia en meses entre las fechas
    Calendar calendar2 = Calendar.getInstance();
    calendar2.setTime(fecha22);
    int diffYears = calendar2.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
    int diffMonths = diffYears * 12 + calendar2.get(Calendar.MONTH) - calendar.get(Calendar.MONTH);
    MesesDeudados = diffMonths;
    ClientesDeuda[ren][1]  = String.valueOf(MesesDeudados).replaceAll("\\s+", " ");
    
} catch (java.text.ParseException e) {
    e.printStackTrace();
 
}
    
     
      
 }
}
