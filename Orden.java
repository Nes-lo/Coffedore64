
import java.util.ArrayList;

public class Orden {

    private String nombre;  
    private  boolean listo;
    private ArrayList<Articulo> items =new ArrayList<>();

    

    public Orden() {
    this("Invitado");

    }
    
    public Orden(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public boolean isListo() {
        return listo;
    }
    public void setListo(boolean listo) {
        this.listo = listo;
    }
    public ArrayList<Articulo> getItems() {
        return items;
    }
    public void setItems(ArrayList<Articulo> items) {
        this.items = items;
    }

    public void addItem(Articulo articulo){
        items.add(articulo);
    }

    public String getStatusMessage(){

        if(listo){
            return "Cliente "+nombre+ " Tu pedido esta listo";            
        }
        else{
            return  "Cliente "+nombre+" Gracias por esperar. Tu pedido estara listo pronto";
        }
    }

    public void display(){

        System.out.println("------------------------------------------------------------------------------");
        System.out.printf("Nombre Cliente: %s \n",nombre);
        for (Articulo articulo : items) {System.out.println(articulo.getNombre()+": $"+articulo.getPrecio());}
        System.out.println("----------------------------");
         System.out.println("Total: $"+this.getOrderTotal());  
         System.out.println("----------------------------");
         System.out.println(getStatusMessage());
         System.out.println("------------------------------------------------------------------------------");

        
    }

    public double getOrderTotal(){

        return items .stream()
                     .mapToDouble(p->p.getPrecio())
                     .sum();
    }

    
    
}
