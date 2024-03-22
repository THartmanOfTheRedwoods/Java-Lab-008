public class RecursivePractice {

    public static int oddSum(int n) {
        //when n is 1, return 1
        if (n == 1) {
            return 1;
        }
        //value n for debugging
        System.out.println("n: " + n);
        //recursive call w/ n-2
        return n + oddSum(n - 2);
    }
    //ackermann function
    public static int ack(int m, int n) {
        //base cases
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }

    //compute x^n
    public static double power(double x, int n) {
        //when n is 0 return 1
        if (n == 0) {
            return 1;

        }
        //recursive case
        if (n > 0) {
            if (n % 2 == 0) {
                double temp = power(x, n / 2);
                return temp * temp;
            } else {
                return x * power(x, n - 1);
            }

        } else {
            return 1 / power(x, -n);
        }
    }
    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        if(lowIndex == highIndex) {
            return arr[lowIndex];
        }
        int mid = (lowIndex + highIndex) / 2;
        int maxLeft = maxInRange(arr, lowIndex, mid);
        int maxRight = maxInRange(arr, mid + 1, highIndex);

        return Math.max(maxLeft, maxRight);
    }

    public static void main(String[] args) {
        //oddSum
        System.out.println("Odd Sum: " + oddSum(7)); //output 16
        //ack
        System.out.println("Ackermann Function: " + ack(2, 2)); //output 7
        //power
        System.out.println("Power: " + power(2, 3)); //output 8.0
        //maxInRange
        int[] arr = {3, 7, 2, 8, 5};
        System.out.println("Max in Range: " + maxInRange(arr, 1, 3)); //output 8
    }



}