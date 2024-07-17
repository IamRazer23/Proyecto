package grafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LoginPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginPanel(ActionListener loginListener) {
    	setBackground(Color.DARK_GRAY);
        setLayout(null);
        setBounds(0, 0, 900, 600);

        JLabel lblLogin = new JLabel("Inicio de Sesión");
        lblLogin.setForeground(new Color(239, 199, 94));
        lblLogin.setFont(new Font("Tahoma", Font.BOLD, 40));
        lblLogin.setBounds(296, 228, 336, 52);
        add(lblLogin);

        JLabel lblUser = new JLabel("Usuario");
        lblUser.setForeground(new Color(239, 199, 94));
        lblUser.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblUser.setBounds(245, 310, 100, 30);
        add(lblUser);

        JLabel lblPassword = new JLabel("Contraseña");
        lblPassword.setForeground(new Color(239, 199, 94));
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblPassword.setBounds(225, 373, 172, 30);
        add(lblPassword);

        usernameField = new JTextField();
        usernameField.setBackground(Color.DARK_GRAY);
        usernameField.setForeground(new Color(239, 199, 94));
        usernameField.setBounds(492, 291, 249, 52);
        add(usernameField);
        usernameField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setBackground(Color.DARK_GRAY);
        passwordField.setForeground(new Color(239, 199, 94));
        passwordField.setBounds(492, 351, 249, 52);
        add(passwordField);

        JButton btnEnter = new JButton("Enter");
        btnEnter.setBackground(Color.DARK_GRAY);
        btnEnter.setForeground(new Color(239, 199, 94));
        btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 32));
        btnEnter.setBounds(359, 414, 215, 61);
        add(btnEnter);

        btnEnter.addActionListener(e -> {
            String username = getUsername();
            String password = getPassword();

            // Aquí debe verificarse la autenticación usando la lógica de Login
            if (username.equals("admin") && password.equals("admin")) {
                // Si la autenticación es exitosa, notificar al ActionListener
                loginListener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "login"));
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                
                JLabel logo = new JLabel("");
                logo.setLabelFor(logo);
                logo.setForeground(Color.WHITE);
                logo.setBackground(new Color(153, 0, 0));
                logo.setVerticalAlignment(SwingConstants.BOTTOM);
                logo.setHorizontalAlignment(SwingConstants.RIGHT);
                logo.setIcon(new ImageIcon("C:\\Users\\botac\\OneDrive\\PC JUAN\\Escritorio\\Imagen de WhatsApp 2024-07-17 a las 00.32.03_2c463cb5.jpg"));
                logo.setBounds(180, 0, 372, 232);
                add(logo);
            }
        });

        // Agregar KeyListener para capturar la tecla Enter en el campo de contraseña
        passwordField.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Simular clic en el botón Enter al presionar Enter en el campo de contraseña
                    btnEnter.doClick();
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }
}