package HW_OOP;

public class BattleGround {
    static String GetName(Hero person){//пізне звязування
        return person.getName();
    }

    public static void main(String[] args) {

        Enemy monster = new Enemy(1000);

        Warrior warrior_hero = new Warrior();
        System.out.println("\n"+GetName(warrior_hero)+".\n");
        Archer archer_hero = new Archer();
        Mage mage_hero = new Mage();


        warrior_hero.attackEnemy(monster);
        System.out.println("\n"+GetName(archer_hero)+".\n");
        archer_hero.attackEnemy(monster);
        System.out.println("\n"+GetName(mage_hero)+".\n");
        mage_hero.attackEnemy(monster);

    }
}
