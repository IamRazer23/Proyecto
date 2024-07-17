package grafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentasPanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField Gusi550Field;
    private JTextField AiremaximoField;
    private JTextField ZamborsField;
    private JTextField WalkStarField;
    private JButton btnGenerateReport;

    public VentasPanel() {
        setBackground(Color.DARK_GRAY);
        setLayout(new BorderLayout(0, 0));

        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelSuperior.setBackground(Color.DARK_GRAY);
        JLabel lblTitulo = new JLabel("INFORME DE VENTAS");
        lblTitulo.setForeground(new Color(239, 199, 94));
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        panelSuperior.add(lblTitulo);
        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new GridLayout(4, 2, 10, 10));
        panelCentral.setBackground(Color.DARK_GRAY);

        JLabel LabelW1 = new JLabel("Gusi 550");
        LabelW1.setForeground(new Color(239, 199, 94));
        LabelW1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        LabelW1.setIcon(new ImageIcon("C:\\Users\\botac\\git\\Proyecto\\ProyectoFinal\\Media\\gusi550.png"));
        LabelW1.setHorizontalAlignment(SwingConstants.CENTER);
        panelCentral.add(LabelW1);

        Gusi550Field = new JTextField();
        Gusi550Field.setForeground(new Color(239, 199, 94));
        Gusi550Field.setBackground(Color.DARK_GRAY);
        Gusi550Field.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Gusi550Field.setInputVerifier(new IntegerVerifier());
        panelCentral.add(Gusi550Field);
        Gusi550Field.setColumns(10);

        JLabel LabelW2 = new JLabel("Gusi Airemaximo");
        LabelW2.setForeground(new Color(239, 199, 94));
        LabelW2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        LabelW2.setIcon(new ImageIcon("C:\\Users\\botac\\git\\Proyecto\\ProyectoFinal\\Media\\gusi2.png"));
        LabelW2.setHorizontalAlignment(SwingConstants.CENTER);
        panelCentral.add(LabelW2);

        AiremaximoField = new JTextField();
        AiremaximoField.setForeground(new Color(239, 199, 94));
        AiremaximoField.setBackground(Color.DARK_GRAY);
        AiremaximoField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        AiremaximoField.setInputVerifier(new IntegerVerifier());
        panelCentral.add(AiremaximoField);
        AiremaximoField.setColumns(10);

        JLabel LabelW3 = new JLabel("Gusi Zambors");
        LabelW3.setForeground(new Color(239, 199, 94));
        LabelW3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        LabelW3.setIcon(new ImageIcon("C:\\Users\\botac\\git\\Proyecto\\ProyectoFinal\\Media\\gusi3.png"));
        LabelW3.setHorizontalAlignment(SwingConstants.CENTER);
        panelCentral.add(LabelW3);

        ZamborsField = new JTextField();
        ZamborsField.setForeground(new Color(239, 199, 94));
        ZamborsField.setBackground(Color.DARK_GRAY);
        ZamborsField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        ZamborsField.setInputVerifier(new IntegerVerifier());
        panelCentral.add(ZamborsField);
        ZamborsField.setColumns(10);

        JLabel LabelW4 = new JLabel("Gusi WalkStar");
        LabelW4.setForeground(new Color(239, 199, 94));
        LabelW4.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        LabelW4.setIcon(new ImageIcon("C:\\Users\\botac\\git\\Proyecto\\ProyectoFinal\\Media\\gusi5.png"));
        LabelW4.setHorizontalAlignment(SwingConstants.CENTER);
        panelCentral.add(LabelW4);

        WalkStarField = new JTextField();
        WalkStarField.setForeground(new Color(239, 199, 94));
        WalkStarField.setBackground(Color.DARK_GRAY);
        WalkStarField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        WalkStarField.setInputVerifier(new IntegerVerifier());
        panelCentral.add(WalkStarField);
        WalkStarField.setColumns(10);

        add(panelCentral, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelInferior.setBackground(Color.DARK_GRAY);
        btnGenerateReport = new JButton("Generar Reporte");
        btnGenerateReport.setBackground(Color.DARK_GRAY);
        btnGenerateReport.setForeground(new Color(239, 199, 94));
        panelInferior.add(btnGenerateReport);
        add(panelInferior, BorderLayout.SOUTH);
    }

    public void addGenerateReportActionListener(ActionListener listener) {
        btnGenerateReport.addActionListener(listener);
    }

    public int getGusi550Sales() {
        return parseTextField(Gusi550Field.getText());
    }

    public int getGusiAiremaximoSales() {
        return parseTextField(AiremaximoField.getText());
    }

    public int getGusiZamborsSales() {
        return parseTextField(ZamborsField.getText());
    }

    public int getGusiWalkstarSales() {
        return parseTextField(WalkStarField.getText());
    }

    private int parseTextField(String text) {
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Please enter a valid integer");
        }
    }

    class IntegerVerifier extends InputVerifier {
        @Override
        public boolean verify(JComponent input) {
            JTextField textField = (JTextField) input;
            try {
                Integer.parseInt(textField.getText());
                return true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid integer", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
}
