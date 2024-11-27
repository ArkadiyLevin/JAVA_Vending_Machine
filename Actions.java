package Vending_Machine;

import java.util.Scanner;
import java.util.Set;

public class Actions {
    private Set<Product> products;
    private Scanner scanner = new Scanner(System.in);

    public Actions(Set<Product> products) {
        this.products = products;
    }


    // приветственное меню и выбор действия далее
    public void run() {
        boolean repeat = false;
        while (!repeat) {
            System.out.println("Добро пожаловать в торговый автомат!\nВыберете действие: ");
            System.out.println("1. Посмотреть список товаров");
            System.out.println("2. Выход из программы");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    listAvailableProducts();
                    repeat = selectAndPurchaseProduct();
                    break;
                case 2:
                    System.out.println("Спасибо,что пришли! До свидания!");
                    repeat = true;
                    return;
                default:
                    System.out.println("НЕТ ТАКОГО ВАРИАНТА! Попробуйте еще раз.");
            }
        }
    }

    // Просмотр наличия в автомате
    public void listAvailableProducts() {
        System.out.println("Товары в наличии: ");
        int count = 0;
        for (Product product : products) {
            if (product.getIsInStock()) {
                System.out.println((++count) + " . " + product.getName());
            }
        }
        System.out.println("Всего доступных товаров: " + products.stream().filter(Product::getIsInStock).count());
    }


    private boolean selectAndPurchaseProduct() {
        System.out.println("Введите номер выбранного товара(или 0 для выхода): ");
        int number = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Product product : products) {
            if (product.getNumber() == number && product.getIsInStock()) {
                System.out.println("Вы выбрали: " + product.getName());
                System.out.println("Цена" + product.getPrise() + "руб.");
                System.out.print("Введите сумму денег: ");
                int money = scanner.nextInt();
                scanner.nextLine();
                scanner.nextLine();


                if (money >= product.getPrise()) {
                    System.out.println("Вот ваша сдача: " + (money - product.getPrise() + "руб."));
                    System.out.println("Спасибо за покупку! \nПриятного аппетита! \nДо свидания!");
                    return true;
                } else {
                    System.out.println("Недостаточно средств. Попробуйте снова.");
                }
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Товар с номером " + number + " не найдет или закончился, попробуйте выбрать другой");
            System.out.println("Попробуйте выбрать другой товар? (да/нет)");
            String choice = scanner.nextLine().trim();
            if (choice.equalsIgnoreCase("да")) {
                return false;
            } else if (choice.equalsIgnoreCase("нет")) {
                System.out.println("Спасибо за использование! До свидания!");
                return true;
            } else {
                System.out.println("Пожалуйста, введите 'да' или 'нет'. ");
            }
        }
        return false;
    }
}
