public class Teniente extends Rango{
    String unidad;

    public Teniente(String unidad) {
        super(2);
        
        this.unidad = unidad;
    }

    public static void menu(){ //metodo estatico menu
        Soldado.menu(); //en estaticos se debe llamar directamente a la clase padre
    }

    @Override
    public void realizarAccion(){
        System.out.println("Supervisar a los soldados");
    }  
}
