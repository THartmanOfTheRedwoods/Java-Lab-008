/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @date 3-23-24
 * @version 1.0
 */
public class RecursivePractice {

    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
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

    public static void main(String[] args) {
        int[] arr = {5, 7, 9, 3, 6};
        System.out.println("The odd sum of 9 using recursion is: " + oddSum(9));
        System.out.println("Ack function of 2 and 3 is : " + ack(2, 3));
        System.out.println("Power function of 1.5 to the 4th power is: " + power(1.5, 4));
        System.out.println("The max in range of array {5, 7, 9, 3, 6} is: " + maxInRange(arr, 1, arr.length - 2));
    }
}