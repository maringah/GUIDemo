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

public class SwingDemo {

    public static void open() {
        JFrame frame = new JFrame("Iniciar sesión");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    // Creación del panel y sus componentes.
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Ingresar");
        loginButton.setBounds(10, 80, 100, 25);
        panel.add(loginButton);

        JButton registerButton = new JButton("Registrate");
        registerButton.setBounds(180, 80, 100, 25);
        panel.add(registerButton);

        JButton recoverButton = new JButton("Recuperar Contraseña");
        recoverButton.setBounds(10, 110, 270, 25);
        panel.add(recoverButton);
    }
}
