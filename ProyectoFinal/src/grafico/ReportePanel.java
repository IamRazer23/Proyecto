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
        reportArea.setFont(new Font("Monospaced", Font.PLAIN, 25));
        add(new JScrollPane(reportArea), BorderLayout.CENTER);

        btnShowChart = new JButton("Mostrar Gráfica");
        btnDownloadReport = new JButton("Descargar Reporte");

        JPanel buttonPanel = new JPanel();
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
