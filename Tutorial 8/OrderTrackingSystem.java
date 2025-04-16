import java.util.Scanner;

enum OrderStatus {
    PLACED, SHIPPED, DELIVERED, CANCELLED
}

public class OrderTrackingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your order status (PLACED, SHIPPED, DELIVERED, CANCELLED): ");
        String input = scanner.next().toUpperCase();

        try {
            OrderStatus status = OrderStatus.valueOf(input);
            switch (status) {
                case PLACED:
                    System.out.println("Your order has been placed successfully!");
                    break;
                case SHIPPED:
                    System.out.println("Your order is on the way!");
                    break;
                case DELIVERED:
                    System.out.println("Your order has been delivered. Enjoy!");
                    break;
                case CANCELLED:
                    System.out.println("Your order has been cancelled.");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid order status! Please try again.");
        }

        scanner.close();
    }
}
