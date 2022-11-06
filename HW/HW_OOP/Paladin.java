package HW_OOP;
public class Paladin extends Hero{

    private boolean reviveRec=false;
    @Override
    public String getName() {
        return super.getName()+" obtained role of a Paladin";
    }
    public String Name() {
        return super.getName();
    }
    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void attackEnemy(Enemy monster) {
        if(monster instanceof Dragon){
        System.out.println("Paladin is attacking Dragon!");
        monster.takeDamage(1000);}
            else if (monster instanceof Goblin) {
                System.out.println("Paladin is attacking Goblin!");
                monster.takeDamage(500);
                    }else{
                    System.out.println("Paladin is attacking Zombie!");
                    monster.takeDamage(300);}
    }

    @Override
    public void takeDamage(int damage) {

        health=health-damage;
        System.out.println("Paladin --"+ damage+"\nPaladin health: "+health );
        if(!isAlive()&& !reviveRec){
            System.out.println("Paladin was defeated..\nBUT\n");
            health+=2000;
            System.out.println("Revived");
            reviveRec=true;
        }if(!isAlive()){
            System.out.println("Paladin was eventually defeated..");

        }

    }

}
