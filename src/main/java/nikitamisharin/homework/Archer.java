package org.example;

public class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " fired an arrow at the enemy!");
        enemy.takeDamage(7);
    }
}
