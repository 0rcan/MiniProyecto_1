import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Coronel extends Rango implements OperacionesMilitares { //clase Coronel que hereda de Rango e implementa la interfaz OperacionesMilitares
    
    String estrategia;
    static List<String> misionCoronel = new ArrayList<>();
    static List<String> reportarCoronel = new ArrayList<>();

    public Coronel(String estrategia, int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id, rango);
        this.estrategia = estrategia;
    }
    
    public Coronel(){ //constructor vacio necesario para crear objetos de la clase
        
    }
    
    //metodo abstracto
    @Override
    public void realizarAccion() {
        // TODO Auto-generated method stub
        System.out.println("Planificar estrategias");
    }

    //////////////////////////
    //metodos/de/la/interfaz//
    //////////////////////////

    
    @Override
    public void asignarMision(String mision) {
        //El polimorfismo se encarga de añadir la mision a la lista
        misionCoronel.add(mision);
        System.out.println( "Misión asignada: " + mision);
    }
    @Override
    public void reportarEstado() {
        
        String reporte = JOptionPane.showInputDialog(null, "Ingrese el reporte del soldado", "Reportar Estado", JOptionPane.QUESTION_MESSAGE);
        //El polimorfismo se encarga de añadir el reporte a la lista
        reportarCoronel.add(reporte);
        System.out.println( "Misión asignada: " + reporte);
    }

    @Override
    public void crearSoldado() {

        //Datos que se compararan con la lista 
        rango = "4";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null,"Ingrese el ID del soldado:", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        
        //Asignamos una mision al soldado
        String mision = JOptionPane.showInputDialog(null, "Asigne una misíon al soldado Raso", "Asignar Misión", JOptionPane.QUESTION_MESSAGE);
        asignarMision(mision); //Se asigna la mision al soldado
        reportarEstado();

        Soldado nuevoCoronel = new Soldado(nombre, id,rango);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaCoronel, id)){
                    
                    listaCoronel.add(nuevoCoronel); //Se cumple la condicion se agrega el soldado
                    
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
        rango = "4";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);
    
        int contador = 0;
        //Siclo para recorrer la lista
        for (Soldado soldado : listaCoronel) {

            System.out.println(listaCoronel.size());
            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(nombre.equals(soldado.nombre) && rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Si se cumple muestra lo siguiente
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n", "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                
                //Cuando el contador este igualado al indice se imprime en pantalla
                JOptionPane.showMessageDialog(null, "Misión: " + misionCoronel.get(contador), "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Reporte: " + reportarCoronel.get(contador), "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                
                //asignarMision(mision);

                System.out.println("x");

                //Si el soldado fue encontrado la varieable se actualiza
                encontrado = true;
                break;
            }else{
                contador++;//incrementamos el contador para que este en el mismo indice que el soldado
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
        rango = "4";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Modificar Soldado", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:", "Modificar Soldado", JOptionPane.QUESTION_MESSAGE);
        int contador = 0;
        //Siclo para recorrer la lista
        for (Soldado soldado : listaCoronel) {

            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(nombre.equals(soldado.nombre) && rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista donde se almacenan los soldados
                //Remplazo de datos
                JOptionPane.showMessageDialog(null, "Soldado encontrado", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del soldado:", "Modificar Nombre Soldado", JOptionPane.QUESTION_MESSAGE);
                
                //do while para evitar ids repetidos
                do {
                    //Variable para ingresar el nuevo id
                    nuevoId = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID del soldado:", "Modificar ID Soldado", JOptionPane.QUESTION_MESSAGE);
                    
                    //Si el id existe entonces la variable idValido sera falsa
                    //De lo contrario sera false
                    idValido = !idExisteEnLista(listaCoronel, nuevoId);

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

                //Remplazamos el elemento de la posicion contador con su nueva mision gracias a ser
                String mision = JOptionPane.showInputDialog(null, "Ingrese la nueva misión del soldado", "Modificar Misión", JOptionPane.QUESTION_MESSAGE);
                misionCoronel.set(contador,mision);
                String reporte = JOptionPane.showInputDialog(null, "Ingrese la nueva misión del soldado", "Modificar Misión", JOptionPane.QUESTION_MESSAGE);
                reportarCoronel.set(contador,reporte);

                JOptionPane.showMessageDialog(null, "Soldado Actualizado Con éxito", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                

                //Si el soldado fue encontrado la varieable se actualiza
                encontrado = true;

                //Fin del siclo for
                break;
            }else{
                contador++;//incrementamos el contador para que este en el mismo indice que el soldado
            }
        }
        //Si el soldado no fue encontrado se muestra este mensaje
        if(encontrado == false){
            JOptionPane.showMessageDialog(null, "No se encontró el soldado", "Información Soldado", JOptionPane.ERROR_MESSAGE);
        }
    
    }

    
}
