import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class Soldado{ //Clase Principal Soldado 
    
    //Atributos
    String nombre;
    String id;
    String rango;
    static List<Soldado> listaSoldadoRaso = new ArrayList<>();
    static List<Soldado> listaTeniente = new ArrayList<>();
    static List<Soldado> listaCapitan = new ArrayList<>();
    static List<Soldado> listaCoronel = new ArrayList<>();
    
    
    //Constructor
    public Soldado(String nombre, String id, String rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }

    public Soldado() {
        
    }


    public static void crearSoldado() {

        //El paserByte transforma el Optionpane String a un Byte
        //byte nivel = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el nivel del soldado:"));

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del soldado:");
        String id = JOptionPane.showInputDialog("Ingrese el ID del soldado:");
        String rango = JOptionPane.showInputDialog(
        "[1] SoldadoRaso \n" +
        "[2] Teniente \n" +
        "[3] Capitan \n" +
        "[4] Coronel \n" +
        "Ingrese el rango del soldado:");
        
        switch (rango) {
            case "1":
                Soldado nuevoSoldadoRaso = new Soldado(nombre, id, rango);
                listaSoldadoRaso.add(nuevoSoldadoRaso);
                break;
            case "2":
                Soldado nuevoTeniente = new Soldado(nombre, id, rango);
                listaTeniente.add(nuevoTeniente);
                break;
            case "3":
                Soldado nuevoCapitan = new Soldado(nombre, id, rango);
                listaCapitan.add(nuevoCapitan);
                break;
            case "4":
                Soldado nuevoCoronel = new Soldado(nombre, id, rango);
                listaCoronel.add(nuevoCoronel);
                break;
        
        
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }
        
        
        //List<Soldado> listaSoldados = new ArrayList<>();
        
        
        JOptionPane.showMessageDialog(null, "Soldado creado y agregado a la lista.");
        
    
    }


    // public static void menu(){
    //     while (true) {
                
    //         String opcion = JOptionPane.showInputDialog(
    //         "[1] SoldadoRaso \n" +
    //         "[2] Teniente \n" +
    //         "[3] Capitan \n" +
    //         "[4] Coronel \n" +
    //         "[0] Cerrar progama \n");

    //         //objetos necesarios para llamar a sus respectivos menus
    //         SoldadoRaso soldadoRaso = new SoldadoRaso(); 
    //         Teniente teniente = new Teniente();
    //         Capitan capitan = new Capitan();
    //         Coronel coronel = new Coronel();

    //         switch(opcion){
    //             case "1":
    //                 soldadoRaso.menu();
    //                 break;
    //             case "2":
    //                 teniente.menu();
    //                 break;
    //             case "3":                     
    //                 capitan.menu();
    //                 break;
    //             case "4":
    //                 coronel.menu();
    //                 break;
    //             case "0":
    //                 System.exit(0);
    //                 break;
    //             default:
    //                 JOptionPane.showMessageDialog(null, "Opcion no valida");
    //             }
            
    //         }
    // }
    
    public static void mostrarInformacion(){

        System.out.println("s");
        Soldado instancia = new Soldado();
        instancia.rango = JOptionPane.showInputDialog(
            "[1] SoldadoRaso \n" +
            "[2] Teniente \n" +
            "[3] Capitan \n" +
            "[4] Coronel \n" +
            
        "\nIngrese el rango del soldado:");

        instancia.id = JOptionPane.showInputDialog( "Ingrese el ID del soldado:");
        
        //FALTA QUE SOLO UN IF SE EJECUTE
        switch (instancia.rango) {
            case "1":
                for (Soldado soldado : listaSoldadoRaso) {

                    if(instancia.id.equals(listaSoldadoRaso.get(0).id)){
                        JOptionPane.showMessageDialog(null, 
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n");
                        System.out.println("x");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontro el soldado");                    }
                        
                    }
                break;

            case "2":
                System.out.println(listaTeniente.get(0).rango);
                for (Soldado soldado : listaTeniente) {

                    if(instancia.id.equals(listaTeniente.get(0).id)){
                        JOptionPane.showMessageDialog(null, 
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n");
                        System.out.println("y");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                        
                    }
                
                }
                break;

            case "3":
                for (Soldado soldado : listaCapitan) {

                    if(instancia.id.equals(listaCapitan.get(0).id)){
                        JOptionPane.showMessageDialog(null, 
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n");
                        System.out.println("z");
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                        
                    }
                
                }
                break;

            case "4":
                for (Soldado soldado : listaCoronel) {

                    if(instancia.id.equals(listaCoronel.get(0).id)){
                        JOptionPane.showMessageDialog(null, 
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n");
                        System.out.println("w");
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                        break;
                    }
                
                }
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }
        

    }
}
