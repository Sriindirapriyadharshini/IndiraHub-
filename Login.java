import java.util.Scanner;

class Login {

    static Scanner sc = new Scanner(System.in);

    static boolean login() {

        String correctUsername = "indira";
        String correctPassword = "1234";

        System.out.println("\n========== INDIRAHUB LOGIN ==========");

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
            return false;
        }
    }

    public static void main(String[] args) {

        login();
    }
}
