public class WallsAndBeer {
    public static void BeerCounter(int numBeers){
        if (numBeers > 1) {
            System.out.println(numBeers + " bottles of beer on the wall,\n" +
                    numBeers + " bottles of beer,\n" +
                    "ya’ take one down, ya’ pass it around," + numBeers + " " +
                    "bottles of beer on the wall.");
            System.out.println("==================");
            numBeers -= 1;
            BeerCounter(numBeers);
        }
        else if (numBeers == 1){
            System.out.println("No bottles of beer on the wall,\n" +
                "no bottles of beer,\n" +
                "ya’ can’t take one down, ya’ can’t pass it around, " +
                "’cause there are no more bottles of beer on the wall!");
        }

    }
    public static void main(String[] args) {
    BeerCounter(99);
    }
}
