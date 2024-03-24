import java.util.ArrayList;
import java.util.Scanner;

public class RecursivePractice {
    //This code was easy to mash up using different bits of code from other labs.
    //I actually wasn't expecting it to work. --full circle, as they say
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            System.out.println("Enter a number");
            int input = Integer.parseInt(s.nextLine());
            int inputNumber = input;
            int[] array = createArrayFromNumber(inputNumber);
            System.out.println("Array from " + inputNumber + ":");
            printArray(array);

            int[] oddNumbers = getOddNumbers(array);
            System.out.println("\nOdd numbers:");
            printArray(oddNumbers);int sumOfOdds = 0;
            for (int num : array) {
                if (num % 2 != 0) {
                    sumOfOdds += num;
                }
            }
            System.out.println("\nSum of odd numbers: " + sumOfOdds);
        }
        public static int[] createArrayFromNumber(int inputNumber) {
            int length = inputNumber;
            int[] array = new int[length];
            for (int i = 0; i < length; i++) {
                array[i] = i + 1;
            }
            return array;
        }


        public static int[] getOddNumbers(int[] numbers) {
            ArrayList<Integer> oddNumbersList = new ArrayList<>();
            for (int num : numbers) {
                if (num % 2 != 0) {
                    oddNumbersList.add(num);
                }
            }
            int[] oddNumbers = new int[oddNumbersList.size()];
            for (int i = 0; i < oddNumbersList.size(); i++) {
                oddNumbers[i] = oddNumbersList.get(i);
            }
            return oddNumbers;
        }

        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
        }}

