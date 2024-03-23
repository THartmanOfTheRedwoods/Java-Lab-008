public class RecursivePractice {

    public static int oddSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return oddSum(n-2) + n;
        }

        public static int ack(int m, int n) {
            if (m == 0) {
                return n + 1;
            }
            else if (m > 0 && n == 0) {
                return ack(m - 1, 1);
            } else {
                return ack(m - 1, ack(m, n -1));
            }
            public static void main(String[] args) {
                System.out.println("ack(1, 1) = " + ack(1, 1));
                System.out.println("ack(2, 2) = " + ack(2, 2));
            }
        }

        public static double power(double x, int n) {
            if (n == 0) {
                return 1;
            } else if (n < 0) {
                return 1 / power(x, -n);
            } else {
                if ( n % 2 == 0) {
                    return power(x, n / 2) * power(x, n / 2);
                } else {
                    return x * power(x, n - 1);
                }
            }
        }

        public static int maxInRange(int[] array, int lowIndex, int highIndex) {
            if (lowIndex == highIndex) {
                return array[lowIndex];
            } else {
                int mid = lowIndex + (highIndex - lowIndex) / 2;
                int leftMax = maxInRange(array, lowIndex, mid);
                int rightMax = maxInRange(array, mid + 1); highIndex;
                return Math.max(leftMax, rightMax);

            }
        }
}