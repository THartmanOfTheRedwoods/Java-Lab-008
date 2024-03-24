public class Maxinrange {

        public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
            if (lowIndex < 0 || highIndex >= arr.length || lowIndex > highIndex) {
            }

            int maxValue = arr[lowIndex];

            for (int i = lowIndex + 1; i <= highIndex; i++) {
                if (arr[i] > maxValue) {
                    maxValue = arr[i];
                }
            }

            return maxValue;
        }

        public static void main(String[] args) {
            int[] arr = {1, 5, 3, 7, 9, 2, 5, 6, 3, 7};
            System.out.println(maxInRange(arr, 1, 2));
            System.out.println(maxInRange(arr, 1, 5));
            System.out.println(maxInRange(arr, 1, 9));
        }
    }
