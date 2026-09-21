public class ViewProducts {

    public static void showProducts() {

        for (Product product : ProductData.products) {

            System.out.println(
                    product.getId() + " - " +
                    product.getName() + " - ₹" +
                    product.getPrice()
            );
        }
    }
}
