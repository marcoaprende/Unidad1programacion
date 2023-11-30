
package proyectoamerica;

public class ProyectoAmerica {
    

    public static void main(String[] args) {     
                String [][] AsesoresDatos={  
                                       {"1","Juan","Perez","Perez","1","17","1705"},
                                       {"2","Pedro","Arellano","Yañez","2","18","1705"},
                                       {"3","Marco","Hernandez","Rocha","3","19","1705"}, 
                                       {"4","Jose","Perez","Betancurt","4","20","1705"},
                                       {"5","Tania","Serrano","Aguliar","5","21","1705"},
                                       {"6","Karla","Gomez","Gonzales","6","22","1705"},
                                       {"7","Lalo","Ortiz","Leon","7","23","1705"},
                                       {"8","Goku","Hernandez","Hernandez","8","24","1705"},
                                       {"9","Juan","Ludovico","Fernandez","9","25","1705"},
                                       {"10","Maria","Lagos","Frias","10","26","1705"},
                                       {"11","Carlos","Vazquez","de la Hacienda","11","27","1705"},
                                       {"12","Gullermo","Barreras","Cruz","12","28","1705"},
                                       {"13","Oscar","Tesla","Hernandez","13","29","1705"},
                                       {"14","Daniela","Martinez","Sandoval","14","30","1705"},
                                       {"15","Fernanda","Bolivar","Venezuela","15","31","1705"},
                                       {"16","Gonzalo","Yañez","Flores","16","32","1705"},
                                       {"000","Jefe","Jefesito","Jefazo","","","DosUnos11"},
                                       };   
                
    InicioSesion invo1 =new InicioSesion(AsesoresDatos);
             invo1.Sesion();

    }

    
}
