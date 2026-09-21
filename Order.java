import java.util.ArrayList;

public class Order {

    private int orderId;
    private String customerName;
    private String customerEmail;
    private ArrayList<OrderItem> items;
    private double total;
    private String status;

    public Order(int orderId,
                 String customerName,
                 String customerEmail,
                 ArrayList<OrderItem> items,
                 double total) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.items = items;
        this.total = total;
        this.status = "Order Placed";
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
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
}
