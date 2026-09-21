import java.util.ArrayList;

public class Checkout {

    public static Order placeOrder(User user, Cart cart) {

        ArrayList<OrderItem> items = new ArrayList<>();

        for (Product product : cart.getProducts()) {

            OrderItem item = new OrderItem(
                    product.getId(),
                    product.getName(),
                    product.getPrice(),
                    1
            );

            items.add(item);
        }

        int orderId = OrderData.orders.size() + 1;

        Order order = new Order(
                orderId,
                user.getName(),
                user.getEmail(),
                items,
                cart.getTotal()
        );

        OrderData.addOrder(order);

        cart.clear();

        return order;
    }
}
