public class RecursivePractice {
    public static void Breakingdown(int numBottles) {
        if (numBottles == 0) {
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
        } else {

            System.out.printf(numBottles+" bottles of beer on the wall,\n" +
                    numBottles+" bottles of beer,\n" +
                    " ya’ take one down, ya’ pass it around, %d bottles of beer on the wall.",(numBottles-1));
            Breakingdown(numBottles - 1);

        }
    }

}