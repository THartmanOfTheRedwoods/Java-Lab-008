/**
 * @author Alexei Iachkov
 * @date 3-23-24
 * @version 1.0
 */
public class WallsAndBeer {

    public static void beersOnTheWall(int bottles) {
        if (bottles == 0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around, 'cause there are no more bottles of beer on the wall!");
        } else {
            System.out.println(bottles + " bottles of beer on the wall,");
            System.out.println(bottles + " bottles of beer,");
            System.out.println("ya' take one down, ya' pass it around, " + (bottles-1) + " bottles of beer on the wall.");
            beersOnTheWall(bottles - 1);
        }
    }

    public static void main(String[] args) {
        beersOnTheWall(99);
    }
}