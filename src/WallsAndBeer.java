public class WallsAndBeer {
    public static void main(String[] args) {
        printLyrics(99);
    }

    public static void printLyrics(int numBottles) {
        if (numBottles == 0) {
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
        } else {
            System.out.println(numBottles + " bottles of beer on the wall,\n" +
                    numBottles + " bottles of beer,\n" +
                    "ya’ take one down, ya’ pass it around, " + (numBottles - 1) + " bottles of beer on the wall.");
            printLyrics(numBottles - 1);
        }
    }
}
