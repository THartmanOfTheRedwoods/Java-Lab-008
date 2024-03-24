public class RecursivePractice {

    public static void main(String[] args) {
        // Test ddSum method
        int n = 5; // Example odd number
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + oddSum(n));

        // Testing ack method
        int m = 2;
        int nn = 3;
        System.out.println("Ackermann function for (" + m + ", " + nn + "): " + ack(m, nn));

        // Test power method
        double x = 2.0;
        int p = 3;
        System.out.println("Power of " + x + " to the " + p + "th: " + power(x, p));

        // Test maxInRange method
        int[] arr = {5, 2, 8, 10, 3}; // Example array
        int lowIndex = 1;
        int highIndex = 3;
        System.out.println("Max value in range [" + lowIndex + ", " + highIndex + "]: " + maxInRange(arr, lowIndex, highIndex));
    }

    // Finds the sum of odd numbers from 1 to n constantly
    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + oddSum(n - 2);
        }
    }

    // Computes the Ackermann function
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }

    // Calculates power
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            double temp = power(x, n / 2);
            return temp * temp;
        } else {
            return x * power(x, n - 1);
        }
    }

    // Finds maximum value in a range within an array recursively
    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return arr[lowIndex];
        } else {
            int mid = (lowIndex + highIndex) / 2;
            int max1 = maxInRange(arr, lowIndex, mid);
            int max2 = maxInRange(arr, mid + 1, highIndex);
            return Math.max(max1, max2);
        }
    }
}
