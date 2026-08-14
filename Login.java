import java.util.Scanner;

class Login {

    static Scanner sc = new Scanner(System.in);

    static boolean login(String role) {

        String correctUsername;
        String correctPassword;

        if (role.equalsIgnoreCase("user")) {
            correctUsername = "Indira";
            correctPassword = "1234";
        } else {
            correctUsername = "Seller";
            correctPassword = "5678";
        }

        System.out.println("\n========== INDIRAHUB " + role.toUpperCase() + " LOGIN ==========");

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
                System.out.println("Attempts remaining: " + (3 - attempt));
            }
        }

        System.out.println("Account locked. Too many failed attempts.");
        return false;
    }

    public static void main(String[] args) {

        System.out.println("\n========== INDIRAHUB ==========");
        System.out.println("1. User Login");
        System.out.println("2. Seller Login");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            if (login("User")) {
                System.out.println("Welcome to IndiraHub User!");
            } else {
                System.out.println("Please try again later.");
            }

        } else if (choice == 2) {

            if (login("Seller")) {
                System.out.println("Welcome to IndiraHub Seller!");
            } else {
                System.out.println("Please try again later.");
            }

        } else {
            System.out.println("Invalid choice!");
        }
    }
}
