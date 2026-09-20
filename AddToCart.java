import java.util.Scanner;

public class AddToCart {

    public static void add(Cart cart) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        Product product = ProductData.findById(id);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Invalid quantity.");
            return;
        }

        if (quantity > product.getQuantity()) {
            System.out.println("Not enough stock.");
            return;
        }

        cart.addItem(product, quantity);

        System.out.println("Product added to cart.");
    }
}
