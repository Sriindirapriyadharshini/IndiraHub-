import java.util.Scanner;

public class Checkout {

    public static void checkout(
            User customer,
            Cart cart) {

        Scanner sc = new Scanner(System.in);

        if (cart.getItems().isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        cart.displayCart();

        System.out.print("\nConfirm order? (yes/no): ");
        String answer = sc.nextLine();

        if (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Order cancelled.");
            return;
        }

        for (OrderItem item : cart.getItems()) {

            Product product = item.getProduct();

            product.setQuantity(
                product.getQuantity() -
                item.getQuantity()
            );
        }

        Order order = OrderData.createOrder(
            customer.getId(),
            cart.getItems(),
            cart.getTotal()
        );

        System.out.println("\nOrder placed successfully.");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Total: Rs." + order.getTotal());

        cart.clear();
    }
}
