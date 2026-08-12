import java.util.ArrayList;
import java.util.Scanner;

class Product {

    int productId;
    String productName;
    String sellerName;
    double price;
    int quantity;

    Product(int productId, String productName,
            String sellerName, double price,
            int quantity) {

        this.productId = productId;
        this.productName = productName;
        this.sellerName = sellerName;
        this.price = price;
        this.quantity = quantity;
    }
}

public class AddProduct {

    static ArrayList<Product> products =
            new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    static void addProduct() {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Seller Name: ");
        String seller = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        Product product =
                new Product(
                        id,
                        name,
                        seller,
                        price,
                        quantity
                );

        products.add(product);

        System.out.println(
                "Product added successfully!");
    }

    public static void main(String[] args) {

        addProduct();
    }
}
