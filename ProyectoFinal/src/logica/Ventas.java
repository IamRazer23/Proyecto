package logica;

import java.util.HashMap;
import java.util.Map;

public class Ventas {
    private Map<String, Integer> products;
    private Map<String, Integer> sales;

    public Ventas() {
        products = new HashMap<>();
        products.put("Gusi 550", 80);
        products.put("Gusi Airemaximo", 120);
        products.put("Gusi Zambors", 90);
        products.put("Gusi Walkstar", 65);

        sales = new HashMap<>();
        for (String product : products.keySet()) {
            sales.put(product, 0);
        }
    }

    public void addSale(String product, int quantity) {
        if (sales.containsKey(product)) {
            sales.put(product, sales.get(product) + quantity);
        }
    }

    public Map<String, Integer> getSales() {
        return sales;
    }

    public int getProductPrice(String product) {
        return products.getOrDefault(product, 0);
    }

    public int calculateTotalSales() {
        int total = 0;
        for (String product : sales.keySet()) {
            total += sales.get(product) * products.get(product);
        }
        return total;
    }

    public String getTopSellingProduct() {
        String topProduct = null;
        int maxSales = 0;
        for (String product : sales.keySet()) {
            if (sales.get(product) > maxSales) {
                maxSales = sales.get(product);
                topProduct = product;
            }
        }
        return topProduct;
    }
}
