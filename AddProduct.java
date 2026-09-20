import java.util.Scanner;

public class AddProduct {

    public static void addProduct(User seller) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== ADD PRODUCT =====");

        System.out.print("Product name: ");
        String name = sc.nextLine();

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = ProductData.addProduct(
            name,
            category,
            price,
            quantity,
            seller.getId()
        );

        System.out.println("Product added successfully.");
        System.out.println(product);
    }
}
