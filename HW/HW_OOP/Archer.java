package HW_OOP;

public class Archer extends Hero{

    @Override
    public void attackEnemy(Enemy monster) {
        System.out.println("Archer is attacking enemy!");

        monster.takeDamage(200);
    }

}
