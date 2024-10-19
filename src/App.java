// import java.util.Scanner;
import javax.swing.JOptionPane;

public class App  {
    public static void main(String[] args) throws Exception {
        
        while (true) {
            
            String opcion = JOptionPane.showInputDialog(null,
                "[1] Crear soldado \n" +
                "[2] Mostrar informacion del soldado \n" +
                "[3] Modificar soldado \n" +
                "[0] Cerrar programa  \n\n", "Base Militar De Colombia", JOptionPane.QUESTION_MESSAGE);

                //SoldadoRaso soldadoRaso = new SoldadoRaso();

                switch(opcion){
                    case "1":
                        Soldado.crear();
                        break;
                    case "2":
                        Soldado.mostrar();
                        break;
                    case "3":
                        Soldado.modificar();
                        break;
                    case "0":
                        System.exit(0);
                        break;
                    default:
                    JOptionPane.showMessageDialog(null, "No se encontró el soldado", "Base Militar De Colombia", JOptionPane.ERROR_MESSAGE);
            }
        
        }


        //System.out.println("---Bienvenido a la base militar---");


    }
}
