package ecommerce;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public void clear() {
        products.clear();
    }
}