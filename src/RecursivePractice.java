
public class RecursivePractice {
    public static int oddSum(int n){

        if (n == 1){
            return 1;
        } else {
            return n + oddSum(n-2);
        }

    }
    public static double power(double x, int n){
if(n == 0){
    return 1;
}
if(n % 2 == 0){
    double evenEff = power(x, n /2);
    return evenEff * evenEff;
}else {
    return x * power(x, n-1);
}
    }
    public static int ack(int m, int n){
        if(m == 0){
            return n + 1;
        } else if(m > 0 && n == 0){
            return ack(m - 1, 1);
        }else if (m > 0 && n > 0){
            return ack(m - 1, ack(m, n - 1));
        }
        return -1;
    }
    public static int maxInRange(int[] a, int lowIndex,int highIndex){
        if (lowIndex == highIndex) {
            return a[lowIndex];
        }
        int midIndex = (lowIndex + highIndex)/ 2;
        int bottomHalf = maxInRange(a, lowIndex, midIndex);
        int topHalf = maxInRange(a, midIndex + 1, highIndex);
        return Math.max(bottomHalf, topHalf);
    }
    public static void main(String[] args) {
        int n= 7;
        double b = 4;
                int m = 4;
                        int c = 2;
                                int d = 2;
                                      int t = 1;

        int[] a = {3, 6, 7, 8, 20, 1, 4, 9};
        int result = oddSum(7);
        System.out.println("The odd sum of " + 7 + " is " +  result);
        double resultOfPower = power(b, m);
        System.out.println(b+ "^" + m + " = " + resultOfPower);
        int Ackermann = ack(c,d);
        System.out.println("The result of the Ackermann function is " + c + " and " + d + "is " + Ackermann);
        int maximiRangus = maxInRange(a, t, n);
        System.out.println("The maximum value between " + t + " and " + n + " is " + maximiRangus);
    }

}