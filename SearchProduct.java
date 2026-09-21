import java.util.ArrayList;

public class SearchProduct {

    public static ArrayList<Product> search(String keyword) {

        ArrayList<Product> result = new ArrayList<>();

        for (Product product : ProductData.products) {

            if (product.getName()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())
                    ||
                product.getAuthor()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                result.add(product);
            }
        }

        return result;
    }
}
