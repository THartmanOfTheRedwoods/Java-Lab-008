public class RecursivePractice {

    public static void main(String[] args) {
        //oddSum
        testOddSum();
        //Ackermann
        testAckermann();
        //The power
        Power();
        //maxInRange
        testMaxInRange();
    }
    //Part One --------

    //oddSum
    public static void testOddSum() {
        //n is odd
        int n = 7;
        System.out.println("Sum of odd integers from 1 to " + n + " is: " + oddSum(n));
    }

    //Find the value of n
    public static int oddSum(int n) {
        System.out.println("Current value of n: " + n);

        // Base case: Debug
        if (n == 1) {
            return 1;
        } else {
            /* If n is odd, fix it to fit the standards
            * If n is even, skip it and move to n-1 */
            return n % 2 == 1 ? n + oddSum(n - 2) : oddSum(n - 1);
        }
    }

    //Part Two --------

    public static void testAckermann() {
        //Ackermann function
        System.out.println("A(1, 1) = " + ackermann(1, 1));
        System.out.println("A(2, 2) = " + ackermann(2, 2));
        System.out.println("A(3, 3) = " + ackermann(3, 3));
    }

    //Using the Ackermann function recursively
    public static int ackermann(int m, int n) {
        //Base cases
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else {
            //Recursive case
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    //Part Three --------

    //The Power
    public static void Power() {
        //
        System.out.println("2^3 = " + power(2, 3));
        System.out.println("5^0 = " + power(5, 0));
        System.out.println("3^-2 = " + power(3, -2));
    }

    //Using the Power Recursively
    public static double power(double x, int n) {
        //If n is 0, return 1
        if (n == 0) {
            return 1;
        }
        //When negative: raise x to |n|
        else if (n < 0) {
            return 1 / power(x, -n);
        }
        //When even: (x^(n/2))^2
        else if (n % 2 == 0) {
            double temp = power(x, n / 2);
            return temp * temp;
        }
        //If n is odd: x * x^(n-1)
        else {
            return x * power(x, n - 1);
        }
    }

    //Part Four --------

    //maxInRange
    public static void testMaxInRange() {
        int[] arr = {3, 6, 8, 2, 9, 1};
        int lowIndex = 1;
        int highIndex = 4;
        System.out.println("Maximum value in range [" + lowIndex + ", " + highIndex + "] is: " + maxInRange(arr, lowIndex, highIndex));
    }

    //
    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        //Base Case mentioning: return when only one element
        if (lowIndex == highIndex) {
            return arr[lowIndex];
        } else {
            //Find the Middle: the Lowest to the Highest / 2
            int midIndex = (lowIndex + highIndex) / 2;
            //Maximum in the left half
            int maxLeft = maxInRange(arr, lowIndex, midIndex);
            //Maximum in the right half
            int maxRight = maxInRange(arr, midIndex + 1, highIndex);

            //Maximum of the right & left
            return Math.max(maxLeft, maxRight);
        }
    }
}