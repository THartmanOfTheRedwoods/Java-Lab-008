public class WallsAndBeer {

    public static void bottleAnthem(int numberOfBottles) {
        if (numberOfBottles == 0) {
            System.out.printf("No bottles of beer on the wall,%n" +
                    "no bottles of beer,%n" +
                    "ya' can't take one down, ya' can't pass it around, " +
                    "'cause there are no more bottles of beer on the wall!");
        } else {
            System.out.printf("%d bottles of beer on the wall,%n" +
                    "%d bottles of beer,%n" +
                    "ya' take one down, ya' pass it around, " +
                    "%d bottles of beer on the wall.%n%n",
                    numberOfBottles, numberOfBottles, (numberOfBottles - 1));
            bottleAnthem(numberOfBottles - 1);
        }
    }

    public static void main(String[] args) {
        bottleAnthem(5);
    }

}
