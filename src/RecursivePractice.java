import java.util.Scanner;

public class RecursivePractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose AckermanFunction(1), SumOfOdds(2), Power(3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter two numbers for the Ackerman function: ");
                //stack errors out above 3 for each number
                int m = scanner.nextInt();
                int n = scanner.nextInt();
               while (true) { //input validation
                    if (n > 0 && m > 0) { // If both numbers are positive, break the loop
                        break;
                    } else {
                        System.out.println("The two numbers must be positive integers. ");
                    }
                }
                    int result = ack(m, n); // Store the Ackermann function result
                        System.out.println("Ackermann result: " + result); // Print the result
                        break;

            case 2:
                int num;
                do {
                    System.out.print("Enter an odd number: ");
                    num = scanner.nextInt();

                    if (num % 2 != 0) { // If num is odd
                        int sum = oddSum(num);
                        System.out.println("Sum = " + sum);
                        break; // Exit the loop after calculating the sum
                    } else {
                        System.out.println("Please enter an odd number.");
                    }
                } while (true); // Loop until an odd number is entered
                break;

            case 3:
                System.out.print("Enter two numbers for power (base and exponent): ");
                double x = scanner.nextDouble();
                int e = scanner.nextInt();
                double powerResult = power(x, e); // Store the power result
                System.out.println("Power result: " + powerResult); // Print the result
                break;

            //case 4: can't seem to find a way to prompt user for input of array and find low and high index

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }


    static int oddSum(int num) {
        if (num <= 0) { // Base case: return 0 for num less than or equal to 0
            return 0;
        } else {
            return num + oddSum(num - 2); // Recursive call with num-2 for next odd number
        }

    }

    static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1)); // Recursive call
        }
    }

    public static double power(double x, int e) {
        // Base case: Anything to the power of 0 is 1
        if (e == 0) {
            return 1;
        } else {
            // Recursive case: x^n = x * x^(n-1)
            return x * power(x, e - 1);
        }
    }

    public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
        // Base case: If the range has only one element
        if (lowIndex == highIndex) {
            return arr[lowIndex];
        }

        // Recursive case: Divide range in half and find maximum in each half
        int midIndex = (lowIndex + highIndex) / 2;
        int leftMax = maxInRange(arr, lowIndex, midIndex);
        int rightMax = maxInRange(arr, midIndex + 1, highIndex);

        // Return the maximum of the maxima from both halves
        return Math.max(leftMax, rightMax);
    }
}