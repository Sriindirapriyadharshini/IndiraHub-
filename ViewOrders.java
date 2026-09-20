import java.util.ArrayList;

public class ViewOrders {

    public static void customerOrders(User customer) {

        ArrayList<Order> orders =
            OrderData.getCustomerOrders(customer.getId());

        System.out.println("\n===== MY ORDERS =====");

        if (orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }

        for (Order order : orders) {
            order.displayOrder();
        }
    }

    public static void allOrders() {

        System.out.println("\n===== ALL ORDERS =====");

        if (OrderData.orders.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }

        for (Order order : OrderData.orders) {
            order.displayOrder();
        }
    }
}
