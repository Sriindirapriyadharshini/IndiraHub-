public class AddProduct {

    public static void add(String name,
                           String author,
                           double price,
                           int quantity,
                           String category,
                           String image) {

        int id = ProductData.products.size() + 1;

        Product product = new Product(
                id,
                name,
                author,
                price,
                quantity,
                category,
                image
        );

        ProductData.addProduct(product);
    }
}
