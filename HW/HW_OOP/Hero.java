package HW_OOP;

public class Hero {

    protected String name = "Aragon";

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy monster){
        System.out.println( "Hero is attacking enemy!");

        monster.takeDamage(100);

    }



}
