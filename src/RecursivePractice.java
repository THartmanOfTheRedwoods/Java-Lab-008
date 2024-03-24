public class RecursivePractice {

    public static int oddSum(int n){
        if (n == 1) {
            return 1;
        } else {
            //System.out.println("")
            return n + oddSum(n -2);
        }
    }

    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0){
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }

    public static double power(double x, int n){
        if (n == 0) {
            return 1;
        } else {
            return x * (Math.pow(x, n-1));
        }
    }

    /**
    public static int maxingRange(int[] array, int lowIndex, int highIndex){
        if (lowIndex == highIndex) {
            return array[lowIndex];
        } else {
            return;
        }

    }
*/

    public static void main(String[] args) {

        int n = 2;
        double x = 4.0;
        System.out.println(power(x, n));
    }
}