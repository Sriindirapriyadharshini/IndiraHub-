import java.util.Scanner;

public class OwnerDashboard {

    public static void show(User owner) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== OWNER DASHBOARD =====");

            System.out.println("Welcome " + owner.getName());

            System.out.println("1. View Users");
            System.out.println("2. View Products");
            System.out.println("3. View Orders");
            System.out.println("4. Logout");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    ViewUsers.display();
                    break;

                case 2:
                    ViewProducts.display();
                    break;

                case 3:
                    ViewOrders.allOrders();
                    break;

                case 4:
                    System.out.println("Logged out.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
