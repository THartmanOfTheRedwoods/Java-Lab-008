import java.lang.String;

public class WallsAndBeer {
    public static void main(String[] args) {
        drunkShanty(99);
    }

    public static void drunkShanty(int bottleCount) {
        if (bottleCount > 0) {
            printVerse(bottleCount);
            drunkShanty(bottleCount - 1);
        } else {
            printNoMoreBottles();
        }
    }

    public static void printVerse(int bottleCount) {
        java.lang.String bottleText = bottleCount == 1 ? "bottle" : "bottles";
        System.out.println(bottleCount + " " + bottleText + " of beer on the wall,");
        System.out.println(bottleCount + " " + bottleText + " of beer.");
        System.out.println("Take one down, pass it around,");
        System.out.println((bottleCount - 1) + " " + (bottleCount > 1 ? "bottles" : "bottle") + " of beer on the wall.\n");
    }

    public static void printNoMoreBottles() {
        System.out.println("No more bottles of beer on the wall,");
        System.out.println("No more bottles of beer.");
        System.out.println("Ya’ can’t take one down, ya’ can’t pass it around,");
        System.out.println("’cause there ain't no more bottles of beer on the wall!\n");
    }
}
