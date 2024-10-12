import javax.swing.JOptionPane;

public class Teniente extends Rango implements OperacionesMilitares {
    String unidad;


    public Teniente(String unidad, int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id, rango);
        this.unidad = unidad;
    }

    public Teniente(){ //constructor vacio necesario para crear objetos de la clase
        
    }

    // public static void menu(){ //metodo estatico menu
    //     Soldado.menu(); //en estaticos se debe llamar directamente a la clase padre
    // }


    //metodo abstracto
    @Override 
    public void realizarAccion(){ 
        System.out.println("Supervisar a los soldados");
    }


     //metodos de la interfaz
@Override
public void menu() {

        String opcion = JOptionPane.showInputDialog(
            "[1] Crear soldado \n" +
            "[2] Mostrar informacion del soldado \n" +
            "[3] Modificar soldado \n" +
            "[0] Cerrar programa  \n" +
            "[00] Regresar al menu principal \n");

            Teniente teniente = new Teniente();

            switch(opcion){
                case "1":
                    teniente.crearSoldado();
                    break;
                case "2":
                    Soldado.mostrarInformacion();
                    break;
                case "3":
                    teniente.modificarSoldado();
                    break;
                case "0":
                    System.exit(0);
                    break;
                case "00":
                     // OperacionesMilitares op = new OperacionesMilitares(); //Cierra ventana actual
                     // op.menu();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    
    
    }
    
    @Override
    public void crearSoldado() {

            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del soldado:");
            String id = JOptionPane.showInputDialog("Ingrese el ID del soldado:");
            String rango = JOptionPane.showInputDialog("Ingrese el rango del soldado:");
            
            Soldado nuevoSoldado = new Soldado(nombre, id, rango);
            
             //List<Soldado> listaSoldados = new ArrayList<>();
            listaSoldados.add(nuevoSoldado);
            
            JOptionPane.showMessageDialog(null, "Soldado creado y agregado a la lista.");
            
        
    }

    @Override
    public void modificarSoldado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificarSoldado'");
    }


    @Override
    public void asignarMision(String mision) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asignarMision'");
    }

    @Override
    public void reportarEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reportarEstado'");
    }  
}
