import java.util.ArrayList;
import java.util.Scanner;

class SearchProduct {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Product> products =
            new ArrayList<>();

    static void searchProduct() {

        sc.nextLine();

        System.out.print(
                "Enter Product Name: ");

        String name = sc.nextLine();

        boolean found = false;

        for (Product product : products) {

            if (product.productName
                    .toLowerCase()
                    .contains(name.toLowerCase())) {

                System.out.println(
                        "\nProduct ID : " +
                        product.productId);

                System.out.println(
                        "Product : " +
                        product.productName);

                System.out.println(
                        "Price : ₹" +
                        product.price);

                found = true;
            }
        }

        if (!found) {

            System.out.println(
                    "Product not found!");
        }
    }
}
