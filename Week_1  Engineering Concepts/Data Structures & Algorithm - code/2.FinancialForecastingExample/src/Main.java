

public class Main {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case
        if (years == 0) {
            return initialValue;
        }

        // Recursive case
        return (1 + growthRate) * calculateFutureValue(initialValue, growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialValue = 10000.0;   // Starting value
        double growthRate = 0.05;        // 5% annual growth
        int years = 10;

        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);
    }
}
