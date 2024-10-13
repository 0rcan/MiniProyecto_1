import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class Soldado{ //Clase Principal Soldado 
    
    //Atributos
    String nombre;
    String id;
    String rango;
    static List<Soldado> listaSoldados = new ArrayList<>();
    
    
    
    public Soldado(String nombre, String id, String rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }

    public Soldado() {
        
    }


    // public static void menu(){
    // String opcion = JOptionPane.showInputDialog(
    //     "[1] Crear soldado \n" +
    //     "[2] Mostrar informacion del soldado \n" +
    //     "[3] Modificar soldado \n" +
    //     "[4] Cerrar programa  \n" +
    //     "[00] Regresar al menu principal \n");

    //     switch(opcion){
    //         case "1":
    //             Soldado.crearsoldado();
    //             break;
    //         case "2":
    //             Soldado.mostrarInformacion();
    //             break;
    //         case "3":
    //             Soldado.modificarSoldado();
    //             break;
    //         case "4":
    //             //Soldado.mostrarInformacion();
    //             break;
    //         case "00":
    //             // OperacionesMilitares op = new OperacionesMilitares(); //Cierra ventana actual
    //             // op.menu();
    //             break;
    //         default:
    //             JOptionPane.showMessageDialog(null, "Opcion no valida");
    // }
    
    // }
    

    // //Se crea el metodo para crear un soldado
    // public static void crearsoldado(){
    //         String nombre = JOptionPane.showInputDialog("Ingrese el nombre del soldado:");
    //         String id = JOptionPane.showInputDialog("Ingrese el ID del soldado:");
    //         String rango = JOptionPane.showInputDialog("Ingrese el rango del soldado:");
            
    //         Soldado nuevoSoldado = new Soldado(nombre, id, rango);
            
    //         //List<Soldado> listaSoldados = new ArrayList<>();
    //         listaSoldados.add(nuevoSoldado);
            
    //         JOptionPane.showMessageDialog(null, "Soldado creado y agregado a la lista.");
        
            
    //     }


    public static void mostrarInformacion(){

        Soldado instancia = new Soldado();
        instancia.rango = JOptionPane.showInputDialog(
            "[1] SoldadoRaso \n" +
            "[2] Teniente \n" +
            "[3] Capitan \n" +
            "[4] Coronel \n" +
            "Realizando busqueda \n"+
        "\nIngrese el rango del soldado:");

        instancia.id = JOptionPane.showInputDialog( "Ingrese el ID del soldado:");
        
        //FALTA QUE SOLO UN IF SE EJEVUTE
        for (Soldado soldado : listaSoldados) {

            if(instancia.rango.equals("1") && instancia.id.equals(soldado.id)){
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el soldado");
            }
            if(instancia.rango.equals("2") && instancia.id.equals(soldado.id)){
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                
            }
            if(instancia.rango.equals("3") && instancia.id.equals(soldado.id)){
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                
            }
            if(instancia.rango.equals("4") && instancia.id.equals(soldado.id)){
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n");
                break;
            }else{
                JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                
            }
            
            
        }


        

        
    }

    // public static void modificarSoldado(){

    // }
}
