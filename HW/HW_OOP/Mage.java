package HW_OOP;

public class Mage extends Hero{

    @Override
    public void attackEnemy(Enemy monster) {
        System.out.println("Mage is attacking enemy!");

        monster.takeDamage(300);
    }


}
