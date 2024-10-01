import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class Soldado{ //Clase Principal Soldado 
    
    //Atributos
    String nombre;
    String id;
    String rango;

    
    public Soldado(String nombre, String id, String rango) {
        
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        
    }
    public Soldado() {
        
    }
    public void crear(){
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del soldado:");
            String id = JOptionPane.showInputDialog("Ingrese el ID del soldado:");
            String rango = JOptionPane.showInputDialog("Ingrese el rango del soldado:");

            Soldado nuevoSoldado = new Soldado(nombre, id, rango);

            List<Soldado> listaSoldados = new ArrayList<>();
            listaSoldados.add(nuevoSoldado);

            JOptionPane.showMessageDialog(null, "Soldado creado y agregado a la lista.");

            System.out.println( listaSoldados);


    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre); //crear  //mostrar //modificar
        System.out.println("ID: "+id);
        System.out.println("Rango: "+rango);
    }

}
