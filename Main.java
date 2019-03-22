import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>(); //character list
        players.add(new Fighter("MoAli"));
        players.add(new Mage("HarryPotter"));
        players.add(new Priest("JSerra"));
        players.add(new Paladin("Knighttime") );
        System.out.println(players.size()); //character counter



        for (PlayerCharacter x: players) {
            if (x instanceof Priest) {
                System.out.println("Here is a priest");
                x.showStats();
            }
        }




    }
}
