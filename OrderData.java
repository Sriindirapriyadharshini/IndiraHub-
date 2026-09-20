import java.util.ArrayList;

public class OrderData {

    public static ArrayList<Order> orders = new ArrayList<>();

    private static int nextOrderId = 1;

    public static Order createOrder(
            int customerId,
            ArrayList<OrderItem> items,
            double total) {

        Order order = new Order(
            nextOrderId++,
            customerId,
            items,
            total
        );

        orders.add(order);

        return order;
    }

    public static ArrayList<Order> getCustomerOrders(int customerId) {

        ArrayList<Order> result = new ArrayList<>();

        for (Order order : orders) {
            if (order.getCustomerId() == customerId) {
                result.add(order);
            }
        }

        return result;
    }
}
