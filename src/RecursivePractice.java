public class RecursivePractice {

    public static void main(String[] args) {
        int[] array = {3, 7, 2, 8, 5, 9};
        System.out.println(oddSum(7));
        System.out.println(ack(3, 3));
        System.out.println(power(5,2));
        System.out.println(maxInRange(array,1,4));
    }

    public static int oddSum(int n) {
        int sum = 0;
        if (n % 2 == 0 || n < 0)
        {
            System.out.println("The number is either incorrectly even or negative.");
        } else {
            if (n == 1) {
                sum += n;
                return sum;
            }
            else {
                sum += (n + oddSum(n - 2));
            }
        }
        return sum;
    }

    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        } else {
            System.out.println("Huh?");
            return 0;
        }
    }

    public static double power(double x, int n) {
        if (n < 0) {
            System.out.println("Doesn't take negative powers into account.");
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return Math.pow(power(x, n / 2), 2);
        }
        else {
            return x * power(x, n - 1);
        }
    }

    public static int maxInRange(int[] array, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            return array[lowIndex];
        }

        int midIndex = (lowIndex + highIndex) / 2;
        int maxLeft = maxInRange(array, lowIndex, midIndex);
        int maxRight = maxInRange(array, midIndex + 1, highIndex);

        if (maxLeft >= maxRight) {
            return maxLeft;
        } else {
            return maxRight;
        }
    }
}
