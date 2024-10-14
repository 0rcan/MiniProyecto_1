import javax.swing.JOptionPane;

public class Coronel extends Rango implements OperacionesMilitares { //clase Coronel que hereda de Rango e implementa la interfaz OperacionesMilitares
    
    String estrategia;

    public Coronel(String estrategia, int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id, rango);
        this.estrategia = estrategia;
    }
    
    public Coronel(){ //constructor vacio necesario para crear objetos de la clase
        
    }
    
    //metodo abstracto
    @Override
    public void realizarAccion() {
        // TODO Auto-generated method stub
        System.out.println("Planificar estrategias");
    }

    //metodos de la interfaz
    

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
