public class ViewOrders {

    public static void showOrders() {

        for (Order order : OrderData.orders) {

            System.out.println(
                    "Order #" +
                    order.getOrderId() +
                    " | " +
                    order.getCustomerName() +
                    " | ₹" +
                    order.getTotal() +
                    " | " +
                    order.getStatus()
            );
        }
    }
}
