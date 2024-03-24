public class WallAndBeer {

    //nice easy lab this week

    public static void main(String[] args) {
        printBottlesOfBeer(99);
    }

    public static void printBottlesOfBeer(int numBottles) {
        //The actual step counter used by the program
        for (; numBottles > 0; numBottles--) {
            System.out.printf("%d bottles of beer on the wall,\n", numBottles);
            System.out.printf("%d bottles of beer.\n", numBottles);
            System.out.println("Ya take one down, pass it around,\n");
            //This code is clever because it uses the same integer to dictate the actual step counter
            //the amount of bottles that are on the wall. (numBottles)
            System.out.printf("%d bottles of beer on the wall.\n\n", numBottles - 1);
        }
        System.out.println("No bottles of beer on the wall,\n" +
                "no bottles of beer,\n" +
                "ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!\n");
    }
}

