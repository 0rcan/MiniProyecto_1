import javax.swing.JOptionPane;

public class OperacionesMilitares {

    public void menu() {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
            "[1] SoldadoRaso \n" +
            "[2] Teniente \n" +
            "[3] Capitan \n" +
            "[4] Coronel \n" +
            "[X] Cerrar progama \n");
            
            switch(opcion){
                case "1":
                    SoldadoRaso.menu();
                    break;
                case "2":
                    Teniente.menu();
                    break;
                case "3":
                    Capitan.menu();
                    break;
                case "4":
                    Coronel.menu();
                    break;
                case "x":
                    System.exit(0);
                    break;
                case "X":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                }
            
            }
    }



    public void asignarMision(String mision){
        System.out.println("Asignando mision");
    }
    
    public void reportar (String mision){
        System.out.println("Reportando");
    }
}
