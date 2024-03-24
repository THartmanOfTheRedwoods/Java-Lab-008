public class RecursivePractice {

    /** public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return (n % 2 != 1) ? oddSum(n - 1) : oddSum(n - 1) + n;
        }
    }

    public static void main(String[] args) {
    } **/

    /** public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        else if (n == 0) {
            return ack(m - 1, 1);
        }
        else {
            return ack(m - 1, ack(m, n - 1));
        }
    }
    public static void main (String[] args) {
        System.out.println("A(0 ,0) =" + ack(0, 0));
        System.out.println("A(0, 1) =" + ack(0, 1));
        System.out.println("A(1, 0) =" + ack(1, 0));
        System.out.println("A(1, 1) =" + ack(1, 1));
        System.out.println("A(2, 1) =" + ack(2, 1));
        System.out.println("A(2, 2) =" + ack(2, 2));
    } **/

    public static double power(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        else if (n > 0) {
            return x*power(x, n - 1);
        }
        else {
            return 1.0/x * power(1.0/x, -n - 1);
        }
    }

    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return arr[lowIndex];
        }
        int midIndex = (lowIndex + highIndex)/2;

        int end1 = maxInRange(arr, lowIndex, midIndex);
        int end2 = maxInRange(arr, midIndex+1, highIndex);

        if (end1 > end2) {
            return end1;
        }
        else {
            return end2;
        }
    }
    public static void main (String[] agrs) {
        power(0, 0);
        //maxInRange(, 4, 6);

    }
}
