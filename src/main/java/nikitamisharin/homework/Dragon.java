package org.example;

import java.util.Random;

public class Dragon extends Enemy implements Mortal {
    private int flamePower;

    public Dragon(String name, int health) {
        super(name, health);
    }

    public int getFlamePower() {
        return flamePower;
    }

    public void setFlamePower(int flamePower) {
        this.flamePower = flamePower;
    }

    @Override
    public void attackHero(Hero hero) {
        int a = new Random().nextInt(10);
        hero.takeDamage(a);
        System.out.println("Dragon " + getName() + " deals " + a + " damage to " + hero.getName());
        // 50% chance
        if (a < 5) {
            hero.setHealth(0);
            System.out.println("The dragon burned everything with its flame, including the hero " + hero.getName());
        }
    }

    @Override
    public boolean isAlive() {
        if (getHealth() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
