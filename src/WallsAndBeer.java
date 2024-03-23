
public class WallsAndBeer {
    public static void main(String[] args) {
        int numOfBottles = 99;
        printVerse(numOfBottles);
    }
    public static void printVerse(int numOfBottles) {
        for (int i = numOfBottles; i > 0; i--) {
            if (i == 1) {
                System.out.println("1 bottle of beer on the wall,");
                System.out.println("1 bottle of beer,");
                System.out.println("ya’ take one down, ya’ pass it around,");
                System.out.println("no more bottles of beer on the wall.");
            } else {
                System.out.println(i + " bottles of beer on the wall,");
                System.out.println(i + " bottles of beer,");
                System.out.println("ya’ take one down, ya’ pass it around,");
                System.out.println((i - 1) + " bottles of beer on the wall.");
            }
            System.out.println();
        }
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
        System.out.println("’cause there are no more bottles of beer on the wall!");
    }
}

