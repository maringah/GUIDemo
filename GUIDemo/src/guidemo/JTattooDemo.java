package guidemo;

/**
 * Nombre completo: Hugo Iván Marín Galicia 
 * Fecha de elaboración: 19 de Junio de 2024 
 * Nombre del Módulo: Tópicos Avanzados de Programación
 * Nombre del Asesor: Andrés Espinal Jiménez
 *
 * @author hugot
 */
import com.jtattoo.plaf.aluminium.AluminiumLookAndFeel;
import javax.swing.*;

public class JTattooDemo {

    public static void open() {
        try {
            // Configurar el Look and Feel de JTattoo
            UIManager.setLookAndFeel(new AluminiumLookAndFeel());

            // Crear y mostrar la ventana principal
            JFrame frame = new JFrame("Recuperar Contraseña");
            frame.setSize(450, 350);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.add(panel);
            placeComponents(panel);

            frame.setVisible(true);
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }

    // Creación del panel y sus componentes.
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel emailLabel = new JLabel("Ingresa tu correo:");
        emailLabel.setBounds(10, 20, 150, 25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(250, 20, 165, 25);
        panel.add(emailText);

        JLabel codeLabel = new JLabel("Ingresa el código enviado a tu correo:");
        codeLabel.setBounds(10, 60, 250, 25);
        panel.add(codeLabel);

        JTextField codeField1 = new JTextField(1);
        codeField1.setBounds(250, 60, 16, 25);
        panel.add(codeField1);

        JTextField codeField2 = new JTextField(1);
        codeField2.setBounds(300, 60, 16, 25);
        panel.add(codeField2);

        JTextField codeField3 = new JTextField(1);
        codeField3.setBounds(350, 60, 16, 25);
        panel.add(codeField3);

        JTextField codeField4 = new JTextField(1);
        codeField4.setBounds(400, 60, 16, 25);
        panel.add(codeField4);

        JLabel newPasswordLabel = new JLabel("Nueva contraseña:");
        newPasswordLabel.setBounds(10, 100, 150, 25);
        panel.add(newPasswordLabel);

        JPasswordField newPasswordText = new JPasswordField(20);
        newPasswordText.setBounds(250, 100, 165, 25);
        panel.add(newPasswordText);

        JLabel confirmPasswordLabel = new JLabel("Confirma tu nueva contraseña:");
        confirmPasswordLabel.setBounds(10, 140, 180, 25);
        panel.add(confirmPasswordLabel);

        JPasswordField confirmPasswordText = new JPasswordField(20);
        confirmPasswordText.setBounds(250, 140, 165, 25);
        panel.add(confirmPasswordText);

        JButton saveButton = new JButton("Guardar");
        saveButton.setBounds(10, 180, 100, 25);
        panel.add(saveButton);
    }
}
