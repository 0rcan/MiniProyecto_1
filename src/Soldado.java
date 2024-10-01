public class Soldado extends Rango{ //Clase Soldado hereda de Rango
    
    //Atributos
    String nombre;
    String id;
    String rango;

    //agregamos int nivel al contructor
    public Soldado(String nombre, String id, String rango, int nivel) {

        //super va siempre primero
        super(nivel);  //heredamos el atributo nivel de la clase padre
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
        
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+id);
        System.out.println("Rango: "+rango);
    }

    //para no agregar abstract en esta clase
    @Override //sobreescribimos el metodo de la clase padre
    public void realizarAccion(){ // agregamos el metodo de la clase padre
        System.out.println("Realizando accion");
    }

}
