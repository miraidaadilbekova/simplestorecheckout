import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
    double subtotal = 0.0;
    int itemsPurchased = 0;
    int choice = 0;

    while (choice != 5) {
        System.out.println("===== SIMPLE STORE =====");
        System.out.println("1. Mouse - $20");
        System.out.println("2. Keyboard - $40");
        System.out.println("3. Headphones - $50");
        System.out.println("4. Laptop Stand - $30");
        System.out.println("5. Checkout");
        System.out.print("Choose a product: ");

        choice = scanner.nextInt();

        if (choice < 1 || choice > 5) {
            System.out.println("Invalid option.");
            System.out.println("Please choose a number from 1 to 5.");
            continue;
        }

        if (choice == 5) {
            break;
        }

        String productName = "";
        double price = 0.0;

        if (choice == 1) {
            productName = "Mouse";
            price = 20.0;
        } else if (choice == 2) {
            productName = "Keyboard";
            price = 40.0;
        } else if (choice == 3) {
            productName = "Headphones";
            price = 50.0;
        } else if (choice == 4) {
            productName = "Laptop Stand";
            price = 30.0;
        }

        System.out.println("You selected: " + productName);
        System.out.println("Price: $" + (int)price);
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            System.out.println("Quantity must be greater than 0.");
            continue;
        }

        double itemCost = price * quantity;
        subtotal += itemCost;
        itemsPurchased += quantity;

        System.out.println("Added to cart!");
        System.out.println("Current total: $" + (int)subtotal);
        System.out.println();
    }

    System.out.println("===== CHECKOUT =====");
    System.out.println("Items purchased: " + itemsPurchased);
    System.out.println("Subtotal: $" + (int)subtotal);

    double discount = 0.0;
    if (subtotal >= 100) {
        discount = subtotal * 0.10;
        System.out.println("You received a 10% discount!");
        System.out.println("Discount: $" + (int)discount);
    } else {
        System.out.println("Discount: $0");
    }

    double finalTotal = subtotal - discount;
    System.out.println("Final total: $" + (int)finalTotal);

    double payment = 0.0;
    while (true) {
        System.out.print("Enter payment amount: $");
        payment = scanner.nextDouble();

        if (payment < finalTotal) {
            double remaining = finalTotal - payment;
            System.out.println("Insufficient payment.");
            System.out.println("You still need to pay: $" + (int)remaining);
        } else {
            System.out.println("Payment successful!");
            break;
        }
    }

    double change = payment - finalTotal;

    System.out.println("========================");
    System.out.println("SIMPLE STORE");
    System.out.println("========================");
    System.out.println("Items purchased: " + itemsPurchased);
    System.out.println("Subtotal: $" + (int)subtotal);
    System.out.println("Discount: $" + (int)discount);
    System.out.println("Final total: $" + (int)finalTotal);
    System.out.println("Payment: $" + (int)payment);
    System.out.println("Change: $" + (int)change);
    System.out.println("========================");
    System.out.println("Thank you for shopping!");
    System.out.println("========================");

    scanner.close();
}
}