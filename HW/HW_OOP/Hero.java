package HW_OOP;

public abstract class Hero {

    protected String name = "Aragon";

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy monster);



}
