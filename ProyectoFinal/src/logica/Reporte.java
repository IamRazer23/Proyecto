package logica;

import java.util.Map;

public class Reporte {
    private Ventas ventas;

    public Reporte(Ventas ventas) {
        this.ventas = ventas;
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder("Reporte de Ventas:\n");
        for (Map.Entry<String, Integer> entry : ventas.getSales().entrySet()) {
            report.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        report.append("Total Ventas: $").append(ventas.calculateTotalSales()).append("\n");
        report.append("Predicción de Ventas para el Próximo Mes: $").append(predictNextMonthSales()).append("\n");
        report.append("Producto con Mayor Ganancia: ").append(ventas.getTopSellingProduct()).append("\n");

        return report.toString();
    }

    public int predictNextMonthSales() {
        return (int) (ventas.calculateTotalSales() * 1.1); // Predicción simple: incremento del 10%
    }

    public void showPieChart() {
        // Implementar la lógica para mostrar una gráfica de pastel con gastos, ventas y ganancias.
        // Esta es una simulación simple, en una implementación real se utilizaría una biblioteca de gráficos como JFreeChart.
        System.out.println("Mostrando gráfica de pastel...");
    }

    public void downloadReport(String filename) {
        // Implementar la lógica para descargar el reporte.
        System.out.println("Reporte descargado como " + filename);
    }
}
