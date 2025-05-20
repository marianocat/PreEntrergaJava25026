public class Producto {
    private static int cantProductos = 0;

    private int id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.id = ++cantProductos;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public int getId() {
        return id;
    }
    public static int getCantProductos() {
        return cantProductos;
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
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + "'" +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}