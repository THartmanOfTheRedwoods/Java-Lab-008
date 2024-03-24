public class RecursivePractice {

    public static void main(String[] args) {
        // oddSum method
        int nOdd = 13; // positive odd integer
        int oddSum = oddSum(nOdd);
        System.out.println("Sum of odd integers from 1 to " + nOdd + " is: " + oddSum);

        // ack method
        int mAck = 2;
        int nAck = 3;
        int ackValue = ack(mAck, nAck);
        System.out.println("Ackermann(" + mAck + ", " + nAck + ") = " + ackValue);

        // x^n power method
        double xNum = 2.5;
        int nPower = 4;
        double powerResult = power(xNum, nPower);
        System.out.println(xNum + " raised to the power of " + nPower + " is: " + powerResult);

        // maxInRange method
        int[] array = {5, 8, 3, 12, 7, 56, 4};
        int lowIndex = 1;
        int highIndex = 3;
        int maxInRangeValue = maxInRange(array, lowIndex, highIndex);
        System.out.println("Max value in range [" + lowIndex + ", " + highIndex + "] is: " + maxInRangeValue);
    }

    // calculate sum of odd integers from 1 to n
    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            // System.out.println("Calculating oddSum for n = " + n);
            return n + oddSum(n - 2);
        }
    }

    // compute the Ackermann function
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }

    // calculate x^n
    public static double power(double x, double n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1.0);
        }
    }

    // find maximum value in a range within an array
    public static int maxInRange(int[] array, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            // base case: sole element
            return array[lowIndex];
        } else {
            // break array in halves, calculate sum of each half against each other, continue until one element remains.
            int mid = (lowIndex + highIndex) / 2;
            int maxLeft = maxInRange(array, lowIndex, mid);
            int maxRight = maxInRange(array, mid + 1, highIndex);
            return Math.max(maxLeft, maxRight);
        }
    }
}
