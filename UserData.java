import java.util.ArrayList;

public class UserData {

    public static ArrayList<User> users = new ArrayList<>();

    static {

        users.add(new User(
                1,
                "Owner",
                "owner@indirahub.com",
                "owner123",
                "OWNER"
        ));

        users.add(new User(
                2,
                "Seller",
                "seller@indirahub.com",
                "seller123",
                "SELLER"
        ));
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static User login(String email, String password) {

        for (User user : users) {

            if (user.getEmail().equals(email)
                    && user.getPassword().equals(password)) {

                return user;
            }
        }

        return null;
    }
}
