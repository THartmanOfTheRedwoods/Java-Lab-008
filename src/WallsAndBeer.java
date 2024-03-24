public class WallsAndBeer {

    public static void main(String[] args) {
        int numBottles = 99; // starting number of bottles
        singSong(numBottles);
    }

    public static void singSong(int numBottles) {

        // my first idea was to make a single formatted string that could be used in both cases, replacing ya' with dont at the end for example
        // but the program is so simple at it's core, I decided that I didn't want to go overboard and overcomplicate things.
        // I also don't know which is more efficient, formatting a string or concatenation on multiple println's. I decided to use an fstring.

        String formattedSong = """
                    %d bottles of beer on the wall,
                    %d bottles of beer,
                    ya’ take one down, ya’ pass it around,
                    %d bottles of beer on the wall.""";

        if (numBottles == 0) {
            // base case
            System.out.println("""
                    No bottles of beer on the wall,
                    no bottles of beer,
                    ya’ can’t take one down, ya’ can’t pass it around,
                    ’cause there are no more bottles of beer on the wall!""");
        } else {
            System.out.printf((formattedSong) + "%n", numBottles, numBottles, numBottles - 1);
            // one less bottle
            singSong(numBottles - 1);
        }
    }
}
