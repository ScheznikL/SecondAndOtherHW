package HW_OOP;

public abstract class Enemy implements Mortal{
private int health;
private boolean present=true;
    public void setHealth(int health) {
        this.health = health;
    }
    public boolean isPresent() {
        return present;
    }
    public int getHealth() {
        return health;
    }
    public Enemy(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
        health=health-damage;
        System.out.println("Enemy --"+ damage+"\nEnemy health: "+health );
        if(!isAlive()){
            System.out.println("Enemy was defeated...");
        }else {
            System.out.println("Enemy still alive!");
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
    public abstract void attackHero(Hero hero);

}
