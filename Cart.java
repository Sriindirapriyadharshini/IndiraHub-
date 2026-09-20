import java.util.ArrayList;

public class Cart {
    private ArrayList<OrderItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        for (OrderItem item : items) {
            if (item.getProduct().getId() == product.getId()) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }

        items.add(new OrderItem(product, quantity));
    }

    public void removeItem(int productId) {
        items.removeIf(item ->
            item.getProduct().getId() == productId
        );
    }

    public double getTotal() {
        double total = 0;

        for (OrderItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }

        return total;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void clear() {
        items.clear();
    }

    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        for (OrderItem item : items) {
            System.out.println(
                item.getProduct().getName() +
                " x " + item.getQuantity() +
                " = Rs." +
                item.getProduct().getPrice() * item.getQuantity()
            );
        }

        System.out.println("Total: Rs." + getTotal());
    }
}
