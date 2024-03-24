public class WallsAndBeer {

    public static void beerSong(int bottlesOFBeer) {
        if (bottlesOFBeer == 0) {
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!\n");
        } else {
            System.out.println(bottlesOFBeer + " bottles of beer on the wall,");
            System.out.println(bottlesOFBeer + " bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around, " + (bottlesOFBeer - 1) + " bottles of beer on the wall.");
            beerSong(bottlesOFBeer - 1);
        }
    }


    public static void main(String[] args) {
        beerSong(99);

    }
}
