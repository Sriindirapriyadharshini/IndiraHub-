import java.util.Scanner;

public class UpdateProduct {

    public static void updateProduct(User seller) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        Product product = ProductData.findById(id);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        if (product.getSellerId() != seller.getId()) {
            System.out.println("You cannot update this product.");
            return;
        }

        System.out.print("New name: ");
        String name = sc.nextLine();

        System.out.print("New category: ");
        String category = sc.nextLine();

        System.out.print("New price: ");
        double price = sc.nextDouble();

        System.out.print("New quantity: ");
        int quantity = sc.nextInt();

        product.setName(name);
        product.setCategory(category);
        product.setPrice(price);
        product.setQuantity(quantity);

        System.out.println("Product updated successfully.");
    }
}
