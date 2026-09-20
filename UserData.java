import java.util.ArrayList;

public class UserData {

    private static ArrayList<User> users = new ArrayList<>();

    static {

        users.add(new User(
                "Indira",
                "customer@indirahub.com",
                "1234",
                "CUSTOMER"
        ));

        users.add(new User(
                "Seller One",
                "seller@indirahub.com",
                "1234",
                "SELLER"
        ));

        users.add(new User(
                "IndiraHub Owner",
                "owner@indirahub.com",
                "admin123",
                "OWNER"
        ));
    }

    public static User login(String email, String password) {

        for (User user : users) {

            if (user.getEmail().equalsIgnoreCase(email)
                    && user.getPassword().equals(password)) {

                return user;
            }
        }

        return null;
    }

    public static boolean registerCustomer(User user) {

        for (User u : users) {

            if (u.getEmail().equalsIgnoreCase(user.getEmail())) {
                return false;
            }
        }

        users.add(user);

        return true;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void displayUsers() {

        System.out.println("\n========== ALL USERS ==========");

        for (User user : users) {

            System.out.println(
                    user.getName()
                    + " | "
                    + user.getEmail()
                    + " | "
                    + user.getRole()
            );
        }
    }
}
