public class WallsAndBeer {

    public static void main(String[] args) {
        int numBottles = 99; // Starts with 99 bottles
        singVerse(numBottles);
    }

    // Uses the Recursive method the song
    public static void singVerse(int numBottles) {
        if (numBottles == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
        } else {
            System.out.println(numBottles + " bottles of beer on the wall,");
            System.out.println(numBottles + " bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around, " + (numBottles - 1) + " bottles of beer on the wall.");
            singVerse(numBottles - 1); // Recursive calls the next verse
        }
    }
}
