package guidemo;

/**
 * Nombre completo: Hugo Iván Marín Galicia 
 * Fecha de elaboración: 19 de Junio de 2024 
 * Nombre del Módulo: Tópicos Avanzados de Programación
 * Nombre del Asesor: Andrés Espinal Jiménez
 *
 * @author hugot
 */
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.*;

public class FlatlafDemo {

    public static void open() {
        try {
            // Configurar el Look and Feel de FlatLaf
            UIManager.setLookAndFeel(new FlatDarkLaf());

            // Crear y mostrar la ventana principal
            JFrame frame = new JFrame("Crear usuario");
            frame.setSize(400, 400);
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

        JLabel nameLabel = new JLabel("Nombre:");
        nameLabel.setBounds(10, 20, 80, 25);
        panel.add(nameLabel);

        JTextField nameText = new JTextField(20);
        nameText.setBounds(150, 20, 165, 25);
        panel.add(nameText);

        JLabel emailLabel = new JLabel("Correo electrónico:");
        emailLabel.setBounds(10, 60, 120, 25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(150, 60, 165, 25);
        panel.add(emailText);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 100, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(150, 100, 165, 25);
        panel.add(passwordText);

        JLabel confirmPasswordLabel = new JLabel("Confirma tu contraseña:");
        confirmPasswordLabel.setBounds(10, 140, 140, 25);
        panel.add(confirmPasswordLabel);

        JPasswordField confirmPasswordText = new JPasswordField(20);
        confirmPasswordText.setBounds(150, 140, 165, 25);
        panel.add(confirmPasswordText);

        JLabel countryLabel = new JLabel("País:");
        countryLabel.setBounds(10, 180, 80, 25);
        panel.add(countryLabel);

        String[] countries = {"Mexico", "Argentina", "Brasil", "Colombia", "Venezuela"};
        JComboBox<String> countryList = new JComboBox<>(countries);
        countryList.setBounds(150, 180, 165, 25);
        panel.add(countryList);

        JLabel genderLabel = new JLabel("Género:");
        genderLabel.setBounds(10, 220, 80, 25);
        panel.add(genderLabel);

        JRadioButton maleButton = new JRadioButton("Masculino");
        maleButton.setBounds(150, 220, 100, 25);
        panel.add(maleButton);

        JRadioButton femaleButton = new JRadioButton("Femenino");
        femaleButton.setBounds(250, 220, 100, 25);
        panel.add(femaleButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JCheckBox termsCheckBox = new JCheckBox("Acepto Términos y Condiciones");
        termsCheckBox.setBounds(10, 260, 300, 25);
        panel.add(termsCheckBox);

        JButton saveButton = new JButton("Guardar");
        saveButton.setBounds(10, 300, 100, 25);
        panel.add(saveButton);
    }
}
