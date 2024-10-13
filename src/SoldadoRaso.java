import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class SoldadoRaso extends Rango implements OperacionesMilitares {

    public SoldadoRaso(int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id, rango);
    }
    
    public SoldadoRaso(){ //constructor vacio necesario para crear objetos de la clase
        
    }

    // public static void menu(){ //metodo estatico menu
    //     Soldado.menu(); //en estaticos se debe llamar directamente a la clase padre
    // }

    //metodo abstracto
    public void realizarAccion(){
        System.out.println("Soy un soldado raso y estoy en combate");
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

            SoldadoRaso soldadoRaso = new SoldadoRaso();

            switch(opcion){
                case "1":
                    soldadoRaso.crearSoldado();
                    break;
                case "2":
                    Soldado.mostrarInformacion();
                    break;
                case "3":
                    soldadoRaso.modificarSoldado();
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
            
            
            Soldado nuevoSoldadoRaso = new Soldado(nombre, id, rango);
            
            //List<Soldado> listaSoldados = new ArrayList<>();
            listaSoldados.add(nuevoSoldadoRaso);
            
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
