
//Trae la biblioteca
import javax.swing.SwingUtilities; // Para manejar la interfaz de usuario 

// Inicia la aplicación
public class Main {
    public static void main(String[] args) {
        // Ejecuta el código de la interfaz en un hilo 
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crea la ventana principal que es la vista
                VistaListaTareas vista = new VistaListaTareas();
                // Conecta la vista con la lógica de control
                ControladorTareas controlador = new ControladorTareas(vista);
                // Muestra la ventana en pantalla
                vista.setVisible(true);
            }
        });
    }
}