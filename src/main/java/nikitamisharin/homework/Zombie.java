package org.example;
import java.util.concurrent.ThreadLocalRandom;

public class Zombie extends Enemy  {
    private int minDamage = 1;
    private int maxDamage = 10;

    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        int randomDamage = ThreadLocalRandom.current().nextInt(minDamage, maxDamage + 1);
        hero.takeDamage(randomDamage);
        System.out.println("Zombie " + getName() + " deals " + randomDamage + " damage to " + hero.getName());
    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0) {
            return true;
        } else {
            int randomChance = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            if (randomChance % 2 == 0) {
                setHealth(5);
                System.out.println("The zombie has risen!");
                return true;
            } else {
                return false;
            }
        }
    }
}
