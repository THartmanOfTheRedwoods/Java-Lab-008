public class WallsAndBeer {

    public static void printVerse(int numBottles) {
        if (numBottles > 0) {
            System.out.println(numBottles + " bottles of beer on the wall,");
            System.out.println(numBottles + " bottles of beer,");
            System.out.println("ya' take one down, you pass it around, " + (numBottles - 1) + " bottles of beer on the wall.");
            System.out.println();

        } else {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around, 'cause there are no more bottles of beer on the wall!");
        }

    }
    public static void printLyrics(int numBottles) {
        if (numBottles > 0) {
            printVerse(numBottles);
            printLyrics(numBottles - 1);
        } else {
            printVerse(numBottles);
        }
    }

    public static void main(String[] args) {
        printLyrics(3);
    }
}
