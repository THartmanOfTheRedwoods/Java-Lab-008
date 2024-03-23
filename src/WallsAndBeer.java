public class WallsAndBeer {

    public static void main(String[] args) {
        singSong(99);
    }

    //The whole song
    public static void singSong(int numberOfBottles) {
        if (numberOfBottles > 0) {
            singVerse(numberOfBottles); //The current verse
            System.out.println(); //Break
            singSong(numberOfBottles - 1); //The next verse
        } else {
            // Last verse
            singLastVerse();
        }
    }

    //A single verse
    public static void singVerse(int numberOfBottles) {
        System.out.println(numberOfBottles + " bottles of beer on the wall,");
        System.out.println(numberOfBottles + " bottles of beer,");
        System.out.println("ya' take one down, ya' pass it around,");
        System.out.println((numberOfBottles - 1) + " bottles of beer on the wall.");
    }

    //The last verse
    public static void singLastVerse() {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya' can't take one down, ya' can't pass it around,");
        System.out.println("'cause there are no more bottles of beer on the wall!");
    }
}
