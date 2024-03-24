public class RecursivePractice {

    public static void main(String[] args) {
        System.out.println("Sum of odd numbers from 1 to 9: " + oddSum(9));
        System.out.println("Ackermann(2, 3): " + ack(2, 3));
        System.out.println("2^5: " + power(2, 5));
        int[] arr = {3, 7, 2, 9, 1};
        System.out.println("Max in range [1, 3]: " + maxInRange(arr, 1, 3));
    }

    public static int oddSum(int n) {
        return (n == 1) ? 1 : n + oddSum(n - 2);
    }

    public static int ack(int m, int n) {
        return (m == 0) ? n + 1 : (m > 0 && n == 0) ? ack(m - 1, 1) : ack(m - 1, ack(m, n - 1));
    }

    public static double power(double x, int n) {
        return (n == 0) ? 1 : (n < 0) ? 1 / power(x, -n) : (n % 2 == 0) ? power(x * x, n / 2) : x * power(x, n - 1);
    }

    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        return (lowIndex == highIndex) ? arr[lowIndex] : Math.max(maxInRange(arr, lowIndex, (lowIndex + highIndex) / 2), maxInRange(arr, (lowIndex + highIndex) / 2 + 1, highIndex));
    }
}
