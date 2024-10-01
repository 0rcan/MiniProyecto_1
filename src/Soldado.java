import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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

        String nombre = JOptionPane.showInputDialog(
        "Ingrese su nombre: \n" );
        String id = JOptionPane.showInputDialog("Ingrese su id: \n");
        String rango = JOptionPane.showInputDialog(
        "Ingrese su rango: \n");

        List<Soldado> listaSoldados = new ArrayList<>();
            listaSoldados.add(nuevoSoldado);

            JOptionPane.showMessageDialog(null, "Soldado creado y agregado a la lista.");


    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre); //crear  //mostrar //modificar
        System.out.println("ID: "+id);
        System.out.println("Rango: "+rango);
    }

}
