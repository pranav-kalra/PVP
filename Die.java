import java.util.Random;

public class Die  { //man this class sounds a lot more ominous than it really is, just like comp sci to the luddites/serra administration(*whaaaat... who said that??*)

    public static int roll() {
        Random rand = new Random();
        return (rand.nextInt(6) + 1);
    }
}
