import java.util.ArrayList;

public class ProductData {

    public static ArrayList<Product> products = new ArrayList<>();

    static {

        products.add(new Product(
                1,
                "The Enchanted Library",
                "A. Morgan",
                499,
                10,
                "Fantasy",
                "assets/book1.jpg"
        ));

        products.add(new Product(
                2,
                "The Last Alchemist",
                "R. Blake",
                599,
                8,
                "Adventure",
                "assets/book2.jpg"
        ));

        products.add(new Product(
                3,
                "Whispers of the Moon",
                "L. Carter",
                399,
                15,
                "Mystery",
                "assets/book3.jpg"
        ));

        products.add(new Product(
                4,
                "The Hidden Kingdom",
                "M. Stone",
                699,
                6,
                "Fantasy",
                "assets/book4.jpg"
        ));
    }

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static Product findProduct(int id) {

        for (Product product : products) {

            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    public static void deleteProduct(int id) {

        Product product = findProduct(id);

        if (product != null) {
            products.remove(product);
        }
    }
}
