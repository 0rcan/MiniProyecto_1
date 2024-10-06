public class Capitan {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Funcionaaa");
        System.out.println("Estamos ready");
    }

    public static void menu(){ //metodo estatico menu
        Soldado.menu(); //en estaticos se debe llamar directamente a la clase padre
    }
}
