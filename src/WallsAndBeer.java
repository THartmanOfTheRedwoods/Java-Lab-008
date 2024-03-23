public class WallsAndBeer {
    public static void main(String[] args) {
        song(99);
    }

    public static void song(int bottles) {
        if (bottles == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
        } else {
            System.out.printf("%d bottles of beer on the wall, %n", bottles);
            System.out.printf("%d bottles of beer, %n", bottles);
            System.out.printf("ya’ take one down, ya’ pass it around, %d bottles of beer on the wall. %n", (bottles - 1));
            song(bottles - 1);
        }
    }
}
