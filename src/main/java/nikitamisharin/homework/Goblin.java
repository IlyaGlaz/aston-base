package org.example;
import java.util.Random;

public class Goblin extends Enemy {
    private static final int GOBLINDAMAGE = 7;

    public Goblin (String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(GOBLINDAMAGE);
        System.out.println("Goblin " + getName() + " deals " + GOBLINDAMAGE + " damage to " + hero.getName());
        usePoison(hero);
    }

    public void usePoison(Hero hero) {
        int a = new Random().nextInt(10);
        if (a < 3) {
            // 30% chance
            hero.setHealth(0);
            System.out.println(hero.getName() + " was poisoned!");
        } else {
            setHealth(0);
            System.out.println(getName() + " was poisoned!");
        }
    }
}
