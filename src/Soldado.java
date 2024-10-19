import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
public class Soldado{ //Clase Principal Soldado 
    
    //Atributos
    String nombre;
    String id;
    String rango;
    static List<Soldado> listaSoldadoRaso = new ArrayList<>();
    static List<Soldado> listaTeniente = new ArrayList<>();
    static List<Soldado> listaCapitan = new ArrayList<>();
    static List<Soldado> listaCoronel = new ArrayList<>();
    
    
    //Constructor
    public Soldado(String nombre, String id, String rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }

    public Soldado() {
        
    }


    //Metodo para verificar si el ID ya existe en la lista
    public static boolean idExisteEnLista(List<Soldado> lista, String id) {
        for (Soldado soldado : lista) {
            if (soldado.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    

    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////

    public static void crearSoldado() {

        //El paserByte transforma el Optionpane String a un Byte
        //byte nivel = Byte.parseByte(JOptionPane.showInputDialog("Ingrese el nivel del soldado:"));

        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        String id = JOptionPane.showInputDialog(null,"Ingrese el ID del soldado:", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        String rango = JOptionPane.showInputDialog(null,
        "[1] SoldadoRaso \n" +
        "[2] Teniente \n" +
        "[3] Capitan \n" +
        "[4] Coronel \n" +
        "\nIngrese el rango del soldado:", "Crear Soldado", JOptionPane.QUESTION_MESSAGE);
        
        switch (rango) {
            case "1":
                Soldado nuevoSoldadoRaso = new Soldado(nombre, id, rango);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaSoldadoRaso, id)){
                    
                        
                        listaSoldadoRaso.add(nuevoSoldadoRaso); //Se cumple la condicion se agrega el soldado
                        
                        JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Soldado", JOptionPane.INFORMATION_MESSAGE);
                        
                    }else{
                        
                    
                        JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Soldado", JOptionPane.ERROR_MESSAGE);
                    }
                
                break;

            case "2":
                Soldado nuevoTeniente = new Soldado(nombre, id, rango);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaTeniente, id)){
                
                    
                    listaTeniente.add(nuevoTeniente); //Se cumple la condicion se agrega el soldado
                    
                    JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Soldado", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    
                
                    JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Soldado", JOptionPane.ERROR_MESSAGE);
                }
            
            break;

            case "3":
                Soldado nuevoCapitan = new Soldado(nombre, id, rango);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaCapitan, id)){
                
                    
                    listaCapitan.add(nuevoCapitan); //Se cumple la condicion se agrega el soldado
                    
                    JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Soldado", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    
                
                    JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Soldado", JOptionPane.ERROR_MESSAGE);
                }
            
            break;

            case "4":
                Soldado nuevoCoronel = new Soldado(nombre, id, rango);
                
                //Verificacion si el ID existe en la lista
                if(!idExisteEnLista(listaCoronel, id)){
                
                    
                    listaCoronel.add(nuevoCoronel); //Se cumple la condicion se agrega el soldado
                    
                    JOptionPane.showMessageDialog(null, "Soldado creado y agregado", "Crear Soldado", JOptionPane.INFORMATION_MESSAGE);
                    
                }else{
                    
                
                    JOptionPane.showMessageDialog(null, "El ID ya existe", "Crear Soldado", JOptionPane.ERROR_MESSAGE);
                }
            
