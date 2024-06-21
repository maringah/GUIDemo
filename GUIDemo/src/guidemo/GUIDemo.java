package guidemo;

/**
 * Nombre completo: Hugo Iván Marín Galicia 
 * Fecha de elaboración: 19 de Junio de 2024 
 * Nombre del Módulo: Tópicos Avanzados de Programación
 * Nombre del Asesor: Andrés Espinal Jiménez
 *
 * @author hugot
 */
import javax.swing.*;

public class GUIDemo {

    public static void main(String[] args) {
        
        // Crear y mostrar la ventana principal
        JFrame frame = new JFrame("GUIDemo");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    // Creación del panel y los botones.
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton swingButton = new JButton("Presiona SwingDemo");
        swingButton.setBounds(10, 20, 200, 25);
        panel.add(swingButton);

        JButton flatLafButton = new JButton("Presiona FlatLafDemo");
        flatLafButton.setBounds(10, 60, 200, 25);
        panel.add(flatLafButton);

        JButton jTattooButton = new JButton("Presiona JTattooDemo");
        jTattooButton.setBounds(10, 100, 200, 25);
        panel.add(jTattooButton);

        swingButton.addActionListener(e -> SwingDemo.open());
        flatLafButton.addActionListener(e -> FlatlafDemo.open());
        jTattooButton.addActionListener(e -> JTattooDemo.open());
    }
}
