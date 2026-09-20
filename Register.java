import java.util.Scanner;

public class Register {

    public static void register() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== REGISTER =====");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        if (UserData.findByEmail(email) != null) {
            System.out.println("Email already exists.");
            return;
        }

        System.out.print("Password: ");
        String password = sc.nextLine();

        System.out.println("1. Customer");
        System.out.println("2. Seller");

        System.out.print("Choose role: ");
        int choice = sc.nextInt();

        String role;

        if (choice == 2) {
            role = "SELLER";
        } else {
            role = "CUSTOMER";
        }

        User user = UserData.register(
            name,
            email,
            password,
            role
        );

        System.out.println("Registration successful.");
        System.out.println("User ID: " + user.getId());
    }
}
