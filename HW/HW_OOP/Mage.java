package HW_OOP;

public class Mage extends Hero{

    @Override
    public String getName() {
        return super.getName()+" obtained role of a Mage";
    }
    @Override
    public void attackEnemy(Enemy monster) {
        System.out.println("Mage is attacking enemy!");

        monster.takeDamage(300);
    }


}
