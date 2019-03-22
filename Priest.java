
public class Priest extends PlayerCharacter {


    private int charisma;


    public Priest(String newName) {
        name = newName;
        System.out.println("A Priest named " + name + " hath been created.");


        strength = 7 + Die.roll();
        intelligence = 15 + Die.roll();
        agility = 8 + Die.roll();
        charisma = 10 + Die.roll();


        hp = hpmax = strength;
        mp = mpmax = intelligence + (2 * charisma);


    }

    public void showStats() {
        System.out.printf("%s, a Priest:\n", name);
        System.out.printf("STR: %3d INT: %3d AGI: %3d CHA: %3d\n",strength,intelligence,agility,charisma);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);

    }
}
