import javax.swing.JOptionPane;
public class Soldado{ //Clase Principal Soldado 
    
    /////////////
    //ATRIBUTOS//
    /////////////

    String nombre;
    String id;
    String rango;
    
    ///////////////
    //CONSTRUCTOR//
    ///////////////

    public Soldado(String nombre, String id, String rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }
    
    public Soldado() {
        
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
        //En este caso se crea un soldado
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
        //En este caso se muestra la informacion de un soldado
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
        //En este caso se modifica la información de un soldado
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
