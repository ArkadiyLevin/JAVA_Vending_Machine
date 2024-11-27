package Vending_Machine;


import java.util.Set;

public class Machine_Operation {
    public static void main(String[] args) {
        Set<Product> products = Products.getProducts();
        Actions actions = new Actions(products);
        actions.run();
    }
}
