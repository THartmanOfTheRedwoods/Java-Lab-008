import java.util.Scanner;
public class ack {
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        } else {
            throw new IllegalArgumentException("Must be a positive integer");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for m: ");
        int m = scanner.nextInt();

        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        System.out.println(ack(m, n));

        scanner.close();
    }
}