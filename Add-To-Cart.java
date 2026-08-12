import java.util.ArrayList;
import java.util.Scanner;

class CartItem {

    Product product;
    int quantity;

    CartItem(Product product, int quantity) {

        this.product = product;
        this.quantity = quantity;
    }

    double calculateTotal() {

        return product.price * quantity;
    }
}

class Cart {

    static ArrayList<CartItem> cart =
            new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    static void addToCart(
            ArrayList<Product> products) {

        System.out.print(
                "Enter Product ID: ");

        int id = sc.nextInt();

        Product selectedProduct = null;

        for (Product product : products) {

            if (product.productId == id) {

                selectedProduct = product;
                break;
            }
        }

        if (selectedProduct == null) {

            System.out.println(
                    "Product not found!");

            return;
        }

        System.out.print(
                "Enter Quantity: ");

        int quantity = sc.nextInt();

        if (quantity <= 0 ||
                quantity > selectedProduct.quantity) {

            System.out.println(
                    "Invalid quantity!");

            return;
        }

        CartItem item =
                new CartItem(
                        selectedProduct,
                        quantity
                );

        cart.add(item);

        System.out.println(
                "Product added to cart!");
    }
}
