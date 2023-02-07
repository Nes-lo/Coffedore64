import java.util.ArrayList;
import java.util.List;

public class KioskoCafe {

    // menú ArrayList<Artículo>
    // pedidos ArrayList<Pedido>

    private List<Articulo> menu;
    private List<Orden> pedidos;

    // Constructor: sin parámetros, inicializa artículos y pedidos en arreglos
    // vacíos.
    public KioskoCafe() {
        menu = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    // El método addMenuItem debería crear un nuevo objeto de artículo con el nombre
    // y el precio dados.
    // Agrega el nuevo objeto Artículo al arreglo de artículos del menú.
    // También será necesario asignar una propiedad de índice al nuevo elemento del
    // menú. El valor debe ser su posición, su índice, en el arreglo de menú.
    // También será necesario asignar una propiedad de índice al nuevo elemento del
    // menú. El valor debe ser su posición, su índice, en el arreglo de menú.

    public void addMenuItem(String nombre, double precio) {

        menu.add(new Articulo(menu.size(), nombre, precio));

    }
    


    // El método displayMenu debería mostrar todos los elementos del arreglo de menú
    // de la siguiente manera:
    public void displayMenu() {
        for (Articulo articulo : menu) {
            System.out.println(articulo.getIndex() + " " + articulo.getNombre() + " -- $" + articulo.getPrecio());
        }
    }

    // El método newOrder tomará información del usuario en la terminal para crear
    // una instancia de pedido nuevo y agregarla al arreglo de pedidos. Te hemos
    // dado un código para que puedas empezar.
    public void newOrder() {

        // Mostrar al usuario un aviso de mensaje y luego establece su entrada en una
        // variable, nombre
        System.out.println("Bienvenido al Kiosko Cafe");
        System.out.println("Ingrese el nombre del cliente para el nuevo pedido:");
        String name = System.console().readLine();     
        // Crea un nuevo pedido con la cadena de entrada dada
        pedidos.add(new Orden(name));
        // Muestra el menú al usuario, para que puedan elegir artículos para agregar
        System.out.println("--------Menu Articulos Disponibles--------------------");
        displayMenu();
        System.out.println("------------------------------------------------------");
        // Pedir al usuario que ingrese un número de artículo
        System.out.println("Ingrese un indice de articulo del menu o 'q' para salir:");
        String itemNumber = System.console().readLine();

        // Escribir un bucle while para recopilar todos los artículos del pedido del
        // usuario
        while (!itemNumber.equals("q")) {
         // Obtén el objeto del artículo del menú y agrega el artículo al pedido
            if(Integer.parseInt(itemNumber)<menu.size() && Integer.parseInt(itemNumber)>=0){
                pedidos.get(pedidos.size()-1).addItem(menu.get(Integer.parseInt(itemNumber)));
                System.out.println("Articulo agregado con exito");
            }
            else{
                System.out.println("Error al ingresar indice de articulo");
            }
            
            // Pídales que ingresen un nuevo índice de artículo o q nuevamente, y toma su
            // entrada
            System.out.println("Ingrese un indice de articulo del menu o 'q' para salir:");
             itemNumber = System.console().readLine();
        }
        // Después de haber completado su pedido, imprime los detalles del pedido
        // como el ejemplo de abajo. Puedes utilizar el método de visualización del
        // pedido       
        pedidos.get(pedidos.size()-1).display();

    }

    public void displayOrden(){
      
        pedidos.stream().forEach(Orden::display);

    }

    

   

}