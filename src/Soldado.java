import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class Soldado{ //Clase Principal Soldado 
    
    //Atributos
    String nombre;
    String id;
    String rango;

    //Listas de los diferentes rangos de tipo de dato soldado
    static List<Soldado> listaSoldadoRaso = new ArrayList<>();
    static List<Soldado> listaTeniente = new ArrayList<>();
    static List<Soldado> listaCapitan = new ArrayList<>();
    static List<Soldado> listaCoronel = new ArrayList<>();
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    //Constructor
    public Soldado(String nombre, String id, String rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }

    public Soldado() {
        
    }

    //Metodo para verificar si el ID ya existe en la lista
    public static boolean idExisteEnLista(List<Soldado> lista, String id) {
        
        //Recorre la lista<Soldado> verificando si el id ya existe
        for (Soldado soldado : lista) {
            if (soldado.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    /////////
    //CREAR//
    /////////

    public static void crear(){ 

        //Variable que almacena en que rango nos encontramos
        String rango = JOptionPane.showInputDialog(null,
        "[1] SoldadoRaso \n" +
        "[2] Teniente \n" +
        "[3] Capitan \n" +
        "[4] Coronel \n" +
        "\nIngrese el rango del soldado:", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        
        //Dependiendo del rango ejecuta un metodo en una clase diferente
        switch (rango) {
            case "1":
                SoldadoRaso nuevoSoldadoRaso = new SoldadoRaso();
                nuevoSoldadoRaso.crearSoldado();
                break;
            case "2":
                Teniente nuevoTeniente = new Teniente();
                nuevoTeniente.crearSoldado();
            break;
            case "3":
                Capitan nuevoCapitan = new Capitan();
                nuevoCapitan.crearSoldado();
            break;
            case "4":
                Coronel nuevoCoronel = new Coronel();
                nuevoCoronel.crearSoldado();
            break;

            default:
                JOptionPane.showMessageDialog(null, "Rango no valido", "Crear Soldado", JOptionPane.ERROR_MESSAGE);

                break;
        }
        
    }
    
    ///////////
    //MOSTRAR//
    ///////////

    public static void mostrar(){

        //Variable que almacena en que rango nos encontramos
        String rango = JOptionPane.showInputDialog(null,
            "[1] SoldadoRaso \n" +
            "[2] Teniente \n" +
            "[3] Capitan \n" +
            "[4] Coronel \n" +
            
        "\nIngrese el rango del soldado:", "Información Soldado", JOptionPane.QUESTION_MESSAGE);
        
        //Dependiendo del rango ejecuta un metodo en una clase diferente
        switch (rango) {
            case "1":
                SoldadoRaso nuevoSoldadoRaso = new SoldadoRaso();
                nuevoSoldadoRaso.mostrarInformacion();
                break;
            case "2":
                Teniente nuevoTeniente = new Teniente();
                nuevoTeniente.mostrarInformacion();
            break;
            case "3":
                Capitan nuevoCapitan = new Capitan();
                nuevoCapitan.mostrarInformacion();
            break;
            case "4":
                Coronel nuevoCoronel = new Coronel();
                nuevoCoronel.mostrarInformacion();
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Rango no valido", "Mostrar Soldado", JOptionPane.ERROR_MESSAGE);

                break;
        }

    }

    /////////////
    //MODIFICAR//
    /////////////

    public static void modificar() {
        
        //Variable que almacena en que rango nos encontramos
        String rango = JOptionPane.showInputDialog(null,
            "[1] SoldadoRaso \n" +
            "[2] Teniente \n" +
            "[3] Capitan \n" +
            "[4] Coronel \n" +
        
        "\nIngrese el rango del soldado:", "Modificar Soldado", JOptionPane.QUESTION_MESSAGE);

        //Dependiendo del rango ejecuta un metodo en una clase diferente
        switch (rango) {
            case "1":
                SoldadoRaso nuevoSoldadoRaso = new SoldadoRaso();
                nuevoSoldadoRaso.modificarSoldado();
                break;
            case "2":
                Teniente nuevoTeniente = new Teniente();
                nuevoTeniente.modificarSoldado();
            break;
            case "3":
                Capitan nuevoCapitan = new Capitan();
                nuevoCapitan.modificarSoldado();
            break;
            case "4":
                Coronel nuevoCoronel = new Coronel();
                nuevoCoronel.modificarSoldado();
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Rango no valido", "Modificar Soldado", JOptionPane.ERROR_MESSAGE);

                break;
        }



    }

}
