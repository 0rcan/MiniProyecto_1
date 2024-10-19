import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class SoldadoRaso extends Rango implements OperacionesMilitares {

    public SoldadoRaso(int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id, rango);
    }
    
    public SoldadoRaso(){ //constructor vacio necesario para crear objetos de la clase
        
    }

    // public static void menu(){ //metodo estatico menu
    //     Soldado.menu(); //en estaticos se debe llamar directamente a la clase padre
    // }

    //metodo abstracto
    public void realizarAccion(){
        System.out.println("Soy un soldado raso y estoy en combate");
    }


    //metodos de la interfaz

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

    @Override
    public void crearSoldado() {

        //Datos que se compararan con la lista 
        rango = "1";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null,"Ingrese el ID del soldado:", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        Soldado nuevoSoldadoRaso = new Soldado(nombre, id,rango);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaSoldadoRaso, id)){
                    
                    listaSoldadoRaso.add(nuevoSoldadoRaso); //Se cumple la condicion se agrega el soldado
                    
                    JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Soldado", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Soldado", JOptionPane.ERROR_MESSAGE);
                }
        
    }

    @Override
    public void mostrarInformacion() {

        //Variable para verificar si el soldado fue encontrado
        boolean encontrado = false;
        
        //Datos que se compararan con la lista 
        rango = "1";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);
        
        //Siclo para recorrer la lista
        for (Soldado soldado : listaSoldadoRaso) {
            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(nombre.equals(soldado.nombre) && rango.equals(soldado.rango) && id.equals(soldado.id)){

                //Si se cumple muestra lo siguiente
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.rango + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.nombre + "\n", "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("x");

                //Si el soldado fue encontrado la varieable se actualiza
                encontrado = true;
                break;
            }
        }
        //Si el soldado no fue encontrado se muestra este mensaje
        if (encontrado == false) {
            JOptionPane.showMessageDialog(null, "No se encontró el soldado", "Información Soldado", JOptionPane.ERROR_MESSAGE);
        }
    }


    @Override
    public void modificarSoldado() {
        
        //Variable para verificar si el soldado fue encontrado
        boolean encontrado = false;
        String nuevoId;
        boolean idValido;

        //Datos que se compararan con la lista 
        rango = "1";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Modificar Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:", "Modificar Soldado", JOptionPane.QUESTION_MESSAGE);
    
        //Siclo para recorrer la lista
        for (Soldado soldado : listaSoldadoRaso) {

            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(nombre.equals(soldado.nombre) && rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista donde se almacenan los soldados
                //Remplazo de datos
                soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del soldado:", "Modificar Nombre Soldado", JOptionPane.QUESTION_MESSAGE);
                
                //do while para evitar ids repetidos
                do {
                    //Variable para ingresar el nuevo id
                    nuevoId = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID del soldado:", "Modificar ID Soldado", JOptionPane.QUESTION_MESSAGE);
                    
                    //Si el id existe entonces la variable idValido sera falsa
                    //De lo contrario sera false
                    idValido = !idExisteEnLista(listaSoldadoRaso, nuevoId);

                    //convertimos la variable a lo contrario entonces se muestra el mensaje
                    if (!idValido) { 
                        JOptionPane.showMessageDialog(null, "El ID ya existe en la lista", "Información Soldado", JOptionPane.ERROR_MESSAGE);
                    }

                //Mientras siga siendo verdad 
                //seguira en el siclo hasta que el id sea diferente a uno existente
                } while (!idValido);
                
                soldado.id = nuevoId; //Se actualiza el id del soldado

                //Mostrar la informacion del soldado actualizada
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("FUNCIONA");
                JOptionPane.showMessageDialog(null, "Soldado Actualizado Con éxito", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                
                //Si el soldado fue encontrado la varieable se actualiza
                encontrado = true;

                //Fin del siclo for
                break;
            }
                
        }
        //Si el soldado no fue encontrado se muestra este mensaje
        if(encontrado == false){
            JOptionPane.showMessageDialog(null, "No se encontró el soldado", "Información Soldado", JOptionPane.ERROR_MESSAGE);
        }
        

    }

}
