
package Vista;

import Modelo.Producto;
import java.util.List;
import java.util.Scanner;
public class VistaConsola {
    // VistaConsola.java



    public Scanner scanner;

    public VistaConsola() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarProductos(List<Producto> productos) {
        System.out.println("Inventario:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void mostrarValorTotal(double total) {
        System.out.println("Valor total del inventario: " + total);
    }

    public Producto obtenerNuevoProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        return new Producto(nombre, cantidad, precio);
    }

    public String obtenerNombreProducto() {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        return scanner.nextLine();
    }

    public int obtenerNuevaCantidad() {
        System.out.print("Ingrese la nueva cantidad: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}

