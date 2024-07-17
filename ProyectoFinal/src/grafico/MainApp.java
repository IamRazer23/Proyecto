package grafico;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import logica.Login;
import logica.Reporte;
import logica.Ventas;

public class MainApp extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField txtUniversidadTecnolgicaDe;
    private JTextField txtFacultadDeIngeniera;
    private JTextField txtDepartamentoDeIngeniera;
    private JTextField txtLicenciaturaEnIngeniera;
    private JTextField txtCurso;
    private JTextField txtProgramacinDeSoftware;
    private JTextField txtProyectoSemestral;
    private JTextField txtIntegrantes;
    private JTextField txtFacilitador;
    private JTextField txtRodrigoYangez;
    private JTextField txtGrupo;
    private JTextField txtIsf;

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private LoginPanel loginPanel;
    private VentasPanel ventasPanel;
    private ReportePanel reportePanel;
    private Login login;
    private Ventas ventas;
    private Reporte reporte;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainApp frame = new MainApp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainApp() {
        initialize();
        login = new Login();  // Instancia de la lógica de login
        ventas = new Ventas();  // Instancia de la lógica de ventas
        reporte = new Reporte(ventas);  // Instancia del reporte basado en ventas
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 600);
        getContentPane().setLayout(new CardLayout());

        mainPanel = new JPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
        getContentPane().add(mainPanel);

        JPanel presentacionPanel = new JPanel();
        presentacionPanel.setLayout(null);
        mainPanel.add(presentacionPanel, "Presentacion");

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\botac\\git\\Proyecto\\ProyectoFinal\\Media\\fisc logo.jpg"));
        lblNewLabel.setBounds(737, 21, 138, 153);
        presentacionPanel.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\botac\\git\\Proyecto\\ProyectoFinal\\Media\\utp lgoo.jpg"));
        lblNewLabel_1.setBounds(10, 16, 138, 162);
        presentacionPanel.add(lblNewLabel_1);

        txtUniversidadTecnolgicaDe = new JTextField();
        txtUniversidadTecnolgicaDe.setBorder(null);
        txtUniversidadTecnolgicaDe.setFont(new Font("Tahoma", Font.BOLD, 17));
        txtUniversidadTecnolgicaDe.setBackground(SystemColor.menu);
        txtUniversidadTecnolgicaDe.setText("UNIVERSIDAD TECNOLÓGICA DE PANAMÁ");
        txtUniversidadTecnolgicaDe.setBounds(232, 21, 372, 34);
        presentacionPanel.add(txtUniversidadTecnolgicaDe);
        txtUniversidadTecnolgicaDe.setColumns(10);

        txtFacultadDeIngeniera = new JTextField();
        txtFacultadDeIngeniera.setBorder(null);
        txtFacultadDeIngeniera.setText("FACULTAD DE INGENIERÍA DE SISTEMAS COMPUTACIONALES");
        txtFacultadDeIngeniera.setFont(new Font("Tahoma", Font.BOLD, 17));
        txtFacultadDeIngeniera.setColumns(10);
        txtFacultadDeIngeniera.setBackground(SystemColor.menu);
        txtFacultadDeIngeniera.setBounds(176, 50, 551, 34);
        presentacionPanel.add(txtFacultadDeIngeniera);

        txtDepartamentoDeIngeniera = new JTextField();
        txtDepartamentoDeIngeniera.setText("DEPARTAMENTO DE INGENIERÍA DE SOFTWARE");
        txtDepartamentoDeIngeniera.setFont(new Font("Tahoma", Font.BOLD, 17));
        txtDepartamentoDeIngeniera.setColumns(10);
        txtDepartamentoDeIngeniera.setBorder(null);
        txtDepartamentoDeIngeniera.setBackground(SystemColor.menu);
        txtDepartamentoDeIngeniera.setBounds(220, 78, 439, 34);
        presentacionPanel.add(txtDepartamentoDeIngeniera);

        txtLicenciaturaEnIngeniera = new JTextField();
        txtLicenciaturaEnIngeniera.setText("LICENCIATURA EN INGENIERÍA DE SOFTWARE");
        txtLicenciaturaEnIngeniera.setFont(new Font("Tahoma", Font.BOLD, 17));
        txtLicenciaturaEnIngeniera.setColumns(10);
        txtLicenciaturaEnIngeniera.setBorder(null);
        txtLicenciaturaEnIngeniera.setBackground(SystemColor.menu);
        txtLicenciaturaEnIngeniera.setBounds(220, 111, 426, 34);
        presentacionPanel.add(txtLicenciaturaEnIngeniera);

        txtCurso = new JTextField();
        txtCurso.setHorizontalAlignment(SwingConstants.CENTER);
        txtCurso.setText("CURSO:");
        txtCurso.setFont(new Font("Tahoma", Font.BOLD, 17));
        txtCurso.setColumns(10);
        txtCurso.setBorder(null);
        txtCurso.setBackground(SystemColor.menu);
        txtCurso.setBounds(284, 156, 261, 34);
        presentacionPanel.add(txtCurso);

        txtProgramacinDeSoftware = new JTextField();
        txtProgramacinDeSoftware.setHorizontalAlignment(SwingConstants.CENTER);
        txtProgramacinDeSoftware.setText("PROGRAMACIÓN DE SOFTWARE");
        txtProgramacinDeSoftware.setFont(new Font("Tahoma", Font.PLAIN, 17));
        txtProgramacinDeSoftware.setColumns(10);
        txtProgramacinDeSoftware.setBorder(null);
        txtProgramacinDeSoftware.setBackground(SystemColor.menu);
        txtProgramacinDeSoftware.setBounds(294, 186, 261, 34);
        presentacionPanel.add(txtProgramacinDeSoftware);

        txtProyectoSemestral = new JTextField();
        txtProyectoSemestral.setHorizontalAlignment(SwingConstants.CENTER);
        txtProyectoSemestral.setText("PROYECTO SEMESTRAL");
        txtProyectoSemestral.setFont(new Font("Tahoma", Font.BOLD, 17));
        txtProyectoSemestral.setColumns(10);
        txtProyectoSemestral.setBorder(null);
        txtProyectoSemestral.setBackground(SystemColor.menu);
        txtProyectoSemestral.setBounds(284, 214, 261, 34);
        presentacionPanel.add(txtProyectoSemestral);

        txtIntegrantes = new JTextField();
        txtIntegrantes.setHorizontalAlignment(SwingConstants.CENTER);
        txtIntegrantes.setText("INTEGRANTES");
        txtIntegrantes.setFont(new Font("Tahoma", Font.BOLD, 17));
        txtIntegrantes.setColumns(10);
        txtIntegrantes.setBorder(null);
        txtIntegrantes.setBackground(SystemColor.menu);
        txtIntegrantes.setBounds(284, 304, 261, 34);
        presentacionPanel.add(txtIntegrantes);

        JTextPane txtpnAbigailKooJuan = new JTextPane();
        txtpnAbigailKooJuan.setFont(new Font("Tahoma", Font.PLAIN, 17));
        txtpnAbigailKooJuan.setBackground(Color.WHITE);
        txtpnAbigailKooJuan.setText("Juan Botacio 8-1011-560 \r\nOctavio Frauca 8-1010-1989 \r\nAbigail Koo 8-997-974 \r\nMaria Quiñones  8-988-1507 \r\n\r\n");
        txtpnAbigailKooJuan.setBounds(311, 337, 221, 92);
        presentacionPanel.add(txtpnAbigailKooJuan);

        txtFacilitador = new JTextField();
        txtFacilitador.setText("FACILITADOR");
        txtFacilitador.setHorizontalAlignment(SwingConstants.CENTER);
        txtFacilitador.setFont(new Font("Tahoma", Font.BOLD, 17));
        txtFacilitador.setColumns(10);
        txtFacilitador.setBorder(null);
        txtFacilitador.setBackground(SystemColor.menu);
        txtFacilitador.setBounds(284, 247, 261, 34);
        presentacionPanel.add(txtFacilitador);

        txtRodrigoYangez = new JTextField();
        txtRodrigoYangez.setText("RODRIGO YANGÜEZ");
        txtRodrigoYangez.setHorizontalAlignment(SwingConstants.CENTER);
        txtRodrigoYangez.setFont(new Font("Tahoma", Font.PLAIN, 17));
        txtRodrigoYangez.setColumns(10);
        txtRodrigoYangez.setBorder(null);
        txtRodrigoYangez.setBackground(SystemColor.menu);
        txtRodrigoYangez.setBounds(294, 276, 261, 34);
        presentacionPanel.add(txtRodrigoYangez);

        txtGrupo = new JTextField();
        txtGrupo.setText("GRUPO");
        txtGrupo.setHorizontalAlignment(SwingConstants.CENTER);
        txtGrupo.setFont(new Font("Tahoma", Font.BOLD, 17));
        txtGrupo.setColumns(10);
        txtGrupo.setBorder(null);
        txtGrupo.setBackground(SystemColor.menu);
        txtGrupo.setBounds(284, 428, 261, 34);
        presentacionPanel.add(txtGrupo);

        txtIsf = new JTextField();
        txtIsf.setText("ISF-121 ");
        txtIsf.setHorizontalAlignment(SwingConstants.CENTER);
        txtIsf.setFont(new Font("Tahoma", Font.PLAIN, 17));
        txtIsf.setColumns(10);
        txtIsf.setBorder(null);
        txtIsf.setBackground(SystemColor.menu);
        txtIsf.setBounds(284, 454, 261, 34);
        presentacionPanel.add(txtIsf);

        JButton btnIniciarPrograma = new JButton("Iniciar Programa");
        btnIniciarPrograma.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnIniciarPrograma.setBounds(311, 498, 229, 50);
        btnIniciarPrograma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Login");
            }
        });
        presentacionPanel.add(btnIniciarPrograma);

        loginPanel = new LoginPanel(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = loginPanel.getUsername();
                String password = loginPanel.getPassword();

                if (login.authenticate(username, password)) {
                    cardLayout.show(mainPanel, "Ventas");
                } else {
                    JOptionPane.showMessageDialog(MainApp.this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        ventasPanel = new VentasPanel();
        ventasPanel.addGenerateReportActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int gusi550Sales = ventasPanel.getGusi550Sales();
                int gusiAiremaximoSales = ventasPanel.getGusiAiremaximoSales();
                int gusiZamborsSales = ventasPanel.getGusiZamborsSales();
                int gusiWalkstarSales = ventasPanel.getGusiWalkstarSales();

                ventas.addSale("Gusi 550", gusi550Sales);
                ventas.addSale("Gusi Airemaximo", gusiAiremaximoSales);
                ventas.addSale("Gusi Zambors", gusiZamborsSales);
                ventas.addSale("Gusi Walkstar", gusiWalkstarSales);

                String reportText = reporte.generateReport();
                reportePanel.setReportText(reportText);

                cardLayout.show(mainPanel, "Reporte");
            }
        });

        ventasPanel.addCerrarSesionActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Login");
            }
        });

        reportePanel = new ReportePanel();
        reportePanel.addRegresarInformeActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Ventas");
            }
        });

        mainPanel.add(presentacionPanel, "Presentacion");
        mainPanel.add(loginPanel, "Login");
        mainPanel.add(ventasPanel, "Ventas");
        mainPanel.add(reportePanel, "Reporte");

        cardLayout.show(mainPanel, "Presentacion");
    }
}
