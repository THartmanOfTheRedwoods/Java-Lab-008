public class WallsAndBeer {
    public static void main(String[] args) {
        int totalBottles = 5; // The number of bottles
        beerSong(totalBottles); // Start singing the beer song
    }

    public static void beerSong(int n) {
        if (n == 0) {
            endOfSong();
        } else {
            singVerse(n);
            beerSong(n - 1); // Recursively call beerSong with one less bottle
        }
    }

    public static void singVerse(int n) {
        String wordGrammar = "bottles";
        if(n >= 1){
            wordGrammar = "bottle";
        }
        System.out.println(n + " " + wordGrammar + " of beer on the wall,");
        System.out.println(n + " " + wordGrammar + " of beer,");
        System.out.println("ya’ take one down, ya’ pass it around, " + (n - 1) + " " + wordGrammar + " of beer on the wall.");
        System.out.println(); // Empty line for separation between verses
    }

    public static void endOfSong() {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
        System.out.println("’cause there are no more bottles of beer on the wall!");
    }
}
