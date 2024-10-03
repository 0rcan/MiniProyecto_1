import java.util.Scanner;
import javax.swing.JOptionPane;

public class App  {
    public static void main(String[] args) throws Exception {
        
        
        //Soldado soldado1= new Soldado();
       // soldado1.menu();
        
        // Soldado sold1 = new Soldado();
        // sold1.menu();


    


		String opcion = JOptionPane.showInputDialog(
        "[1] SoldadoRaso \n" +
        "[2] Teniente \n" +
        "[3] Capitan \n" +
        "[4] Coronel \n" +
        "[X] Cerrar progama \n");
	
        switch(opcion){
            case "1":
                Soldado.menu();
                break;
            case "x":
                  //code block
                break;
            default:
                 // code block
            }
        
        System.out.println("---Bienvenido a la base militar---");

        //boolean siclo = true;
        //byte opcion = 0;


      
      
    }
}
