public class WallsAndBeers {

    public static void beersOnWall(int b){

        if (b==0){
            System.out.println("No bottles of beer on the wall");
            System.out.println("no bottles of beer");
            System.out.println("ya' can't take one down, ya' can't pass it around, 'cause there are no more bottles of beer on the wall!");
        }else{
            System.out.println(b + " bottles of beer on the wall");
            System.out.println(b + " bottles of beer");
            int next_beer = b - 1;
            System.out.println("ya' take one down, ya' pass it around, " + next_beer + " bottles of beer on the wall!");
            beersOnWall(b - 1);
        }

    }

    public static void main(String[] args){

        beersOnWall(99);
    }
}
