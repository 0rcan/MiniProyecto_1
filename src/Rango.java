public abstract class Rango extends Soldado{ //clase abstracta no puede instanciarse como objeto

    //Atributos abstracto
    int nivel;

    public Rango (int nivel, String nombre, String id, String rango){
        super(nombre, id, rango);
        this.nivel=nivel;
    }
    
    public Rango(){
        
    }

    //metodo abstracto
    public abstract void realizarAccion(); 
}
