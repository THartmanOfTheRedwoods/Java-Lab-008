public class RecursivePractice {

    public static void main(String[] args) {
        System.out.println(oddSum(19));

        System.out.println("---");
        System.out.println(ack(3, 3));

        System.out.println("---");
        System.out.println(power(6,3));

        System.out.println("---");
        int[] array = {5, 18, 29, 2, 202, 155, 99};
        int lowIndex = 1;
        int highIndex = 5;
        int max = maxInRange(array, lowIndex, highIndex);
        System.out.println("The maximum value within the range is: " + max);

    }

    public static int maxInRange(int[] integers, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return integers[lowIndex];
        }

        // Recursive case: Divide the range into two halves and find the maximum of the maxima
        int midIndex = (lowIndex + highIndex) / 2;
        int maxLeft = maxInRange(integers, lowIndex, midIndex);
        int maxRight = maxInRange(integers, midIndex + 1, highIndex);

        // Compare the maximum values from the left and right halves
        return Math.max(maxLeft, maxRight);
    }

    public static double power(double x, int n) {

        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return Math.pow(x, (n/2)) * Math.pow(x, (n/2));
        } else if (n > 1) {
            return x * Math.pow(x, n - 1);
        }

        return 0;
    }

    public static int ack(int m, int n) {

        if (m == 0) {
            return n + 1;
        }

        if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        }

        if (m > 0 && n > 0) {
            return ack(m - 1, (ack(m, n -1)));
        }

        return 0;

    }

    public static int oddSum(int n) { //positive odd integer
        int sum = 0;

        if (n == 1) {
            return 1;
        }

        System.out.println("n = " + n); // Print n for debugging

        if ((n % 2) == 0) {
            return 0;
        } else {
            sum = n + oddSum(n - 2);
        }

        return sum; //returns the sum of odd integers from 1 to n.

    }

}