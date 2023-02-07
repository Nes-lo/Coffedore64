import java.util.ArrayList;

public class TestKioskoCafe {
  public static void main(String[] args) {

    // Elementos del menú
    // Crea 4 variables de artículo de tipo Artículo e instancia cada una como un
    // objeto Artículo. Nómbralos artículo1, artículo2, etc.
    // Establece el precio y el nombre de cada uno: "moka", "latte", "café de goteo"
    // y "capuchino" (¡el precio lo decides tú!)

    KioskoCafe kioskoCafe = new KioskoCafe();

    kioskoCafe.addMenuItem("banana", 1600);
    kioskoCafe.addMenuItem("cafe", 1200);
    kioskoCafe.addMenuItem("latte", 3600);
    kioskoCafe.addMenuItem("capuchino", 2400);
    kioskoCafe.addMenuItem("muffin", 3200);

    // Crear pedidos
    int opcion = 0;
    do {
      System.out.println("Bienvenido a Kiosko Cafe");
      System.out
          .println("Ingresa la opcion deseada: \n 1 Nueva Orden \n 2 Nuevo Articulo \n 3 Listar Ordenes \n 4 Salir");
      try {
        opcion = Integer.parseInt(System.console().readLine());
      } catch (NumberFormatException e) {
        // TODO: handle exception
        System.out.println("Valor digitado incorrecto");
      }
      switch (opcion) {
        case 1:
          kioskoCafe.newOrder();
          opcion = 0;
          break;
        case 2:
          System.out.println("Ingrese Nombre de Articulo");
          String n = System.console().readLine();
          System.out.println("Ingrese Precio de Articulo");
          double p = Double.parseDouble(System.console().readLine());
          kioskoCafe.addMenuItem(n, p);
          System.out.println("Articulo ingresado con exito");
          opcion = 0;
          break;
        case 3:
          kioskoCafe.displayOrden();
          break;

        case 4:
          break;
        default:
          System.out.println("Ingrese un Numero de la lista");
          opcion = 0;
          break;

      }

    } while (opcion != 4);
  }
}
