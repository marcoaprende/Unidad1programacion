
package proyectoamerica;
import proyectoamerica.Menu;
import java.util.Scanner;


public class InicioSesion {
      String [][] AsesoresDatos=new String[16][6];

      public static int num=0;
   public InicioSesion(String [][] CD15)
    {
        AsesoresDatos=CD15;
    }
   

      public  void Sesion(){
        String x, y;
   
        //ID
        Scanner entrada = new Scanner(System.in);
        System.out.println("Esciba su ID ");
         System.out.println("----------------------------------------------------------------------------------");
        x = entrada.next();    
        for (int ren = 0; ren < AsesoresDatos.length; ren++) 
        {
            if(x.equals(AsesoresDatos[ren][0]))
            {
        //PASSWORD
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Esciba su Contraseña de usuario ");
         System.out.println("----------------------------------------------------------------------------------");
        y = entrada2.next();
        System.out.println("Contraseña almacenada: " + AsesoresDatos[ren][6]);
               
        if(y.equals(AsesoresDatos[ren][6])){
 if(x.equals(AsesoresDatos[16][0])){
     Menu2.Mainmenu2(); 
     
 }
 
                    System.out.println("Bienvenido "+ (AsesoresDatos[ren][1])+" "+ (AsesoresDatos[ren][2])+" "+ (AsesoresDatos[ren][3]));
                    Menu.Mainmenu();  
                }
            else
            {
                 System.out.println("Su  contraseña es erronea");
            }
            }  
     
           
        }
         



    }
}
