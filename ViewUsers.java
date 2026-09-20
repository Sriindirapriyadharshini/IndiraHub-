public class ViewUsers {

    public static void display() {

        System.out.println("\n===== ALL USERS =====");

        for (User user : UserData.users) {
            System.out.println(user);
        }
    }
}
