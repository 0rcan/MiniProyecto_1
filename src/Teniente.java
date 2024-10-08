public class Teniente extends Rango implements OperacionesMilitares {
    String unidad;


    public Teniente(String unidad, int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id, rango);
        this.unidad = unidad;
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
