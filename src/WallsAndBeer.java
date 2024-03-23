public class WallsAndBeer {
    public static void main(String[] args) {
    int numBottles = 99;
    String word = "bottles";
    while (numBottles > 0) {
        if (numBottles == 1) {
            word = "bottle"; // One bottle
        }
        System.out.println(numBottles + " " + word + " of beer on the wall, ");
        System.out.println(numBottles + " " + word + " of beer");
        numBottles = numBottles - 1;
        if (numBottles > 0) {
            System.out.println("ya' take one down, ya' pass it around, " + numBottles + " " + word + " of beer on the wall.");
        }
    }
    if (numBottles == 0)
    {
        System.out.println("No bottles of beer on the wall,");
        System.out.println("no bottles of beer,");
        System.out.println("ya' can't take one down, ya' can't pass it around, 'cause there are no more bottles of beer on the wall!");
    }
}
}
