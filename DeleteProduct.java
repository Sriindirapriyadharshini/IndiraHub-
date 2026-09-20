import java.util.Scanner;

public class DeleteProduct {

    public static void deleteProduct(User seller) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int id = sc.nextInt();

        Product product = ProductData.findById(id);

        if (product == null) {
            System.out.println("Product not found.");
            return;
        }

        if (product.getSellerId() != seller.getId()) {
            System.out.println("You cannot delete this product.");
            return;
        }

        ProductData.removeProduct(id);

        System.out.println("Product deleted successfully.");
    }
}
