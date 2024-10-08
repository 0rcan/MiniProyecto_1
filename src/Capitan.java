public class Capitan extends Rango implements OperacionesMilitares{ //clase hija de Rango e implementa la interfaz OperacionesMilitares
    int cantidadSoldadosBajoSuMando;

    public Capitan(int cantidadSoldadosBajoSuMando, int nivel, String nombre, String id, String rango) { //constructor 
        super(nivel, nombre, id, rango); 
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }
    // public static void menu(){ //metodo estatico menu
    //     Soldado.menu(); //en estaticos se debe llamar directamente a la clase padre
    // }
    
    //metodo abstracto
    @Override
    public void realizarAccion() {
        // TODO Auto-generated method stub
        System.out.println("Dirigir a los soldados en combate");
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
