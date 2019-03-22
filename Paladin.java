
public class Paladin extends PlayerCharacter {


    private int wisdom;
    private int constitution;


    public Paladin(String newName) {
        name = newName;
        System.out.println("A Paladin named " + name + " hath been created.");


        strength = 10 + Die.roll();
        intelligence = 15 + Die.roll();
        agility = 5 + Die.roll();
        wisdom = 10 + Die.roll();
        constitution = 10 + Die.roll();


        hp = hpmax = strength + (2*constitution);
        mp = mpmax = intelligence + (2 * wisdom);


    }

    public void showStats() {
        System.out.printf("%s, a Paladin:\n", name);
        System.out.printf("STR: %3d INT: %3d AGI: %3d WIS: %3d CON: %3d\n",strength,intelligence,agility,wisdom,constitution);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);

    }
}
