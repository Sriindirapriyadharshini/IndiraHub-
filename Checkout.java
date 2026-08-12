import java.util.ArrayList;

class Checkout {

    static void checkout(
            ArrayList<CartItem> cart) {

        if (cart.isEmpty()) {

            System.out.println(
                    "Your cart is empty.");

            return;
        }

        double total = 0;

        for (CartItem item : cart) {

            if (item.quantity >
                    item.product.quantity) {

                System.out.println(
                        "Not enough stock for "
                        + item.product.productName);

                return;
            }

            total +=
                    item.calculateTotal();
        }

        for (CartItem item : cart) {

            item.product.quantity -=
                    item.quantity;
        }

        System.out.println(
                "\n========== INDIRAHUB CHECKOUT ==========");

        System.out.printf(
                "Total Amount : ₹%.2f%n",
                total);

        System.out.println(
                "Order placed successfully!");

        System.out.println(
                "========================================");

        cart.clear();
    }
}
