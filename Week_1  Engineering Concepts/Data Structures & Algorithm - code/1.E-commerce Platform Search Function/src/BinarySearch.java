import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static Product searchByName(Product[] products, String name) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = products[mid].getProductName().compareToIgnoreCase(name);
            if (compare == 0) {
                return products[mid];
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Helper method to sort by product name
    public static void sortProductsByName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
    }
}