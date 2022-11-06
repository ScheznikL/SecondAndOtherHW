package HW_OOP;
//Goblin just a goblin(
//  \o/
public class Goblin extends Enemy {

    public Goblin(int health) {
        super(health);
    }

    @Override

        public void attackHero(Hero hero) {
            System.out.println("Goblin is attacking Hero!");
            if(hero instanceof Archer)
                hero.takeDamage(200);
            else if (hero instanceof Mage) {
                hero.takeDamage(300);
            }else
                hero.takeDamage(400);
        }



}
