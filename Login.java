import java.util.Scanner;

class Login {

    static Scanner sc = new Scanner(System.in);

    // User details
    static String userUsername;
    static String userPassword;

    // Seller details
    static String sellerUsername;
    static String sellerPassword;

    // Register User
    static void registerUser() {

        System.out.println("\n========== USER REGISTRATION ==========");

        System.out.print("Create Username: ");
        userUsername = sc.nextLine();

        System.out.print("Create Password: ");
        userPassword = sc.nextLine();

        System.out.println("User Registration Successful!");
    }

    // Register Seller
    static void registerSeller() {

        System.out.println("\n========== SELLER REGISTRATION ==========");

        System.out.print("Create Username: ");
        sellerUsername = sc.nextLine();

        System.out.print("Create Password: ");
        sellerPassword = sc.nextLine();

        System.out.println("Seller Registration Successful!");
    }

    // Login
    static boolean login(String role) {

        String correctUsername;
        String correctPassword;

        if (role.equalsIgnoreCase("user")) {
            correctUsername = userUsername;
            correctPassword = userPassword;
        } else {
            correctUsername = sellerUsername;
            correctPassword = sellerPassword;
        }

        System.out.println(
            "\n========== INDIRAHUB "
            + role.toUpperCase()
            + " LOGIN =========="
        );

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername)
                    && password.equals(correctPassword)) {

                System.out.println("Login Successful!");
                return true;

            } else {

                System.out.println("Invalid Username or Password!");
                System.out.println(
                    "Attempts remaining: " + (3 - attempt)
                );
            }
        }

        System.out.println("Account locked. Too many failed attempts.");
        return false;
    }

    public static void main(String[] args) {

        System.out.println("\n========== INDIRAHUB ==========");
        System.out.println("1. Register User");
        System.out.println("2. Register Seller");
        System.out.println("3. User Login");
        System.out.println("4. Seller Login");
        System.out.println("5. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                registerUser();
                break;

            case 2:
                registerSeller();
                break;

            case 3:
                if (userUsername == null) {
                    System.out.println("No user registered yet.");
                } else if (login("User")) {
                    System.out.println("Welcome to IndiraHub User!");
                }
                break;

            case 4:
                if (sellerUsername == null) {
                    System.out.println("No seller registered yet.");
                } else if (login("Seller")) {
                    System.out.println("Welcome to IndiraHub Seller!");
                }
                break;

            case 5:
                System.out.println("Thank you for using IndiraHub!");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
            
