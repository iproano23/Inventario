/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Inventario;
import Modelo.Producto;
import Vista.VistaConsola;
import java.util.List;
public class ControladorInventario {

    private Inventario inventario;
    private VistaConsola vista;

    public ControladorInventario(Inventario inventario, VistaConsola vista) {
        this.inventario = inventario;
        this.vista = vista;
    }

    public void iniciar() {
        boolean continuar = true;
        while (continuar) {
            // Mostrar productos y valor total
            List<Producto> productos = inventario.consultarProductos();
            vista.mostrarProductos(productos);
            vista.mostrarValorTotal(inventario.calcularValorTotal());

            // Menú de opciones
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar inventario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(vista.scanner.nextLine());

            switch (opcion) {
                case 1:
                    // Agregar nuevo producto
                    Producto nuevoProducto = vista.obtenerNuevoProducto();
                    inventario.agregarProducto(nuevoProducto);
                    vista.mostrarMensaje("Producto agregado.");
                    break;
                case 2:
                    // Actualizar inventario
                    String nombreProducto = vista.obtenerNombreProducto();
                    int nuevaCantidad = vista.obtenerNuevaCantidad();
                    inventario.actualizarInventario(nombreProducto, nuevaCantidad);
                    vista.mostrarMensaje("Inventario actualizado.");
                    break;
                case 3:
                    // Salir
                    continuar = false;
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        }
    }
}

