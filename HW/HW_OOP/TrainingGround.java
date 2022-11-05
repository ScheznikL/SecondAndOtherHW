package HW_OOP;

public class TrainingGround {
    static String GetName(Hero person){//пізне звязування
        return person.getName();
    }
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Enemy monster = new Enemy(1000);


        System.out.println("Hero on field: " + GetName(hero1)+".\n");
        hero1.attackEnemy(monster);

    Warrior warrior_hero = new Warrior();
    Archer archer_hero = new Archer();
    Mage mage_hero = new Mage();


        warrior_hero.attackEnemy(monster);
        archer_hero.attackEnemy(monster);
        mage_hero.attackEnemy(monster);



    }
}
