package org.example;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class BattleGround {
    public static void main(String[] args) {
        Zombie zom = new Zombie("Zom-Zom", 7);
        Warrior geralt = new Warrior("Geralt", 30);
        Dragon dragon = new Dragon("Smaug", 80);
        Mage gandalf = new Mage("Gandalf", 20);

        //func for duels:
        fightDuel(geralt, zom);
        fightDuel(gandalf, dragon);

        int armySize = 5;
        Goblin[] goblinArmy = gatherArmy(armySize); // Army of goblins
        fightAgainstArmy(goblinArmy, geralt);

    }

    public static void fightDuel(Hero hero, Enemy enemy) {
        System.out.println(hero.getName() + " (" + hero.getHealth() + " health)" +
                " vs " + enemy.getName() + " (" + enemy.getHealth() + " health).");
        int roundNum = 1;
        while ((hero.isAlive()) && (enemy.isAlive())) {
            System.out.println("Round #" + roundNum);
            hero.attackEnemy(enemy);
            if (enemy.isAlive()) {
                enemy.attackHero(hero);
            }
            roundNum += 1;
        }
        checkResult(hero, enemy);
    }

    public static void checkResult(Hero hero, Enemy enemy) {
        if (hero.isAlive()) {
            System.out.println(enemy.getName() + " is dead. " + hero.getName() + " has won!\n");
        } else {
            System.out.println(hero.getName() + " is dead. " + enemy.getName() + " has won!\n");
        }
    }

    public static Goblin[] gatherArmy(int armySize) {
        Goblin[] goblinArmy = new Goblin[armySize];
        for (int i = 0; i < goblinArmy.length; i++)
            goblinArmy[i] = new Goblin(genName(), 12);
        for (Goblin g : goblinArmy) {
            System.out.println("Goblin " + g.getName() + " ready to battle!");
        }
        System.out.println("The goblin army has been assembled!\n");
        return goblinArmy;
    }

    public static String genName() {
        final String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        final java.util.Random rand = new java.util.Random();
        final Set<String> identifiers = new HashSet<String>();

        StringBuilder builder = new StringBuilder();

        while(builder.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                builder.append(lexicon.charAt(rand.nextInt(lexicon.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }

    public static void fightAgainstArmy(Goblin goblins[], Hero hero) {
        System.out.println(hero.getName() + " vs Goblin Army!");
        int armyTotalHealth = 12 * goblins.length;
        while (hero.isAlive() && armyTotalHealth > 0) {
            for (Goblin g : goblins) {
                fightDuel(hero, g);
                armyTotalHealth += g.getHealth();
            }
        }
    }
}
