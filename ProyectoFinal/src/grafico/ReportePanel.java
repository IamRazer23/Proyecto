package grafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ReportePanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextArea reportArea;
    private JButton btnShowChart;
    private JButton btnDownloadReport;

    public ReportePanel() {
        initialize();
    }

    private void initialize() {
        setLayout(new BorderLayout());

        reportArea = new JTextArea();
        reportArea.setForeground(new Color(239, 199, 94));
        reportArea.setBackground(Color.DARK_GRAY);
        reportArea.setFont(new Font("Monospaced", Font.PLAIN, 25));
        add(new JScrollPane(reportArea), BorderLayout.CENTER);

        btnShowChart = new JButton("Mostrar Gráfica");
        btnShowChart.setForeground(new Color(239, 199, 94));
        btnShowChart.setBackground(Color.DARK_GRAY);
        btnDownloadReport = new JButton("Descargar Reporte");
        btnDownloadReport.setForeground(new Color(239, 199, 94));
        btnDownloadReport.setBackground(Color.DARK_GRAY);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.DARK_GRAY);
        buttonPanel.add(btnShowChart);
        buttonPanel.add(btnDownloadReport);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void addShowChartActionListener(ActionListener listener) {
        btnShowChart.addActionListener(listener);
    }

    public void addDownloadReportActionListener(ActionListener listener) {
        btnDownloadReport.addActionListener(listener);
    }

    public void setReportText(String reportText) {
        reportArea.setText(reportText);
    }
}
