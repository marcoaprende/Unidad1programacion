
package proyectoamerica;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Acuerdos {
String [][] ClienteAcuerdo=new String[34][6];  

String Acu="";
int segundos,minutos,horas = 00;
 public Acuerdos(String[][] CD7) {
        ClienteAcuerdo = CD7; 
    }
 
   public void TablaAcuerdo() {
        Scanner entrada = new Scanner(System.in);

     
        Thread cronometroThread = new Thread(new Cronometro());
        cronometroThread.start();

        System.out.println("Coloque los acuerdos razonados con el cliente ");
        Acu = entrada.nextLine();
        ClienteAcuerdo[BusquedaCliente.ren][1] = Acu.replaceAll("\\s+", " ");


        cronometroThread.interrupt();

       // System.out.println(ClienteAcuerdo[BusquedaCliente.ren][1]);
          System.out.printf("Tiempo transcurrido: %02d:%02d:%02d%n", horas, minutos, segundos);
   
          Acuerdos.ObtenerFechaHora obtenerFechaHora = new Acuerdos.ObtenerFechaHora();
        obtenerFechaHora.Cuando();
     
    }

    class Cronometro implements Runnable {
        @Override
        public void run() {
            try {
                
                while (true) {
                  
                    Thread.sleep(1000);  // Dormir el hilo por 1 segundo
                    segundos++;
                    ClienteAcuerdo[BusquedaCliente.ren][2]= String.valueOf(segundos);
                    if(segundos==60){
                       minutos ++;
                       segundos=0;
                              ClienteAcuerdo[BusquedaCliente.ren][2]= String.valueOf(segundos);
                                     ClienteAcuerdo[BusquedaCliente.ren][3]= String.valueOf(minutos);
                    }
                    if(minutos==60)
                    {
                        horas++;     
                        minutos=0;
                         ClienteAcuerdo[BusquedaCliente.ren][3]= String.valueOf(minutos);
                          ClienteAcuerdo[BusquedaCliente.ren][4]= String.valueOf(horas);
                        
                    }
                }
            } catch (InterruptedException e) {
                // El hilo se interrumpe cuando se completa la entrada del usuario
            }
        }
    }
   public class ObtenerFechaHora {
    public void Cuando() {
        // Obtener la fecha y hora actual
        LocalDateTime now = LocalDateTime.now();

        // Fecha sintaxis creo
        DateTimeFormatter formatterFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ClienteAcuerdo[BusquedaCliente.ren][5] = now.format(formatterFecha);

        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        ClienteAcuerdo[BusquedaCliente.ren][6] = now.format(formatterHora);
    }
}
}

    

