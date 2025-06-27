public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1, "Shoes", "Footwear"),
                new Product(2, "Laptop", "Electronics"),
                new Product(3, "Watch", "Accessories"),
                new Product(4, "Phone", "Electronics"),
                new Product(5, "T-shirt", "Clothing")
        };

        System.out.println("🔍 Linear Search:");
        Product found1 = LinearSearch.searchByName(products, "Phone");
        System.out.println(found1 != null ? "Found: " + found1 : "Not Found");

        System.out.println("\n🔍 Binary Search:");
        BinarySearch.sortProductsByName(products);  // sort before binary search
        Product found2 = BinarySearch.searchByName(products, "Phone");
        System.out.println(found2 != null ? "Found: " + found2 : "Not Found");
    }
}