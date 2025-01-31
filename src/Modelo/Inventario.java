
package Modelo;

import java.util.ArrayList;
import java.util.List;
public class Inventario {
   

    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarInventario(String nombre, int nuevaCantidad) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                producto.setCantidad(nuevaCantidad);
                return;
            }
        }
    }

    public List<Producto> consultarProductos() {
        return productos;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getCantidad() * producto.getPrecio();
        }
        return total;
    }
}

