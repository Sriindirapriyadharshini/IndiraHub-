import java.util.ArrayList;

public class Order {
    private int orderId;
    private int customerId;
    private ArrayList<OrderItem> items;
    private double total;
    private String status;

    public Order(int orderId, int customerId,
                 ArrayList<OrderItem> items,
                 double total) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.items = new ArrayList<>(items);
        this.total = total;
        this.status = "PLACED";
    }

    public int getOrderId() {
        return orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayOrder() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Status: " + status);

        for (OrderItem item : items) {
            System.out.println(
                item.getProduct().getName() +
                " x " + item.getQuantity()
            );
        }

        System.out.println("Total: Rs." + total);
    }
}
