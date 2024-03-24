public class WallsAndBeer {

    public static void beerAndWalls (int n){
        if (n == 0) {
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
        } else {
            System.out.printf("%d bottles of beer on the wall,\n%d bottles of beer,\nya’ take one down, ya’ pass it around, %d bottles of beer on the wall.\n", n, n, n - 1);
            System.out.println();
            beerAndWalls(n - 1);
        }
    }
    public static void main(String[] args) {
        beerAndWalls(99);
    }
}
