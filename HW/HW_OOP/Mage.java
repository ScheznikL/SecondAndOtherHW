package HW_OOP;

public class Mage extends Hero{

    @Override
    public String getName() {
        return super.getName()+" obtained role of a Mage";
    }
    @Override
    public int getHealth() {
        return super.getHealth();
    }
    @Override
    public void attackEnemy(Enemy monster) {
        Heal();//if needed
        if(monster instanceof Goblin){
            System.out.println("Mage is attacking Goblin!");
            monster.takeDamage(900);}
            else if (monster instanceof Dragon) {
                System.out.println("Mage is attacking Dragon!");
                monster.takeDamage(300);
                }else{
                System.out.println("Mage is attacking Zombie!");
                monster.takeDamage(100);}
    }

    public void Heal(){
    if(getHealth()!=2000){
        setHealth(getHealth()+200);
        System.out.println("*Mage on scene, HP increased*");
    }
    }
}
