package Vending_Machine;

import java.util.HashSet;
import java.util.Set;

public class Products {
    public static Set<Product> getProducts() {
        Set<Product> products = new HashSet<>();
        products.add(new Product("Snickers", 75.0, 1, true));
        products.add(new Product("Twix", 70.0, 2, true));
        products.add(new Product("Bounty", 80.0, 3, true));
        products.add(new Product("KitKat", 90.0, 4, false));
        products.add(new Product("KitKat", 90.0, 5, false));
        products.add(new Product("Snickers", 75.0, 6, true));
        products.add(new Product("Twix", 70.0, 7, true));
        products.add(new Product("Bounty", 80.0, 8, false));
        products.add(new Product("KitKat", 90.0, 9, true));
        products.add(new Product("Bounty", 90.0, 10, false));
        products.add(new Product("Snickers", 75.0, 11, false));
        products.add(new Product("Twix", 70.0, 12, true));
        products.add(new Product("Bounty", 80.0, 13, true));
        products.add(new Product("KitKat", 90.0, 14, true));
        products.add(new Product("Twix", 70.0, 15, true));
        products.add(new Product("Snickers", 75.0, 16, true));
        products.add(new Product("KitKat", 90.0, 17, true));
        products.add(new Product("Twix", 70.0, 18, false));
        products.add(new Product("Snickers", 75.0, 19, false));
        products.add(new Product("Bounty", 80.0, 20, true));
        products.add(new Product("Twix", 70.0, 21, true));
        products.add(new Product("Snickers", 75.0, 22, true));
        products.add(new Product("Bounty", 80.0, 23, false));
        products.add(new Product("KitKat", 90.0, 24, true));
        return products;
    }
}
