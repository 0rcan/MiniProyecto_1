import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Coronel extends Rango implements OperacionesMilitares { //clase Coronel que hereda de Rango e implementa la interfaz OperacionesMilitares
    
    String estrategia;
    static ArrayList<Coronel> listaCoronel = new ArrayList<>();
    static List<String> accionCoronel = new ArrayList<>();
    static List<String> misionCoronel = new ArrayList<>();
    static List<String> reportarCoronel = new ArrayList<>();

    public Coronel(String estrategia, int nivel, String nombre, String id, String rango) {
        super(nivel, nombre, id, rango);
        this.estrategia = estrategia;
    }
    
    public Coronel(){ //constructor vacio necesario para crear objetos de la clase
        
    }
    
    //////////
    //METODO//
    //////////

    //Metodo para verificar si el ID ya existe en la lista
    public static boolean idExisteEnLista(List<Coronel> lista, String id) {
        
        //Recorre la lista<Coronel> verificando si el id ya existe
        for (Coronel soldado : lista) {
            if (soldado.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    ////////////////////
    //METODO/ABSTRACTO//
    ////////////////////

    public void realizarAccion(){
    
        String accion = JOptionPane.showInputDialog(null, "Ingrese la accion del Coronel ", "Acción Coronel ", JOptionPane.QUESTION_MESSAGE);
                
        accionCoronel.add(accion);
        System.out.println( "Acción: " + accion);
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
        
        String reporte = JOptionPane.showInputDialog(null, "Ingrese el reporte del Coronel ", "Reportar Estado", JOptionPane.QUESTION_MESSAGE);
                
        //El polimorfismo se encarga de añadir el reporte a la lista
        reportarCoronel.add(reporte);
        System.out.println( "Reporte: " + reporte);
        

    }

    ////////////////
    //CREARSOLDADO//
    ////////////////

    @Override
    public void crearSoldado() {

        //Datos que se compararan con la lista 
        rango = "4";

        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del coronel: ", "Crear Coronel ", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null,"Ingrese el ID del coronel: ", "Crear Coronel ", JOptionPane.QUESTION_MESSAGE);
        nivel = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nivel del coronel: ", "Crear Coronel ", JOptionPane.QUESTION_MESSAGE)); 
        estrategia = JOptionPane.showInputDialog(null,"Ingrese la estrategia del coronel: ", "Crear Coronel ", JOptionPane.QUESTION_MESSAGE); 
        
        String mision = JOptionPane.showInputDialog(null, "Asigne una misíon al Coronel: ", "Asignar Misión", JOptionPane.QUESTION_MESSAGE);
        
        //Asignamos una mision al soldado
        asignarMision(mision); //Se asigna la mision al soldado
        
        //Reportamos el estado del soldado
        reportarEstado();
        realizarAccion();

        Coronel nuevoCoronel = new Coronel(estrategia, nivel,nombre, id,rango);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaCoronel, id)){
                    
                    listaCoronel.add(nuevoCoronel); //Se cumple la condicion se agrega el soldado
                    
                    JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Coronel ", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Coronel ", JOptionPane.ERROR_MESSAGE);
                }
        
    }

    //////////////////////
    //MOSTRARINFORMACION//
    //////////////////////

    @Override
    public void mostrarInformacion() {

        //Variable para verificar si el soldado fue encontrado
        boolean encontrado = false;
        
        //Datos que se compararan con la lista 
        rango = "4";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del coronel: ","Información Coronel ", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del coronel: ","Información Coronel ", JOptionPane.QUESTION_MESSAGE);
    
        int contador = 0;
        //Siclo para recorrer la lista
        for (Coronel soldado : listaCoronel) {

            System.out.println(listaCoronel.size());
            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(nombre.equals(soldado.nombre) && rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Si se cumple muestra lo siguiente
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n" +
                "Nivel: " + soldado.nivel  + "\n" +
                "Estrategia del coronel: " + soldado.estrategia + "\n", "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                
                //Cuando el contador este igualado al indice se imprime en pantalla
                JOptionPane.showMessageDialog(null, "Misión: " + misionCoronel.get(contador), "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Reporte: " + reportarCoronel.get(contador), "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Acción: " + accionCoronel.get(contador), "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                
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
            JOptionPane.showMessageDialog(null, "No se encontró el Coronel ", "Información Coronel ", JOptionPane.ERROR_MESSAGE);
        }
    }

    ////////////////////
    //MODIFICARSOLDADO//
    ////////////////////

    @Override
    public void modificarSoldado() {
        
        //Variable para verificar si el soldado fue encontrado
        boolean encontrado = false;
        String nuevoId;
        boolean idValido;
        
        //Datos que se compararan con la lista 
        rango = "4";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del coronel: ","Modificar Coronel ", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del coronel: ", "Modificar Coronel ", JOptionPane.QUESTION_MESSAGE);
        int contador = 0;
        //Siclo para recorrer la lista
        for (Coronel soldado : listaCoronel) {

            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(nombre.equals(soldado.nombre) && rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista donde se almacenan los soldados
                //Remplazo de datos
                JOptionPane.showMessageDialog(null, "Soldado encontrado", "Modificar Coronel ", JOptionPane.INFORMATION_MESSAGE);
                soldado.nivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo nivel del Coronel: ", "Modificar Nombre Coronel ", JOptionPane.QUESTION_MESSAGE));
                soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del Coronel: ", "Modificar Nombre Coronel ", JOptionPane.QUESTION_MESSAGE);
                soldado.estrategia = JOptionPane.showInputDialog(null, "Ingrese la nueva estrategia del coronel: ", "Modificar Nombre Coronel ", JOptionPane.QUESTION_MESSAGE);

                //do while para evitar ids repetidos
                do {
                    //Variable para ingresar el nuevo id
                    nuevoId = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID del coronel: ", "Modificar ID Coronel ", JOptionPane.QUESTION_MESSAGE);
                    
                    //Si el id existe entonces la variable idValido sera falsa
                    //De lo contrario sera false
                    idValido = !idExisteEnLista(listaCoronel, nuevoId);

                    //convertimos la variable a lo contrario entonces se muestra el mensaje
                    if (!idValido && nuevoId == null) { 
                        JOptionPane.showMessageDialog(null, "El ID ya existe en la lista", "Información Coronel ", JOptionPane.ERROR_MESSAGE);
                    }

                //Mientras siga siendo verdad 
                //seguira en el siclo hasta que el id sea diferente a uno existente
                } while (!idValido);
                soldado.id = nuevoId; //Se actualiza el id del soldado

                //Remplazamos el elemento de la posicion contador con su nueva mision,reprote y accion
                String mision = JOptionPane.showInputDialog(null, "Ingrese la nueva misión del Coronel: ", "Modificar Misión", JOptionPane.QUESTION_MESSAGE);
                misionCoronel.set(contador,mision);
                String reporte = JOptionPane.showInputDialog(null, "Ingrese el nuevo reporte del Coronel: ", "Modificar reporte", JOptionPane.QUESTION_MESSAGE);
                reportarCoronel.set(contador,reporte);
                String accion = JOptionPane.showInputDialog(null, "Ingrese la nueva accion del Coronel: ", "Modificar acción", JOptionPane.QUESTION_MESSAGE);
                accionCoronel.set(contador,accion);

                JOptionPane.showMessageDialog(null, "Soldado Actualizado Con éxito", "Modificar Coronel ", JOptionPane.INFORMATION_MESSAGE);
                
                //Mostrar la informacion del soldado actualizada
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n" + 
                "Nivel: " + soldado.nivel  + "\n" +
                "Estrategia del coronel: "+ soldado.estrategia + "\n", "Modificar Coronel ", JOptionPane.INFORMATION_MESSAGE);
                
                System.out.println("FUNCIONA");
                JOptionPane.showMessageDialog(null, "Misión: " + misionCoronel.get(contador), "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Reporte: " + reportarCoronel.get(contador), "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Acción: " + accionCoronel.get(contador), "Información Coronel ", JOptionPane.INFORMATION_MESSAGE);

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
            JOptionPane.showMessageDialog(null, "No se encontró el Coronel ", "Información Coronel ", JOptionPane.ERROR_MESSAGE);
        }
    
    }

    
}
