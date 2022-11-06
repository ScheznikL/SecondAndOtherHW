package HW_OOP;

public abstract class Hero implements Mortal {

    protected String name = "Aragon";
    protected static int health=2000;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        Hero.health = health;
    }

    public String getName() {
        return name;
    }

   public abstract void attackEnemy(Enemy monster);


    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage){
        health=health-damage;
        System.out.println("Hero --"+ damage+"\nHero health: "+health );
        if(!isAlive()){
            System.out.println("Hero was defeated..");
        }

    }
}
