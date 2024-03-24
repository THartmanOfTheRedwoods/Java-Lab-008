import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for x: The non-exponent ");
        int x = scanner.nextInt();

        System.out.print("Enter a value for n: The exponent ");
        int n = scanner.nextInt();
        System.out.println(power(x, n));
    }
    public static double power(double x, int n) {
    if (n > 0) {
        return x * power(x, n - 1);
    } else if (n < 0) {
        return 1 / (x * power(x, -n - 1));
    } else {
        return 1.0;
    }

}}
