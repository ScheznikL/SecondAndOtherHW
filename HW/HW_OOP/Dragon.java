package HW_OOP;

public class Dragon extends Enemy{

  private boolean present = true;
    public Dragon(int health) {
        super(health);
    }
    @Override
    public boolean isPresent() {
        return present;
    }

    @Override
    public void takeDamage(int damage) {

        setHealth(getHealth()-damage);

        System.out.println("Dragon --" + damage + "\nDragon health: " + getHealth() );
        if(getHealth()>=100 && getHealth()<=200){
            System.out.println("Dragon flies away...");//now it's too dangerous here
        present=false;}
        if(!isAlive()){
            System.out.println("Dragon was defeated.");
        }

    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Dragon is attacking Hero!");
        if(hero instanceof Archer)
            hero.takeDamage(500);
        else if (hero instanceof Mage) {
            hero.takeDamage(400);
        }else
            hero.takeDamage(600);
    }

}
