public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;
    private int sellerId;

    public Product(int id, String name, String category,
                   double price, int quantity, int sellerId) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.sellerId = sellerId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return id + " | " + name + " | " + category +
               " | Rs." + price + " | Stock: " + quantity;
    }
}
