//Bibliotecas
import java.awt.Component;                   // Forma la interfaz.
import java.awt.Font;                        // Cambia el estilo del texto.
import javax.swing.DefaultListCellRenderer;  // Dibujante por defecto de la lista.
import javax.swing.JList;                    // Componente de lista.
import javax.swing.ListCellRenderer;         // Herramienta para dibujar los elementos de la lista.
import java.awt.Color;                       // Cambia los colores.
import java.awt.font.TextAttribute;          // Permite aplicar efecto tachado.
import java.util.Map;                        // Para manejar atributos de la fuente.


// Decide cómo se ve cada tarea en la lista.
public class TareaListCellRenderer extends DefaultListCellRenderer {
    
    // Este método dibuja cada tarea.
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        // Usa la forma de dibujo por defecto.
        Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        // Revisa si el elemento es una Tarea.
        if (value instanceof Tarea) {
            Tarea tarea = (Tarea) value;
            Font originalFont = c.getFont(); // Guarda la fuente original del texto.
            
            // Si la tarea está completada, cambia el estilo.
            if (tarea.isCompletada()) {
                // Copia los atributos de la fuente original.
                Map<TextAttribute, Object> atributos = (Map<TextAttribute, Object>) originalFont.getAttributes();
                // Pone el texto en cursiva.
                atributos.put(TextAttribute.POSTURE, TextAttribute.POSTURE_OBLIQUE);
                // Pone el texto tachado.
                atributos.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
                
                // Aplica los nuevos atributos al texto.
                c.setFont(originalFont.deriveFont(atributos));
                // Pone el texto en color gris.
                c.setForeground(Color.GRAY);
            } else {
                // Si la tarea no está hecha, la deja con su estilo normal.
                c.setFont(new Font(originalFont.getName(), Font.PLAIN, originalFont.getSize()));
                c.setForeground(list.getForeground());
            }
        }
        
        // Devuelve el elemento para que se muestre en la lista.
        return c;
    }
}