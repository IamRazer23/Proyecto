package grafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReportePanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextArea reportArea;
    private JPanel panel;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;

    public ReportePanel() {
        initialize();
    }

    private void initialize() {
        setLayout(new BorderLayout());

        reportArea = new JTextArea();
        reportArea.setForeground(new Color(239, 199, 94));
        reportArea.setBackground(Color.DARK_GRAY);
        reportArea.setFont(new Font("Monospaced", Font.PLAIN, 25));
        JScrollPane scrollPane = new JScrollPane(reportArea);
        add(scrollPane, BorderLayout.CENTER);
        
        panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        scrollPane.setColumnHeaderView(panel);
        panel.setLayout(new GridLayout(0, 3, 0, 0));
        
        lblNewLabel_1 = new JLabel("Regresar Informe");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBackground(Color.DARK_GRAY);
        panel.add(lblNewLabel_1);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setBackground(Color.DARK_GRAY);
        panel.add(lblNewLabel);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.DARK_GRAY);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void setReportText(String reportText) {
        reportArea.setText(reportText);
    }
    
    public void addRegresarInformeActionListener(ActionListener listener) {
        lblNewLabel_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listener.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "regresar"));
            }
        });
    }
}
