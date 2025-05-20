import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminProductos {
    // No es posible declarar una clase como static a nivel superior.
    // Solo las clases anidadas pueden ser static.
    // Puedes hacer que todos los métodos sean static (como ya están), 
    // pero la clase AdminProductos no puede ser static.
    public static void precargarProductos(ArrayList<Producto> productos) {
        productos.add(new Producto("Producto 1", 10.0, 5));
        productos.add(new Producto("Producto 2", 20.0, 10));
        productos.add(new Producto("Producto 3", 30.0, 15));
        productos.add(new Producto("Producto 4", 40.0, 20));
        productos.add(new Producto("Producto 5", 50.0, 25));
    }

    public static void agregarProducto(ArrayList<Producto> productos, Scanner sc) {
        try
        {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();
            if (nombre == null || nombre.isEmpty()) {
                throw new IllegalArgumentException("El nombre del producto no puede estar vacío.");
            }   

            System.out.print("Ingrese el precio del producto: ");
            double precio = sc.nextDouble();
            if (precio < 0) {
                throw new IllegalArgumentException("El precio no puede ser negativo.");
            }
            
            System.out.print("Ingrese la cantidad de productos en stock: ");
            int cantidad = sc.nextInt();
            if (cantidad < 0) {
                throw new IllegalArgumentException("La cantidad no puede ser negativa.");
            }

            productos.add(new Producto(nombre, precio, cantidad));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Asegúrese de ingresar un número.");
        } 
        
    }

    public static void mostrarProductos(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }
    }

    public static void eliminarProducto(ArrayList<Producto> productos, int id) {
        int cant = productos.size();
        productos.removeIf(producto -> producto.getId() == id);
        
        String msj = (cant == productos.size()) ? 
            "Producto con ID " + id + " no encontrado." :
            "Producto eliminado con ID: " + id;
        System.out.println(msj);
        
        // Otra forma de eliminar el producto

        // if (cant == productos.size()) {
        //     System.out.println("Producto con ID " + id + " no encontrado.");
        // } else {
        //     System.out.println("Producto eliminado con ID: " + id);
        // }

        // for (Producto producto : productos) {
        //     if (producto.getId() == id) {
        //         productos.remove(producto);
        //         System.out.println("Producto eliminado: " + producto.toString());
        //         return;
        //     }
        // }
        // System.out.println("Producto con ID " + id + " no encontrado.");
    }
 }