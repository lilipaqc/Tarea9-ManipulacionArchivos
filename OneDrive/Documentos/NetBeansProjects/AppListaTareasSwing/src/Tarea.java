
// Clase que representa una tarea individual, es el modelo de nuestra aplicación, sin código de interfaz.
public class Tarea {
    private String descripcion; // El texto de la tarea.
    private boolean completada; // El estado de la tarea, si está hecha o no.

    // Constructor: se usa para crear una nueva tarea.
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false; // Por defecto, una nueva tarea no está completada.
    }

    // "Getter": obtiene el texto de la tarea.
    public String getDescripcion() {
        return descripcion;
    }

    // "Setter": cambia el texto de la tarea.
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // "Getter": verifica si la tarea está completada.
    public boolean isCompletada() {
        return completada;
    }

    // "Setter": cambia el estado de completada de la tarea.
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Permite que la lista muestre el texto de la tarea.
    @Override
    public String toString() {
        return descripcion;
    }
}