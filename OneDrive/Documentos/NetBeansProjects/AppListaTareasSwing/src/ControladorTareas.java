
// Bibliotecas importadas
import javax.swing.*;                   // Herramientas para crear la interfaz 
import java.awt.event.ActionEvent;    // Evento que ocurre cuando se hace clic en algo.
import java.awt.event.ActionListener; // Escucha el clic del botón.
import java.awt.event.MouseAdapter;   // Detecta clics del ratón.
import java.awt.event.MouseEvent;     // Evento de hacer clic con el ratón.


// Esta clase controla cómo funciona la aplicación.
public class ControladorTareas {
    private VistaListaTareas vista; // Guarda la conexión a la ventana de la aplicación.

    // Prepara el controlador para empezar a funcionar.
    public ControladorTareas(VistaListaTareas vista) {
        
        this.vista = vista;
        
        // Para que los botones que escuchen a sus manejadores.
        this.vista.getBotonAnadir().addActionListener(new ManejadorBotonAnadir());
        this.vista.getBotonCompletar().addActionListener(new ManejadorBotonCompletar());
        this.vista.getBotonEliminar().addActionListener(new ManejadorBotonEliminar());
        
        // Permite que la tecla Enter también añada tareas.
        this.vista.getCampoTextoTarea().addActionListener(new ManejadorBotonAnadir());
        
        // Dice a la lista que "escuche" los clics del ratón.
        this.vista.getListaTareas().addMouseListener(new ManejadorDobleClic());
    }

    // Lógica que se ejecuta al presionar el Añadir Tarea.
    private class ManejadorBotonAnadir implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String descripcion = vista.getCampoTextoTarea().getText().trim();
            if (!descripcion.isEmpty()) {
                // Crea una nueva tarea y la pone en la lista.
                Tarea nuevaTarea = new Tarea(descripcion);
                vista.getModeloLista().addElement(nuevaTarea);
                vista.getCampoTextoTarea().setText(""); // Borra el texto del campo.
            }
        }
    }

    // Lógica que se ejecuta al presionar el Marcar como Completada.
    private class ManejadorBotonCompletar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Tarea tareaSeleccionada = vista.getListaTareas().getSelectedValue();
            if (tareaSeleccionada != null) {
                // Cambia el estado de la tarea de no hecha a hecha o viceversa.
                tareaSeleccionada.setCompletada(!tareaSeleccionada.isCompletada());
                vista.getListaTareas().repaint(); // Refresca la lista para que el cambio se vea.
            }
        }
    }

    // Lógica que se ejecuta al presionar el Eliminar Tarea.
    private class ManejadorBotonEliminar implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int indiceSeleccionado = vista.getListaTareas().getSelectedIndex();
            if (indiceSeleccionado != -1) {
                // Borra la tarea de la lista.
                vista.getModeloLista().remove(indiceSeleccionado);
            }
        }
    }

    // Lógica que se ejecuta al hacer doble clic en una tarea.
    private class ManejadorDobleClic extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getClickCount() == 2) { // Detecta el doble clic.
                // Cambia el estado de la tarea que recibio el doble clic.
                int indiceSeleccionado = vista.getListaTareas().locationToIndex(e.getPoint());
                if (indiceSeleccionado != -1) {
                    Tarea tareaSeleccionada = vista.getModeloLista().getElementAt(indiceSeleccionado);
                    tareaSeleccionada.setCompletada(!tareaSeleccionada.isCompletada());
                    vista.getListaTareas().repaint();
                }
            }
        }
    }
}