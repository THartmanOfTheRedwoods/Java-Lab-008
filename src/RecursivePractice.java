public class RecursivePractice {

    public static int oddSum(int n) {
        if (n == 1) {
            System.out.println("Base case reached: n = 1");
            return 1;
        } else {
            System.out.println("Currently processing n = " + n);
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
        } else if (n > 0) {
            return x * power(x, n - 1);
        } else { // for negative n
            return 1 / power(x, -n);
        }
    }

    public static int maxInRange(int[] array, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return array[lowIndex];
        } else {
            int midIndex = (lowIndex + highIndex) / 2;
            int maxLeft = maxInRange(array, lowIndex, midIndex);
            int maxRight = maxInRange(array, midIndex + 1, highIndex);
            return Math.max(maxLeft, maxRight);
        }
    }
    public static void main(String[] args) {
        System.out.println("Task 1: Sum of odd integers from 1 to 9: " + oddSum(9));
        System.out.println("Task 2: Ackermann function A(2, 2): " + ack(2, 2));
        System.out.println("Task 3: Power of 2.0 raised to the power of 3: " + power(2.0, 3));
        int[] testArray = {5, 2, 9, 3, 7};
        System.out.println("Task 4: Maximum value in the range [1, 4]: " + maxInRange(testArray, 1, 4));
    }
}