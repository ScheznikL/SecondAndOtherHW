package HW_OOP;

public class Warrior extends Hero{

    @Override
    public String getName() {
        return super.getName()+" obtained role of a Warrior";
    }

    @Override
    public void attackEnemy(Enemy monster) {
        System.out.println("Warrior is attacking enemy!");

        monster.takeDamage(500);
    }
}
