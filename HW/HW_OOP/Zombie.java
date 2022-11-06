package HW_OOP;

public class Zombie extends Enemy {

    private int partsOfbody=5;//hands,head,legs

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth()-damage);

        System.out.println("Zombie --" + damage + "\nZombie health: " + getHealth() );
        if(getHealth()<0){
            System.out.println("Zombie lost a part of its body..\n"+partsOfbody+" is still remain!");
            partsOfbody--;
        } if(!isAlive()) {
            System.out.println("Zombie was immobilized!");
        }else System.out.println("Zombie is still alive!");

    }

    @Override
    public boolean isAlive() {
        return (partsOfbody>=0);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Zombie is attacking Hero!");
        if(hero instanceof Archer)
        hero.takeDamage(200);
        else if (hero instanceof Mage) {
            hero.takeDamage(300);
        }else
            hero.takeDamage(100);
    }

}
