import java.util.Arrays;
import java.util.Scanner;

public class ECommerceSearch {

    // Binary search method
    public static int binarySearch(String[] products, String key) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int result = key.compareToIgnoreCase(products[mid]);

            if (result == 0)
                return mid;
            if (result > 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Sample product list
        String[] products = {
            "Shoes", "Mobile", "Laptop", "Charger", "Headphones", "Backpack", "Keyboard"
        };

        // Sort products alphabetically
        Arrays.sort(products);

        // Show sorted list
        System.out.println("Available Products (Sorted):");
        for (String p : products) {
            System.out.println("- " + p);
        }

        // Search
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter product to search: ");
        String searchItem = sc.nextLine();

        int index = binarySearch(products, searchItem);

        if (index != -1) {
            System.out.println("Product '" + products[index] + "' found at index " + index + ".");
        } else {
            System.out.println("Product not found.");
        }
    }
}
