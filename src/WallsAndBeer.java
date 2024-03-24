public class WallsAndBeer {

    public static void song(int number) {
        String word1 = " bottles of beer on the wall, ";
        String word2 = " bottles of beer, ya take one down, pass it around, ";
        System.out.println(number + word1 + number + word2 + number + word1);
    }

    public static void ending(int number) {
        if (number == 0) {
            System.out.println("No bottles of beer on the wall, no bottles of beer, " + "ya can't take one down, ya can't pass it around, cause there " + "are no more bottles of beer on the wall!");

        }
        else {
            song(number);
            ending(number - 1);
        }
    }
    public static void main(String[] args) {
        song(3);
        ending(3);
    }
}
