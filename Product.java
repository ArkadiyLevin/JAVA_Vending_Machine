package Vending_Machine;

import java.util.Objects;

public class Product extends Products {
   protected String name;
   protected double prise;
   protected int number;
   private boolean isInStock = true;

   public Product(String name, double prise, int number, boolean isInStock) {
      this.name = name;
      this.prise = prise;
      this.number = number;
      this.isInStock = isInStock;
   }

   public String getName() {
      return name;
   }

   public double getPrise() {
      return prise;
   }

   public int getNumber() {
      return number;
   }

   public void setInStock(boolean isInStock) {
      this.isInStock = isInStock;
   }

   public boolean getIsInStock() {
      return isInStock;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Product product = (Product) o;
      return Double.compare(prise, product.prise) == 0 && number == product.number && isInStock == product.isInStock && Objects.equals(name, product.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, prise, number, isInStock);
   }

   @Override
   public String toString() {
      return "Product{" +
              "name='" + name + '\'' +
              ", prise=" + prise + "p." +
              ", number=" + number +
              ", isInStock=" + isInStock +
              '}';
   }
}





