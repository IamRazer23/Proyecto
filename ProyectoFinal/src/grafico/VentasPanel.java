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
        setLayout(new BorderLayout(0, 0));

        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel lblTitulo = new JLabel("INFORME DE VENTAS");
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        panelSuperior.add(lblTitulo);
        add(panelSuperior, BorderLayout.NORTH);

        JPanel panelCentral = new JPanel(new GridLayout(4, 2, 10, 10));

        JLabel LabelW1 = new JLabel("Gusi 550");
        LabelW1.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        LabelW1.setIcon(new ImageIcon("C:\\Users\\botac\\git\\ProyectoFinal\\ProyectoFinal\\Media\\gusi550.png"));
        LabelW1.setHorizontalAlignment(SwingConstants.CENTER);
        panelCentral.add(LabelW1);

        Gusi550Field = new JTextField();
        Gusi550Field.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panelCentral.add(Gusi550Field);
        Gusi550Field.setColumns(10);

        JLabel LabelW2 = new JLabel("Gusi Airemaximo");
        LabelW2.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        LabelW2.setIcon(new ImageIcon("C:\\Users\\botac\\git\\ProyectoFinal\\ProyectoFinal\\Media\\gusi2.png"));
        LabelW2.setHorizontalAlignment(SwingConstants.CENTER);
        panelCentral.add(LabelW2);

        AiremaximoField = new JTextField();
        AiremaximoField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panelCentral.add(AiremaximoField);
        AiremaximoField.setColumns(10);

        JLabel LabelW3 = new JLabel("Gusi Zambors");
        LabelW3.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        LabelW3.setIcon(new ImageIcon("C:\\Users\\botac\\git\\ProyectoFinal\\ProyectoFinal\\Media\\gusi3.png"));
        LabelW3.setHorizontalAlignment(SwingConstants.CENTER);
        panelCentral.add(LabelW3);

        ZamborsField = new JTextField();
        ZamborsField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panelCentral.add(ZamborsField);
        ZamborsField.setColumns(10);

        JLabel LabelW4 = new JLabel("Gusi WalkStar");
        LabelW4.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
        LabelW4.setIcon(new ImageIcon("C:\\Users\\botac\\git\\ProyectoFinal\\ProyectoFinal\\Media\\gusi5.png"));
        LabelW4.setHorizontalAlignment(SwingConstants.CENTER);
        panelCentral.add(LabelW4);

        WalkStarField = new JTextField();
        WalkStarField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        panelCentral.add(WalkStarField);
        WalkStarField.setColumns(10);

        add(panelCentral, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnGenerateReport = new JButton("Generar Reporte");
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
            return 0;
        }
    }
}