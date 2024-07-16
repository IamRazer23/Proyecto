package grafico;

import javax.swing.*;

import logica.Login;
import logica.Reporte;
import logica.Ventas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainApp {
    private JFrame frame;
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private LoginPanel loginPanel;
    private VentasPanel ventasPanel;
    private ReportePanel reportePanel;
    private Login login;
    private Ventas ventas;
    private Reporte reporte;

    public MainApp() {
        initialize();
        login = new Login();  // Instancia de la lógica de login
        ventas = new Ventas();  // Instancia de la lógica de ventas
        reporte = new Reporte(ventas);  // Instancia del reporte basado en ventas
    }

    private void initialize() {
        frame = new JFrame("Sistema de Ventas");
        frame.setBounds(100, 100, 900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        loginPanel = new LoginPanel(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = loginPanel.getUsername();
                String password = loginPanel.getPassword();

                if (login.authenticate(username, password)) {
                    cardLayout.show(mainPanel, "Ventas");
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        loginPanel.setBackground(new Color(169, 169, 169));

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

        reportePanel = new ReportePanel();
        reportePanel.addShowChartActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reporte.showPieChart();
            }
        });
        reportePanel.addDownloadReportActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reporte.downloadReport("reporte.txt");
            }
        });

        mainPanel.add(loginPanel, "Login");
        mainPanel.add(ventasPanel, "Ventas");
        mainPanel.add(reportePanel, "Reporte");

        frame.getContentPane().add(mainPanel);
        cardLayout.show(mainPanel, "Login");

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MainApp();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
