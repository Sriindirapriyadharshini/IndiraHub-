public class Register {

    public static User registerUser(String name,
                                    String email,
                                    String password) {

        int id = UserData.users.size() + 1;

        User user = new User(
                id,
                name,
                email,
                password,
                "CUSTOMER"
        );

        UserData.addUser(user);

        return user;
    }
}
