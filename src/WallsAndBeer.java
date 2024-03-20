public class WallsAndBeer {

    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + oddSum(n - 2);
        }
    }
    public static int ack(int m, int n){
        if(m==0){
            return n+1;
        }else if( m > 0 & n == 0){
        return ack(m - 1, 1);
        }else {
            return ack(m- 1, ack(m, n -1));
        }

    }
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

        int val1 = maxInRange(arr, lowIndex, midIndex);
        int val2 = maxInRange(arr, midIndex+1, highIndex);

        if (val1 > val2) {
            return val1;
        } else {
            return val2;
        }
    }
    public static void main(String[] args) {
    RecursivePractice recursivePractice = new RecursivePractice();
    recursivePractice.Breakingdown(3);
        System.out.println("====================");
        int n = 1;
        System.out.println("oddSum(" + n + ") = " + oddSum(n));

        System.out.println(ack(2,1));
        System.out.println("====================");
        System.out.println(power(7, 7));
        System.out.println("====================");
        int[] arr = {30, 8, 11, 6, 7, 10, 90, 4};
        int lowIndex = 0;
        int highIndex = arr.length - 1;

        int max = maxInRange(arr, lowIndex, highIndex);
        System.out.println("The maximum value in the array is: " + max);




    }
}
