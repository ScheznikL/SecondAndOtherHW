package HW_OOP;

public class Enemy {

private int health;

    public void setHealth(int health) {
        this.health = health;
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
        if(health<0){
            System.out.println("Enemy was defeated...");
        }
    }

}
