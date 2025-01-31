
package Modelo;

import Controlador.ControladorInventario;
import Vista.VistaConsola;


public class ClaseEjecutable {
    // Main.java

    public static void main(String[] args) {
        // Crear el modelo (Inventario)
        Inventario inventario = new Inventario();
        
        // Crear la vista (VistaConsola)
        VistaConsola vista = new VistaConsola();
        
        // Crear el controlador (ControladorInventario)
        ControladorInventario controlador = new ControladorInventario(inventario, vista);
        
        // Iniciar la aplicación
        controlador.iniciar();
    }
}

