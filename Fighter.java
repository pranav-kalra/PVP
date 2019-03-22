
public class Fighter extends PlayerCharacter {


    private int constitution;



    public Fighter(String newName) {
        name = newName;
        System.out.println("A fighter named " + name + " hath been created.");


        strength = 15 + Die.roll();
        intelligence = 7 + Die.roll();
        agility = 8 + Die.roll();
        constitution = 10 + Die.roll();

        mp = mpmax = 0;
        hp = hpmax = (strength * 2) + (constitution * 2);


    }

    public void showStats() {
        System.out.printf("%s, a Fighter:\n", name);
        super.showStats();
        System.out.printf("STR: %3d INT: %3d AGI: %3d CON: %3d\n",strength,intelligence,agility,constitution);
        System.out.printf(" HP: %3d/%3d\n", hp, hpmax);
        System.out.printf(" MP: %3d/%3d\n", mp, mpmax);
    }



}
