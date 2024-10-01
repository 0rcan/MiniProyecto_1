public abstract class Rango { //clase abstracta no puede instanciarse como objeto

    int nivel;

    public Rango (int nivel){
        this.nivel=nivel;
    }

    public abstract void realizarAccion(); //metodo abstracto
}
