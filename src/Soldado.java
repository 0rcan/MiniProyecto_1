import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class Soldado{ //Clase Principal Soldado 
    
    //Atributos
    String nombre;
    String id;
    String rango;
    
    List<Soldado> listaSoldados = new ArrayList<>();
    
    
    
    public Soldado(String nombre, String id, String rango) {
        
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        
    }
    public static void menu(){
    String opcion = JOptionPane.showInputDialog(
        "[1] Crear soldado \n" +
        "[2] Mostrar informacion del soildado \n" +
        "[3] Modificar soldado \n" +
        "[4] Cerrar programa  \n");
       
        switch(opcion){
            case "1":
                Soldado.crearsoldado();
                break;
            case "2":
                 Soldado.mostrarInformacion();
                break;
            default:
                  //code block;
    }
    
    
    
    }
    public Soldado() {
        
    }
    //Se crea el metodo para crear un soldado
    public static  void crearsoldado(){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del soldado:");
            String id = JOptionPane.showInputDialog("Ingrese el ID del soldado:");
            String rango = JOptionPane.showInputDialog("Ingrese el rango del soldado:");

            Soldado nuevoSoldado = new Soldado(nombre, id, rango);
            
            List<Soldado> listaSoldados = new ArrayList<>();
            listaSoldados.add(nuevoSoldado);
            
            JOptionPane.showMessageDialog(null, "Soldado creado y agregado a la lista.");
        }

        public static void mostrarInformacion(){

            Soldado[] listaSoldados;
        listaSoldados = new Soldado[3];
        for (Soldado soldado : listaSoldados) {
            System.out.println("Nombre: " + soldado.nombre);
            System.out.println("ID: " + soldado.id);
            System.out.println("Rango: " + soldado.rango);
        }
        
    }
}
