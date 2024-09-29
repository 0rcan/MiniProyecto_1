public class OperacionesMilitares {

    //Atributos
    boolean operacion;

    public OperacionesMilitares(boolean operacion) {
        this.operacion = operacion;
    }

    public OperacionesMilitares() {
    }

    public boolean isOperacion() {
        return operacion;
    }

    public void setOperacion(boolean operacion) {
        this.operacion = operacion;
    }

    public void iniciarOperacion(){
        System.out.println("Operación iniciada");
    }
    

}
