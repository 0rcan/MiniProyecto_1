import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        




		String opcion = JOptionPane.showInputDialog(
        "[1] SoldadoRaso \n" +
        "[2] Teniente \n" +
        "[3] Capitan \n" +
        "[4] Coronel \n" +
        "[X] Cerrar progama \n");
		//JOptionPane.showMessageDialog(null, "Hello " + name);
        switch(opcion){
            case "1":
            
                Soldado solado1 = new Soldado();
                solado1.crear();
                
                break;
                
            case "x":
                System.exit(0);
                break;
            default:
                  // code block
            }
        
        // System.out.println("---Bienvenido a la base militar---");

        // //boolean siclo = true;
        // //byte opcion = 0;

        // System.out.println("#Selecciona un rango: ");
        // System.out.println("[1] SoldadoRaso");
        // System.out.println("[2] Teniente");
        // System.out.println("[3] Capitan");
        // System.out.println("[4] Coronel");
        // System.out.println("[X] Cerrar progama");

        // Scanner respuesta = new Scanner(System.in);
        // String x = respuesta.nextLine();
        // System.out.println(respuesta);
        //Ciclo do while para el menu
        // do {
        //     
        //     
        // }
        // while (siclo);

        //Soldado soldado1 = new Soldado("Juan", "123", "Soldado", 1);
        //soldado1.mostrarInformacion();
    }
}
