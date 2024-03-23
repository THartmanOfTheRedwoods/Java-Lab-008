import java.util.Scanner;
public class RecursivePractice {

    public static int calculateOddSum(int targetNumber) {
        if (targetNumber == 1) {
            return 1;
        }
        if (targetNumber % 2 == 0) {
            return calculateOddSum(targetNumber - 1);
        } else {
            return targetNumber + calculateOddSum(targetNumber - 2);
        }
    }

    public static int computeAckermann(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (m > 0 && n == 0) {
            return computeAckermann(m - 1, 1);
        }
        return computeAckermann(m - 1, computeAckermann(m, n - 1));
    }

    public static double calculatePower(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * calculatePower(base, exponent - 1);
        } else {
            return 1 / (base * calculatePower(base, -exponent - 1));
        }
    }

    public static int findMaxInRange(int[] array, int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            return array[startIndex];
        } else {
            int midIndex = (startIndex + endIndex) / 2;
            int maxLeft = findMaxInRange(array, startIndex, midIndex);
            int maxRight = findMaxInRange(array, midIndex + 1, endIndex);
            return Math.max(maxLeft, maxRight);
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum of odd integers from 1 to 7: " + calculateOddSum(7));

        System.out.println("Ackermann function A(2, 1): " + computeAckermann(2, 1));

        System.out.println("2^3 = " + calculatePower(2, 3));

        int[] testArray = {3, 7, 2, 8, 10, 5};

        System.out.println("Maximum value in the range [1, 4]: " + findMaxInRange(testArray, 1, 4));
    }
}