
import javax.swing.*;  // Crea la interfaz gráfica como JFrame, JButton, etc.
import java.awt.*;     // Contiene clases para el diseño y manejo de colores.


// Crea y muestra la ventana principal 
public class VistaListaTareas extends JFrame {
    
    private JPanel panelPrincipal;       // Organiza los componentes.
    private JTextField campoTextoTarea;  // Para escribir nuevas tareas.
    private JButton botonAnadir;         // Botón para agregar una tarea.
    private JButton botonCompletar;      // Botón para marcar una tarea como completada.
    private JButton botonEliminar;       // Botón para eliminar una tarea.
    private JList<Tarea> listaTareas;    // Lista que muestra las tareas.
    private DefaultListModel<Tarea> modeloLista; // Almacena los datos de la lista.

    public VistaListaTareas() {
        super("Aplicación de Lista de Tareas"); // Título de la ventana.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra la aplicación al cerrar la ventana.
        this.setSize(500, 500); // Tamaño de la ventana.
        this.setLocationRelativeTo(null); // Centra la ventana en la pantalla.

        // Crea el modelo de la lista.
        modeloLista = new DefaultListModel<>();
        // Asocia el modelo a la lista.
        listaTareas = new JList<>(modeloLista);

        // Usa un renderizador personalizado para el estilo de las tareas.
        listaTareas.setCellRenderer(new TareaListCellRenderer());

        // Inicializa los componentes de la interfaz.
        campoTextoTarea = new JTextField(20);
        botonAnadir = new JButton("Añadir Tarea");
        botonCompletar = new JButton("Marcar como Completada");
        botonEliminar = new JButton("Eliminar Tarea");

        // Crea el panel principal con un diseño de borde.
        panelPrincipal = new JPanel(new BorderLayout());
        // Crea un panel para los controles con un diseño de flujo.
        JPanel panelControles = new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 5));

        // Añade los componentes al panel de controles.
        panelControles.add(campoTextoTarea);
        panelControles.add(botonAnadir);
        panelControles.add(botonCompletar);
        panelControles.add(botonEliminar);

        // Añade los paneles a la ventana principal.
        panelPrincipal.add(panelControles, BorderLayout.NORTH);
        panelPrincipal.add(new JScrollPane(listaTareas), BorderLayout.CENTER);

        this.add(panelPrincipal);
    }

    // Métodos para que el controlador pueda acceder a los componentes.
    public JTextField getCampoTextoTarea() {
        return campoTextoTarea;
    }

    public JButton getBotonAnadir() {
        return botonAnadir;
    }

    public JButton getBotonCompletar() {
        return botonCompletar;
    }

    public JButton getBotonEliminar() {
        return botonEliminar;
    }

    public JList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public DefaultListModel<Tarea> getModeloLista() {
        return modeloLista;
    }
}