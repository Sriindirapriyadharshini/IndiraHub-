import java.util.Scanner;

public class SellerDashboard {

    public static void show(User seller) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== SELLER DASHBOARD =====");
            System.out.println("Welcome " + seller.getName());

            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. View Orders");
            System.out.println("6. Logout");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    ViewProducts.display();
                    break;

                case 2:
                    AddProduct.addProduct(seller);
                    break;

                case 3:
                    UpdateProduct.updateProduct(seller);
                    break;

                case 4:
                    DeleteProduct.deleteProduct(seller);
                    break;

                case 5:
                    ViewOrders.allOrders();
                    break;

                case 6:
                    System.out.println("Logged out.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
