import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

            new Product(103, "Shoes", "Footwear"),
            new Product(101, "Laptop", "Electronics"),
            new Product(105, "Watch", "Accessories"),
            new Product(104, "Phone", "Electronics"),
            new Product(102, "Bag", "Fashion")
        };

        System.out.println("Linear Search");

        Product result1 = SearchAlgorithms.linearSearch(products, "Phone");

        if (result1 != null) {
            result1.display();
        } else {
            System.out.println("Product not found");
        }

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\nBinary Search");

        Product result2 = SearchAlgorithms.binarySearch(products, "Phone");

        if (result2 != null) {
            result2.display();
        } else {
            System.out.println("Product not found");
        }
    }
}