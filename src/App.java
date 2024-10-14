// import java.util.Scanner;
import javax.swing.JOptionPane;

public class App  {
    public static void main(String[] args) throws Exception {
        
        while (true) {
            
            String opcion = JOptionPane.showInputDialog(
                "[1] Crear soldado \n" +
                "[2] Mostrar informacion del soldado \n" +
                "[3] Modificar soldado \n" +
                "[0] Cerrar programa  \n");

                SoldadoRaso soldadoRaso = new SoldadoRaso();

                switch(opcion){
                    case "1":
                        Soldado.crearSoldado();
                        break;
                    case "2":
                        Soldado.mostrarInformacion();
                        break;
                    case "3":
                        soldadoRaso.modificarSoldado();
                        break;
                    case "0":
                        System.exit(0);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        
        }

            // while (true) {
                
            //     String opcion = JOptionPane.showInputDialog(
            //     "[1] SoldadoRaso \n" +
            //     "[2] Teniente \n" +
            //     "[3] Capitan \n" +
            //     "[4] Coronel \n" +
            //     "[0] Cerrar progama \n");

            //     //objetos necesarios para llamar a sus respectivos menus
            //     SoldadoRaso soldadoRaso = new SoldadoRaso(); 
            //     Teniente teniente = new Teniente();
            //     Capitan capitan = new Capitan();
            //     Coronel coronel = new Coronel();

            //     switch(opcion){
            //         case "1":
            //             soldadoRaso.menu();
            //             break;
            //         case "2":
            //             teniente.menu();
            //             break;
            //         case "3":                     
            //             capitan.menu();
            //             break;
            //         case "4":
            //             coronel.menu();
            //             break;
            //         case "0":
            //             System.exit(0);
            //             break;
            //         default:
            //             JOptionPane.showMessageDialog(null, "Opcion no valida");
            //         }
                
            //     }
        
        
        //System.out.println("---Bienvenido a la base militar---");


    }
}
