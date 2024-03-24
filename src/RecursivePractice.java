public class RecursivePractice {

    public static int oddSum(int n){
        if (n == 1){
            return 1;
        } else {
            return n + oddSum(n - 2);
        }
    }

    public static int ack(int m, int n){
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0){
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n -1));
        }
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n -1);
        }
    }

    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return arr[lowIndex];
        } else {
            int middleIndex = (lowIndex + highIndex) / 2;
            int max1 = maxInRange(arr, lowIndex,middleIndex);
            int max2 = maxInRange(arr, middleIndex + 1, highIndex);
            return Math.max(max1, max2);
        }
    }


    public static void main(String[] args) {
        // Test oddSum
        System.out.println(oddSum(9)); // 25

        // Test ack
        System.out.println(ack(3,3)); // 61

        // Test power
        System.out.println(power(12.0, 3)); // 1728.0

        // Test maxInRange
        int[] arr = {22, 34, 12, 7, 9, 11, 3, 47, 84, 23, 1};
        System.out.println(maxInRange(arr, 1, 9)); // 84
        System.out.println(maxInRange(arr, 0, 4)); // 34
        System.out.println(maxInRange(arr, 3,3)); // 7

    }
}