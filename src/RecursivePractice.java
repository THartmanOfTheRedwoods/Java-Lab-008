public class RecursivePractice {

    public static int oddSum(int n) {

        if (n % 2 == 0) {
            System.out.println("n is an even number");
            return n;
        }
        if (n == 1) {
            System.out.println("done");
            return n;
        }
        return n + oddSum(n - 2);
    }

    public static int ack(int n, int m) {

        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else
            return ack(m - 1, ack(m, n - 1));
    }

    public static double power(double x, int n) {

        if (n == 0) {
            return 1.0;
        }
        if (n == 1) {
            return x;
        }
        if (n == 2) {
            return x * x;
        } else {
            return x * (power(x, n - 1));
        }

    }

    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {

        if (lowIndex == highIndex) {
            return arr[lowIndex];
        } else {

            int midIndex = (lowIndex + highIndex) / 2;


            int maxLeft = maxInRange(arr, lowIndex, midIndex);
            int maxRight = maxInRange(arr, midIndex + 1, highIndex);


            return Math.max(maxLeft, maxRight);
        }
    }


    public static void main(String[] args) {

        System.out.println(oddSum(7));

        System.out.println();

        System.out.println("A(0,0) = " + ack(0, 0));

        System.out.println();

        System.out.println(power(5, 3));

        System.out.println();

        int[] myArray = {20,50,134,3,17,375};
        int lowIndex = 0;
        int highIndex = myArray.length - 1;

        int result = maxInRange(myArray, lowIndex, highIndex);
        System.out.println("Maximum value in the specified range: " + result);

    }
}