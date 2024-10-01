import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---Bienvenido a la base militar---");

        boolean siclo = true;
        byte opcion = 0;

        System.out.println("#Selecciona un rango: ");
        System.out.println("[1] Soldado"+"/n[1] Soldado"+"[1] Soldado"+"[1] Soldado");

        Scanner respuesta = new Scanner(System.in);

        //Ciclo do while para el menu
        // do {
        //     switch() {
        //         case x:
        //           // code block
        //         break;
        //         case y:
        //           // code block
        //         break;
        //         default:
        //           // code block
        //     }
        // }
        // while (siclo);

        Soldado soldado1 = new Soldado("Juan", "123", "Soldado", 1);
        soldado1.mostrarInformacion();
    }
}
