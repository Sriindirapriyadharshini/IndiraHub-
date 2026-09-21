public class AddToCart {

    public static void add(Cart cart, int productId) {

        Product product = ProductData.findProduct(productId);

        if (product != null && product.getQuantity() > 0) {

            cart.addProduct(product);
        }
    }
}
