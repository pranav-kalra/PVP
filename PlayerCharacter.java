public abstract class PlayerCharacter {


    protected String name;

    int strength;
    int intelligence;
    int agility;

    int hp, hpmax;
    int mp, mpmax;


    private static int count;

    public PlayerCharacter() {
        System.out.println("Player Character extended created class and a new character was created.");
        count++;
            }


    public void showStats() {
        System.out.println("ligma");
    }

    public static int numCharacters() {
        return count;
    }



}
