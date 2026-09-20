import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n==============================");
            System.out.println("       WELCOME TO INDIRAHUB");
            System.out.println("==============================");

            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    User user = Login.login();

                    if (user != null) {

                        if (user.getRole().equals("CUSTOMER")) {

                            CustomerDashboard.show(user);

                        } else if (user.getRole().equals("SELLER")) {

                            SellerDashboard.show(user);

                        } else if (user.getRole().equals("OWNER")) {

                            OwnerDashboard.show(user);
                        }
                    }

                    break;

                case 2:

                    Register.register();
                    break;

                case 3:

                    System.out.println("Thank you for using IndiraHub.");
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}
