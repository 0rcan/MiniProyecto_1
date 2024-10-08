// import javax.swing.JOptionPane;
// import java.util.ArrayList;
// import java.util.List;
public class SoldadoRaso extends Rango implements OperacionesMilitares {

    public SoldadoRaso(int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id, rango);
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'menu'");
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
