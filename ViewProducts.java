public class ViewProducts {

    public static void display() {

        System.out.println("\n===== ALL PRODUCTS =====");

        if (ProductData.products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product product : ProductData.products) {
            System.out.println(product);
        }
    }
}
