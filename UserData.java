import java.util.ArrayList;

public class UserData {

    public static ArrayList<User> users = new ArrayList<>();

    private static int nextId = 1;

    static {
        users.add(new User(
            nextId++,
            "Owner",
            "owner@indirahub.com",
            "owner123",
            "OWNER"
        ));

        users.add(new User(
            nextId++,
            "Seller",
            "seller@indirahub.com",
            "seller123",
            "SELLER"
        ));

        users.add(new User(
            nextId++,
            "Customer",
            "customer@indirahub.com",
            "customer123",
            "CUSTOMER"
        ));
    }

    public static User register(
            String name,
            String email,
            String password,
            String role) {

        User user = new User(
            nextId++,
            name,
            email,
            password,
            role
        );

        users.add(user);

        return user;
    }

    public static User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }

        return null;
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
}
