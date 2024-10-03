// import javax.swing.JOptionPane;
// import java.util.ArrayList;
// import java.util.List;
public class SoldadoRaso extends Soldado {

    public SoldadoRaso(String nombre, String id, String rango) {
        super(nombre, id, rango);
    }
    public void realizarAccion(){
        System.out.println("Soy un soldado raso y estoy en combate");
    }

}
