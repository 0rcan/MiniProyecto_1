public class Teniente extends Rango{
    String unidad;

    public Teniente(String unidad) {
        super(2);
        
        this.unidad = unidad;
    }
    @Override
    public void realizarAccion(){
        System.out.println("Supervisar a los soldados");
    }  
}
