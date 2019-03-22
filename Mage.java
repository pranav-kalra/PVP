
public class Mage extends PlayerCharacter {


    private int wisdom;


    public Mage(String newName) {
        name = newName;
        System.out.println("A Mage named " + name + " hath been created.");


        strength = 7 + Die.roll();
        intelligence = 15 + Die.roll();
        agility = 8 + Die.roll();
        wisdom = 10 + Die.roll();


        hp = hpmax = strength;
        mp = mpmax = intelligence + (2 * wisdom);


    }

    public void showStats() {
        System.out.printf("%s, a Mage:\n", name);
        System.out.printf("STR: %3d INT: %3d AGI: %3d WIS: %3d\n",strength,intelligence,agility,wisdom);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);

    }
}
