import java.util.ArrayList;

class ViewProduct {

    static ArrayList<Product> products =
            new ArrayList<>();

    static void viewProducts() {

        if (products.isEmpty()) {

            System.out.println(
                    "No products available.");

            return;
        }

        for (Product product : products) {

            System.out.println(
                    "\n----------------------");

            System.out.println(
                    "Product ID : " +
                    product.productId);

            System.out.println(
                    "Product    : " +
                    product.productName);

            System.out.println(
                    "Seller     : " +
                    product.sellerName);

            System.out.println(
                    "Price      : ₹" +
                    product.price);

            System.out.println(
                    "Quantity   : " +
                    product.quantity);

            System.out.println(
                    "----------------------");
        }
    }
}
