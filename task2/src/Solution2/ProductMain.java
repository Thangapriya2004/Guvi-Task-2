package Solution2;

import java.util.Scanner;

public class ProductMain{
    // Method that calculates total amount spent on all products
    public static double calculateTotalAmount(Product[] products) {
        double total = 0.0;
        for (Product p : products) {
            if (p != null) {
                total += p.getPrice() * p.getQuantity();
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product[] products = new Product[5];

        System.out.println("Enter details for 5 products (pid price quantity) one by one:");
        for (int i = 0; i < products.length; i++) {
            System.out.print("Product " + (i + 1) + " - pid (int): ");
            int pid = sc.nextInt();
            System.out.print("Product " + (i + 1) + " - price (double): ");
            double price = sc.nextDouble();
            System.out.print("Product " + (i + 1) + " - quantity (int): ");
            int qty = sc.nextInt();

            products[i] = new Product(pid, price, qty);
            System.out.println("Stored: " + products[i]);
            System.out.println();
        }

        // Find pid of product with highest price
        double maxPrice = Double.NEGATIVE_INFINITY;
        int pidOfMaxPrice = -1;
        for (Product p : products) {
            if (p != null && p.getPrice() > maxPrice) {
                maxPrice = p.getPrice();
                pidOfMaxPrice = p.getPid();
            }
        }

        System.out.println("Product with highest price -> pid: " + pidOfMaxPrice + ", price: " + maxPrice);

        // Calculate total amount spent on all products
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        sc.close();
    }
}