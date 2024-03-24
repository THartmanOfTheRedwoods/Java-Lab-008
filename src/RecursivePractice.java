public class RecursivePractice {

    public static void main(String[] args) {
        // Here I'm testing numbers for oddSum
        System.out.println("Sum of odd numbers from 1 to 5: " + oddSum(5));
        System.out.println("Sum of odd numbers from 1 to 9: " + oddSum(9));

        // Here I'm looking for the Ackermann function.  I had to spend some time reviewing this one.
        System.out.println("A(2, 3) = " + ack(2, 3));

        // Here I'm looking for power
        System.out.println("2^4 = " + power(2, 4));
        System.out.println("3^5 = " + power(3, 5));

        // Looking for maxInRange
        int[] arr = {10, 5, 8, 20, 15};
        System.out.println("Maximum in range [1, 3]: " + maxInRange(arr, 1, 3));
        System.out.println("Maximum in range [0, 4]: " + maxInRange(arr, 0, 4));
    }

    // Here is the recursive method, for calculating the sum of all the odd integers, from 1 to n
    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            // Here I'm adding n to the sum of odd integers from 1 to n-2, effectively skipping even numbers
            return n + oddSum(n - 2);
        }
    }

    // Here is the recursive method to calculate the Ackermann function
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }

    // Here I'm using the recursive method for calculating x^n
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            if (n % 2 == 0) {
                return power(x * x, n / 2);
            } else {
                return x * power(x, n - 1);
            }
        } else {
            return 1.0 / power(x, -n);
        }
    }

    // Here is the recursive method for finding the maximum value in a range of an array
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
