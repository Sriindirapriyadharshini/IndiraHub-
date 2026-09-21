public class UpdateProduct {

    public static void update(int id,
                              String name,
                              String author,
                              double price,
                              int quantity,
                              String category,
                              String image) {

        Product product = ProductData.findProduct(id);

        if (product != null) {

            product.setName(name);
            product.setAuthor(author);
            product.setPrice(price);
            product.setQuantity(quantity);
            product.setCategory(category);
            product.setImage(image);
        }
    }
}
