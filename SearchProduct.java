import java.util.Scanner;

public class SearchProduct {

    public static void search() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String keyword = sc.nextLine();

        boolean found = false;

        for (Product product : ProductData.products) {

            if (product.getName()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                System.out.println(product);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }
}
