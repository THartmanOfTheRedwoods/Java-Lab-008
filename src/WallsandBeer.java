public class WallsandBeer {
    public static void main(String[] args) {
        int numberOfBottles = 99;
        singVerse(numberOfBottles);
    }
    public static void singVerse(int numberOfBottles) {
        if (numberOfBottles == 0) {
            printLastVerse();
        } else {
            printVerse(numberOfBottles);
            singVerse(numberOfBottles - 1);
        }
    }
    public static void printVerse(int numberOfBottles) {
        String word = (numberOfBottles == 1) ? "bottle" : "bottles";
        System.out.println(numberOfBottles + " " + word + " of beer on the wall,");
        System.out.println(numberOfBottles + " " + word + " of beer,");
        System.out.println("ya’ take one down, ya’ pass it around,");
        System.out.println((numberOfBottles - 1) + " bottles of beer on the wall.");
        System.out.println();
    }
    public static void printLastVerse() {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
    }
}