import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Capitan extends Rango implements OperacionesMilitares{ //clase hija de Rango e implementa la interfaz OperacionesMilitares
    
    /////////////
    //ATRIBUTOS//
    /////////////

    int cantidadSoldadosBajoSuMando;
    static ArrayList<Capitan> listaCapitan = new ArrayList<>();
    static List<String> accionCapitan = new ArrayList<>();
    static List<String> misionCapitan = new ArrayList<>();
    static List<String> reportarCapitan = new ArrayList<>();

    ///////////////
    //CONSTRUCTOR//
    ///////////////

    public Capitan(int cantidadSoldadosBajoSuMando, int nivel, String nombre, String id, String rango) { //constructor 
        super(nivel, nombre, id, rango); 
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    public Capitan(){ //constructor vacio necesario para crear objetos de la clase
        
    }

    
    //////////
    //METODO//
    //////////

    //Metodo para verificar si el ID ya existe en la lista
    public static boolean idExisteEnLista(List<Capitan> lista, String id) {
        
        //Recorre la lista<Capitan> verificando si el id ya existe
        for (Capitan soldado : lista) {
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
    
        String accion = JOptionPane.showInputDialog(null, "Ingrese la accion del capitan: ", "Acción capitan", JOptionPane.QUESTION_MESSAGE);
        
        accionCapitan.add(accion);
        System.out.println( "Acción: " + accion);
    }

    //////////////////////////
    //metodos/de/la/interfaz//
    //////////////////////////

    @Override
    public void asignarMision(String mision) {
        //El polimorfismo se encarga de añadir la mision a la lista
        misionCapitan.add(mision);
        System.out.println( "Misión asignada: " + mision);
    }
    @Override
    public void reportarEstado() {
        
        String reporte = JOptionPane.showInputDialog(null, "Ingrese el reporte del capitan: ", "Reportar Estado", JOptionPane.QUESTION_MESSAGE);
        
        //El polimorfismo se encarga de añadir el reporte a la lista
        reportarCapitan.add(reporte);
        System.out.println( "Reporte: " + reporte);
        

    }

    ////////////////
    //CREARSOLDADO//
    ////////////////

    @Override
    public void crearSoldado() {

        //Datos que se compararan con la lista 
        rango = "3";

        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del capitan: ", "Crear capitan", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null,"Ingrese el ID del capitan: ", "Crear capitan", JOptionPane.QUESTION_MESSAGE);
        nivel = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nivel del capitan: ", "Crear capitan", JOptionPane.QUESTION_MESSAGE)); 
        cantidadSoldadosBajoSuMando = Integer.parseInt(JOptionPane.showInputDialog(null,"Cantidad de soldados bajo su mando: ", "Crear capitan", JOptionPane.QUESTION_MESSAGE));
        
        //Asignamos una mision al soldado
        String mision = JOptionPane.showInputDialog(null, "Asigne una misíon al capitan: ", "Asignar Misión", JOptionPane.QUESTION_MESSAGE);
        asignarMision(mision); //Se asigna la mision al soldado
        
        //Reportamos el estado del soldado
        reportarEstado();
        realizarAccion();

        Capitan nuevoCapitan = new Capitan(cantidadSoldadosBajoSuMando, nivel,nombre, id,rango);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaCapitan, id)){
                    
                    listaCapitan.add(nuevoCapitan); //Se cumple la condicion se agrega el soldado
                    
                    JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear capitan", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear capitan", JOptionPane.ERROR_MESSAGE);
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
        rango = "3";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del capitan: ","Información capitan", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del capitan: ","Información capitan", JOptionPane.QUESTION_MESSAGE);
    
        int contador = 0;
        //Siclo para recorrer la lista
        for (Capitan soldado : listaCapitan) {

            System.out.println(listaCapitan.size());
            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(nombre.equals(soldado.nombre) && rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Si se cumple muestra lo siguiente
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n" +
                "Nivel: " + soldado.nivel + "\n" +
                "Soldados bajo su mando: " + soldado.cantidadSoldadosBajoSuMando + "\n", "Información capitan", JOptionPane.INFORMATION_MESSAGE);
                
                //Cuando el contador este igualado al indice se imprime en pantalla
                JOptionPane.showMessageDialog(null, "Misión: " + misionCapitan.get(contador), "Información capitan", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Reporte: " + reportarCapitan.get(contador), "Información capitan", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Acción: " + accionCapitan.get(contador), "Información capitan", JOptionPane.INFORMATION_MESSAGE);
                
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
            JOptionPane.showMessageDialog(null, "No se encontró el capitan", "Información capitan", JOptionPane.ERROR_MESSAGE);
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
        rango = "3";
        nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del capitan: ","Modificar capitan", JOptionPane.QUESTION_MESSAGE);
        id = JOptionPane.showInputDialog(null, "Ingrese el ID del capitan: ", "Modificar capitan", JOptionPane.QUESTION_MESSAGE);
        int contador = 0;
        //Siclo para recorrer la lista
        for (Capitan soldado : listaCapitan) {

            //Condicion para verificar si el soldado existe comparando con los datos ingresados
            if(nombre.equals(soldado.nombre) && rango.equals(soldado.rango) && id.equals(soldado.id)){
                
                //Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista donde se almacenan los soldados
                //Remplazo de datos
                JOptionPane.showMessageDialog(null, "Soldado encontrado", "Modificar capitan", JOptionPane.INFORMATION_MESSAGE);
                soldado.nivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo nivel del Capitan: ", "Modificar Nombre capitan", JOptionPane.QUESTION_MESSAGE));
                soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del capitan: ", "Modificar Nombre Capitan: ", JOptionPane.QUESTION_MESSAGE);
                soldado.cantidadSoldadosBajoSuMando = Integer.parseInt(JOptionPane.showInputDialog(null, "Nueva cantidad de soldados bajo su mando: ", "Modificar Nombre capitan", JOptionPane.QUESTION_MESSAGE));

                //do while para evitar ids repetidos
                do {
                    //Variable para ingresar el nuevo id
                    nuevoId = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID del capitan: ", "Modificar ID capitan", JOptionPane.QUESTION_MESSAGE);
                    
                    //Si el id existe entonces la variable idValido sera falsa
                    //De lo contrario sera false
                    idValido = !idExisteEnLista(listaCapitan, nuevoId);

                    //convertimos la variable a lo contrario entonces se muestra el mensaje
                    if (!idValido && nuevoId == null) { 
                        JOptionPane.showMessageDialog(null, "El ID ya existe en la lista", "Información capitan", JOptionPane.ERROR_MESSAGE);
                    }

                //Mientras siga siendo verdad 
                //seguira en el siclo hasta que el id sea diferente a uno existente
                } while (!idValido);
                soldado.id = nuevoId; //Se actualiza el id del soldado

                //Remplazamos el elemento de la posicion contador con su nueva mision,reprote y accion
                String mision = JOptionPane.showInputDialog(null, "Ingrese la nueva misión del capitan: ", "Modificar Misión", JOptionPane.QUESTION_MESSAGE);
                misionCapitan.set(contador,mision);
                String reporte = JOptionPane.showInputDialog(null, "Ingrese el nuevo reporte del capitan: ", "Modificar reporte", JOptionPane.QUESTION_MESSAGE);
                reportarCapitan.set(contador,reporte);
                String accion = JOptionPane.showInputDialog(null, "Ingrese la nueva accion del capitan: ", "Modificar acción", JOptionPane.QUESTION_MESSAGE);
                accionCapitan.set(contador,accion);

                JOptionPane.showMessageDialog(null, "Soldado Actualizado Con éxito", "Modificar capitan", JOptionPane.INFORMATION_MESSAGE);
                
                //Mostrar la informacion del soldado actualizada
                JOptionPane.showMessageDialog(null, 
                "Nombre: " + soldado.nombre + "\n" +
                "ID: " + soldado.id + "\n" +
                "Rango: " + soldado.rango + "\n" + 
                "Nivel: " + soldado.nivel + "\n" +
                "Soldados bajo su mando: " + soldado.cantidadSoldadosBajoSuMando + "\n", "Modificar capitan", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("FUNCIONA");

                JOptionPane.showMessageDialog(null, "Misión: " + misionCapitan.get(contador), "Información capitan", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Reporte: " + reportarCapitan.get(contador), "Información capitan", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Acción: " + accionCapitan.get(contador), "Información capitan", JOptionPane.INFORMATION_MESSAGE);

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
            JOptionPane.showMessageDialog(null, "No se encontró el capitan", "Información capitan", JOptionPane.ERROR_MESSAGE);
        }
    
    }

    
}
