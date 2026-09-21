public class Login {

    public static User loginUser(String email, String password) {

        return UserData.login(email, password);
    }
}
