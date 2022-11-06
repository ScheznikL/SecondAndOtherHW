package HW_OOP;



import java.util.Random;
import java.util.Scanner;


public class BattleGround {
    static String GetName(Hero person){
        return person.getName();
    }
    public static boolean used_D=false;
    public static boolean used_Z=false;
    public static boolean used_G=false;

    public static void main(String[] args) {

        boolean win=false;
        String choice;
        Random rand =new Random();
        int character= rand.nextInt(3)+1;
        /*1-Paladin
        * 2-Mage
        * 3-Archer */
        Scanner scan = new Scanner(System.in);

        Paladin paladin_hero = new Paladin();
        Archer archer_hero = new Archer();
        Mage mage_hero = new Mage();

        Dragon dragon = new Dragon(400);
        Zombie zombie = new Zombie(100);
        Goblin goblin = new Goblin(700);

        System.out.println("Welcome to the battle!\nEnjoy the show.");
        System.out.println("Our opponents today are:");
        System.out.println(paladin_hero.Name()+"\t VS \t"+"Group of monsters" +
                "\n\t\t\t    Dragon\n\t\t\t    Zombie\n\t\t\t    Goblin\n"+"Health: \n"+paladin_hero.getHealth()+
                "\t\t    "+dragon.getHealth()+"\n\t\t\t    "+zombie.getHealth()+"\n\t\t\t    "+goblin.getHealth()+"\n");


        while (true){
        System.out.println("\t\t\n--------------------------------\nQuick menu");
        System.out.println("0-Info\n1-Start battle\ne-Exit\n--------------------------------");
        choice=scan.next();
        switch (choice) {
            case "0" -> {
                System.out.println("Information: ");
                System.out.println("There 3 classes of heroes, that will be chosen randomly as you proceed,\n the same thing works for enemies");
                System.out.println("""
                        But you may notice as the action will be going, that there's only 1 character, that fights 3 monsters,
                        and during the battle he will be changing his class.
                        [BTW changes don't have any particular reasoning, just random occurrence,but role will change as an opponents dies.]""");
                System.out.println("More info about hero classes?\nY or N");
                String answer= scan.next().toUpperCase();
                if(answer.equals("Y")){
                    System.out.println("Paladin:");
                    System.out.println("Character can be revived once.");
                    System.out.println("Mage:");
                    System.out.println("Character will be healing himself every move.");
                    System.out.println("Archer:");
                    System.out.println("Character will hoot twice when HP less then a half of what he had at beginning.");
                    System.out.println("[Be patient enemies has it's own abilities too!]");
                } else{
                    System.out.println("Going to main menu..");}

            }

            case "1" -> {

                boolean used_P=false;
                boolean used_A=false;
                boolean used_M=false;


        while(Hero.health>0 && !win) {
            if (character == 1) {
                if(!used_P)
                System.out.println("\n" + GetName(paladin_hero) + ".\n");

                Battle(paladin_hero, dragon);

                used_P=true;
                if(!used_M || !used_A)
                    character++;
                else {
                    System.out.println("Hero won!");
                     win = true;
                }

            } else if (character == 2 ) {
                if(!used_M)
                System.out.println("\n" + GetName(mage_hero) + ".\n");

                Battle(mage_hero, zombie);

                used_M=true;
                if(used_P && !used_A)
                    character++;
                else if (!used_P) {
                    character--;
                } else {
                    System.out.println("Hero won!");
                    win = true;
                }

            } else if(character == 3 ){
                if(!used_A)
                System.out.println("\n" + GetName(archer_hero) + ".\n");

                Battle(archer_hero, goblin);
                used_A=true;
                if(!used_P || !used_M)
                    character--;
                else {
                    System.out.println("Hero won!");
                    win = true;
                }
            }
        }
                if(Hero.health<0){
                System.out.println("Show over.");}

                return;

            }
            case "e" ->{
                System.out.println("Bye!");
                return;
            }
            default -> {
                System.out.println("Wrong option,try more");
            }
        }
        }



    }



    public  static void Battle(Hero hero,Enemy enemy){
       if(enemy instanceof Dragon && !used_D) {
           if (hero instanceof Archer)
                BattleLoop(hero, enemy);
                else if (hero instanceof Mage) {
                BattleLoop(hero, enemy);
                } else
                BattleLoop(hero, enemy);
                used_D=true;

                   }if(enemy instanceof Zombie && !used_Z){
                       if (hero instanceof Archer)
                        BattleLoop(hero, enemy);
                        else if (hero instanceof Mage) {
                        BattleLoop(hero, enemy);
                        }else
                        BattleLoop(hero, enemy);
                used_Z=true;

                            }if(enemy instanceof Goblin && !used_G){
                               if (hero instanceof Archer)
                                BattleLoop(hero, enemy);
                                else if (hero instanceof Mage) {
                                BattleLoop(hero, enemy);
                                } else
                                BattleLoop(hero, enemy);
                used_G=true;
       }

    }

    public static void BattleLoop(Hero hero,Enemy enemy){
     while ((enemy.isAlive()&&enemy.isPresent()) && hero.isAlive()){
         if(hero.isAlive() && enemy.isPresent())
         hero.attackEnemy(enemy);
         if(enemy.isAlive() && enemy.isPresent())
         enemy.attackHero(hero);
    }

    }



}


