// Written by: Austin Barnett
// Date: 3/23/2024
// Version 1.0

public class RecursivePractice {

    public static void main(String[] args) {
    }
    public static int oddSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + oddSum(n - 2);
        }
    }
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return arr[lowIndex];
        } else {
            int midIndex = (lowIndex + highIndex) / 2;
            int max1 = maxInRange(arr, lowIndex, midIndex);
            int max2 = maxInRange(arr, midIndex + 1, highIndex);
            return Math.max(max1, max2);
        }
    }
}
