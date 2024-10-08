public abstract class Rango extends Soldado{ //clase abstracta no puede instanciarse como objeto

    int nivel;

    public Rango (int nivel, String nombre, String id, String rango){
        super(nombre, id, rango);
        this.nivel=nivel;
    }
    


    public abstract void realizarAccion(); //metodo abstracto
}
