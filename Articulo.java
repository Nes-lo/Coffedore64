public class Articulo {

     private String nombre;
     private double precio;
     private int index;



     
     public Articulo(int index, String nombre, double precio) {
          this.nombre = nombre;
          this.precio = precio;
          this.index=index;
     }
     
     public String getNombre() {
          return nombre;
     }
     public void setNombre(String nombre) {
          this.nombre = nombre;
     }
     public double getPrecio() {
          return precio;
     }
     public void setPrecio(double precio) {
          this.precio = precio;
     }

     public int getIndex() {
          return index;
     }

     public void setIndex(int index) {
          this.index = index;
     }


     
    
}
