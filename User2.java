public class User {
    private String name;
    private String email;
    private String password;
    private String role;
    private Cart cart;

    public User(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public Cart getCart() {
        return cart;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
