import java.util.ArrayList;

public class ProductData {

    public static ArrayList<Product> products = new ArrayList<>();

    private static int nextId = 1;

    static {
        products.add(new Product(
            nextId++, "Laptop", "Electronics",
            55000, 10, 2
        ));

        products.add(new Product(
            nextId++, "Mouse", "Electronics",
            700, 25, 2
        ));

        products.add(new Product(
            nextId++, "Java Book", "Books",
            500, 20, 2
        ));
    }

    public static Product addProduct(
            String name,
            String category,
            double price,
            int quantity,
            int sellerId) {

        Product product = new Product(
            nextId++,
            name,
            category,
            price,
            quantity,
            sellerId
        );

        products.add(product);

        return product;
    }

    public static Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public static void removeProduct(int id) {
        products.removeIf(product ->
            product.getId() == id
        );
    }
}
