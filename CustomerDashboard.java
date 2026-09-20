import java.util.Scanner;

public class CustomerDashboard {

    public static void show(User customer) {

        Scanner sc = new Scanner(System.in);

        Cart cart = new Cart();

        while (true) {

            System.out.println("\n===== CUSTOMER DASHBOARD =====");
            System.out.println("Welcome " + customer.getName());

            System.out.println("1. View Products");
            System.out.println("2. Search Product");
            System.out.println("3. Add To Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. View Orders");
            System.out.println("7. Logout");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    ViewProducts.display();
                    break;

                case 2:
                    SearchProduct.search();
                    break;

                case 3:
                    AddToCart.add(cart);
                    break;

                case 4:
                    cart.displayCart();
                    break;

                case 5:
                    Checkout.checkout(customer, cart);
                    break;

                case 6:
                    ViewOrders.customerOrders(customer);
                    break;

                case 7:
                    System.out.println("Logged out.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
