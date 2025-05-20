import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        ArrayList<Producto> productos = new ArrayList<>();
        do {
            System.out.println("1. Precargar 5 productos");
            System.out.println("2. Agregar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Eliminar producto por ID");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            try {

                switch (opcion) {
                    case 1:
                        AdminProductos.precargarProductos(productos);
                        break;
                    case 2:
                        AdminProductos.agregarProducto(productos, sc);
                        break;
                    case 3:
                        AdminProductos.mostrarProductos(productos);
                        break;
                    case 4:
                        System.out.print("Ingrese el ID del producto a eliminar: ");
                        int id = sc.nextInt();
                        AdminProductos.eliminarProducto(productos, id);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                opcion = 0; // Reiniciar la opción para que el usuario pueda intentarlo de nuevo
            }
            
            } while (opcion != 5);
        sc.close();
    }


}
