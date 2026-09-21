public class ViewUsers {

    public static void showUsers() {

        for (User user : UserData.users) {

            System.out.println(
                    user.getName() +
                    " | " +
                    user.getEmail() +
                    " | " +
                    user.getRole()
            );
        }
    }
}
