public class WallsAndBeer {

    public static void main(String[] args) {
        int n = 99;

        chorusLoop(n);

    }

    private static void chorusLoop(int n) {
        if (n == 0) {
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall! ");
        } else {
            System.out.println(n + " bottles of beer on the wall, \n" +
                    +n + " bottles of beer,\n" +
                    "ya take one down, ya pass it around, " + (n - 1) + " bottles of beer on the wall");
            chorusLoop(n - 1);
        }

    }
}
