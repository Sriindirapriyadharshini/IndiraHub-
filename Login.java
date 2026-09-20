import java.util.Scanner;

public class Login {

    public static User login() {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== INDIRAHUB LOGIN =====");

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        User user = UserData.login(email, password);

        if (user == null) {
            System.out.println("Invalid email or password.");
            return null;
        }

        System.out.println("Login successful.");
        System.out.println("Welcome " + user.getName());

        return user;
    }
}
