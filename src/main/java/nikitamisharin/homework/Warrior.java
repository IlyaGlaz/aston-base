package org.example;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Warrior extends Hero {
    private int minDamage = 7;
    private int maxDamage = 15;

    public Warrior(String name,int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int randomDamage = ThreadLocalRandom.current().nextInt(minDamage, maxDamage + 1);
        //Check double damage chance
        enemy.takeDamage(doubleDamageChance(randomDamage));
        if (doubleDamageChance(randomDamage) != randomDamage) {
            System.out.println("Warrior " + getName() + " use a strong beat!");
        }
        System.out.println("Warrior " + getName() + " deals " + randomDamage + " damage to " + enemy.getName());
    }

    public int doubleDamageChance(int initDamage) {
        int a = new Random().nextInt(10);
        // 40% chance
        if (a < 4) {
            return initDamage * 2;
        } else {
            return initDamage;
        }
    }
}