            break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }
        
    }
    
    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////

    public static void mostrarInformacion(){
        //Falta hacer que el else solo se itere una vez
        Soldado instancia = new Soldado();
        
        instancia.nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);

        instancia.id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:","Información Soldado", JOptionPane.QUESTION_MESSAGE);
        
        instancia.rango = JOptionPane.showInputDialog(null,
            "[1] SoldadoRaso \n" +
            "[2] Teniente \n" +
            "[3] Capitan \n" +
            "[4] Coronel \n" +
            
        "\nIngrese el rango del soldado:", "Información Soldado", JOptionPane.QUESTION_MESSAGE);

        boolean encontrado = false;

        switch (instancia.rango) {
            case "1":
                for (Soldado soldado : listaSoldadoRaso) {
                    if(instancia.nombre.equals(soldado.nombre) && instancia.rango.equals(soldado.rango) && instancia.id.equals(soldado.id)){
                        JOptionPane.showMessageDialog(null, 
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n", "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("x");
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado == false) {
                    JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                    
                }
                break;


            case "2":
                System.out.println(listaTeniente.get(0).rango);
                for (Soldado soldado : listaTeniente) {

                    if(instancia.nombre.equals(soldado.nombre) && instancia.rango.equals(soldado.rango) && instancia.id.equals(soldado.id)){
                        JOptionPane.showMessageDialog(null, 
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n", "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("y");
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado == false) {
                    JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                    
                }
                break;

            case "3":
                for (Soldado soldado : listaCapitan) {

                    if(instancia.nombre.equals(soldado.nombre) && instancia.rango.equals(soldado.rango) && instancia.id.equals(soldado.id)){
                        JOptionPane.showMessageDialog(null, 
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n", "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("z");
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado == false) {
                    JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                    
                }
                break;

            case "4":
                for (Soldado soldado : listaCoronel) {

                    if(instancia.nombre.equals(soldado.nombre) && instancia.rango.equals(soldado.rango) && instancia.id.equals(soldado.id)){
                        JOptionPane.showMessageDialog(null, 
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n", "Información Soldado", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("w");
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado == false) {
                    JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                    
                }
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Rango no valido");
                break;
        }

    }

    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////
    //////////////////////////////////////////////////////

    public static void modificarSoldado() {
        
        //Objeto para almacenar los datos del soldado
        Soldado instancia = new Soldado();

        instancia.nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del soldado:","Modificar Soldado", JOptionPane.QUESTION_MESSAGE);

        instancia.id = JOptionPane.showInputDialog(null, "Ingrese el ID del soldado:", "Modificar Soldado", JOptionPane.QUESTION_MESSAGE);
        
        instancia.rango = JOptionPane.showInputDialog(null,
            "[1] SoldadoRaso \n" +
            "[2] Teniente \n" +
            "[3] Capitan \n" +
            "[4] Coronel \n" +
        
        "\nIngrese el rango del soldado:", "Modificar Soldado", JOptionPane.QUESTION_MESSAGE);

        //Variable que verifica si el soldado fue encontrado
        boolean encontrado = false;

        switch (instancia.rango) {
            case "1":
                //Siclo que recorrera la lista
                for (Soldado soldado : listaSoldadoRaso) {

                    //Condicion para verificar si el soldado existe comparando con los datos ingresados
                    if(instancia.nombre.equals(soldado.nombre) && instancia.rango.equals(soldado.rango) && instancia.id.equals(soldado.id)){
                        
                        //Mostrar el soldado que se modificara
                        JOptionPane.showMessageDialog(null, 
                        "Soldado Encontrado: \n" +
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                        
                        //Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista donde se almacenan los soldados
                        
                        //Remplazo de datos
                        soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del soldado:", "Modificar Nombre Soldado", JOptionPane.QUESTION_MESSAGE);
                        soldado.id = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID del soldado:", "Modificar Rango Soldado", JOptionPane.QUESTION_MESSAGE);

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
                //Si el soldado no fue encontrado se muestra este un mensaje
                if(encontrado == false){
                    JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                }
                break;

            case "2":
                System.out.println(listaTeniente.get(0).rango);
                for (Soldado soldado : listaTeniente) {

                    //Condicion para verificar si el soldado existe comparando con los datos ingresados
                    if(instancia.nombre.equals(soldado.nombre) && instancia.rango.equals(soldado.rango) && instancia.id.equals(soldado.id)){
                        
                        //Mostrar el soldado que se modificara
                        JOptionPane.showMessageDialog(null, 
                        "Soldado Encontrado: \n" +
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                        
                        //Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista donde se almacenan los soldados
                        
                        //Remplazo de datos
                        soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del soldado:", "Modificar Nombre Soldado", JOptionPane.QUESTION_MESSAGE);
                        soldado.id = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID del soldado:", "Modificar Rango Soldado", JOptionPane.QUESTION_MESSAGE);

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
                //Si el soldado no fue encontrado se muestra este un mensaje
                if(encontrado == false){
                    JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                }
                break;

            case "3":
                for (Soldado soldado : listaCapitan) {

                    //Condicion para verificar si el soldado existe comparando con los datos ingresados
                    if(instancia.nombre.equals(soldado.nombre) && instancia.rango.equals(soldado.rango) && instancia.id.equals(soldado.id)){
                        
                        //Mostrar el soldado que se modificara
                        JOptionPane.showMessageDialog(null, 
                        "Soldado Encontrado: \n" +
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                        
                        //Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista donde se almacenan los soldados
                        
                        //Remplazo de datos
                        soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del soldado:", "Modificar Nombre Soldado", JOptionPane.QUESTION_MESSAGE);
                        soldado.id = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID del soldado:", "Modificar Rango Soldado", JOptionPane.QUESTION_MESSAGE);

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
                //Si el soldado no fue encontrado se muestra este un mensaje
                if(encontrado == false){
                    JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                }
                break;

            case "4":
                for (Soldado soldado : listaCoronel) {

                    //Condicion para verificar si el soldado existe comparando con los datos ingresados
                    if(instancia.nombre.equals(soldado.nombre) && instancia.rango.equals(soldado.rango) && instancia.id.equals(soldado.id)){
                        
                        //Mostrar el soldado que se modificara
                        JOptionPane.showMessageDialog(null, 
                        "Soldado Encontrado: \n" +
                        "Nombre: " + soldado.nombre + "\n" +
                        "ID: " + soldado.id + "\n" +
                        "Rango: " + soldado.rango + "\n", "Modificar Soldado", JOptionPane.INFORMATION_MESSAGE);
                        
                        //Recordatorio no se puede modificar Rangos ya que hace conflicto con la lista donde se almacenan los soldados
                        
                        //Remplazo de datos
                        soldado.nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del soldado:", "Modificar Nombre Soldado", JOptionPane.QUESTION_MESSAGE);
                        soldado.id = JOptionPane.showInputDialog(null, "Ingrese el nuevo ID del soldado:", "Modificar Rango Soldado", JOptionPane.QUESTION_MESSAGE);

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
                //Si el soldado no fue encontrado se muestra este un mensaje
                if(encontrado == false){
                    JOptionPane.showMessageDialog(null, "No se encontro el soldado");
                }
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Rango no valido");
                break;
        }

        for (Soldado soldado : Soldado.listaSoldadoRaso) {
            System.out.println(soldado+": " + soldado.nombre);
            System.out.println(soldado+": " + soldado.id);
            System.out.println(soldado+": " + soldado.rango);
        }

    }
}
