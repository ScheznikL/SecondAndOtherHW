package HW_OOP;

public class Archer extends Hero{

    @Override
    public String getName() {
        return super.getName()+" obtained role of a Archer";
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void attackEnemy(Enemy monster) {
        if(monster instanceof Zombie){
            System.out.println("Archer is attacking Zombie!");
            monster.takeDamage(400);}
        else if (monster instanceof Dragon) {
            System.out.println("Archer is attacking Dragon!");
            monster.takeDamage(200);
        }else{
            System.out.println("Archer is attacking Goblin!");
            monster.takeDamage(300);}
            if(getHealth()<getHealth()/2){
                System.out.println("Oh, HP is decreasing! Hurry!!");
                DoubleHit(monster);
            }
    }

    public void DoubleHit(Enemy monster){
        attackEnemy(monster);
    }
}
