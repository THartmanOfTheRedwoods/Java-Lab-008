// Written By: Austin Barnett
// Date: 3/23/2024
// Version 1.0

public class WallsAndBeer {

    public static void main(String[] args) {
        printSong(99);
    }

    public static void printSong(int bottles) {
        if (bottles == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");
        } else {
            System.out.println(bottles + " bottles of beer on the wall,");
            System.out.println(bottles + " bottles of beer,");
            System.out.println("ya’ take one down, ya’ pass it around, " + (bottles - 1) + " bottles of beer on the wall.\n");
            printSong(bottles - 1);
        }
    }
}
