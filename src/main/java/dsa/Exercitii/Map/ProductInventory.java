package dsa.Exercitii.Map;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

class Product{
    private String name;
    private Integer quantity;

    public Product(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
public class ProductInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedMap<Integer, Product> inventory = new TreeMap<>();
        int productIdConter = 1;
        String productName;
        int quantity;
        while (true){
            System.out.println("\nProduct inventory system:");
            System.out.println("1. Add new product:");
            System.out.println("2. Display all products:");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter product name: ");
                    productName = scanner.nextLine();
                    System.out.print("Enter product quantity: ");
                    quantity = scanner.nextInt();

                    inventory.put(productIdConter, new Product(productName, quantity));
                    System.out.println("Product added successfully by ID: " + productIdConter);
                    productIdConter++;
                    break;
                case 2:
                    System.out.println("Product:");
                    for (Map.Entry<Integer, Product> it : inventory.entrySet()){
                        System.out.println(it.getKey() + " : " + it.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Exiting peogram...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again from 1 to 3.");
            }
        }
    }
}
