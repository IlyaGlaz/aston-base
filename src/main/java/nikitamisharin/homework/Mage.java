package org.example;

public class Mage extends Hero {
    private final static int DAMAGE = 12;

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Wizard " + getName() + " has cast a spell on " + DAMAGE + " on the " + enemy.getName());
        enemy.takeDamage(DAMAGE);
        healHimself();
    }

    public void healHimself() {
        if (super.getHealth() < 10) {
            super.setHealth(20);
            System.out.println("The wizard healed himself!");
        }
    }
}
