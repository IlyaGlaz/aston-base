package org.example;

public abstract class Enemy implements Mortal {
    private int health;
    private String name;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    public abstract void attackHero(Hero hero);

    @Override
    public boolean isAlive() {
        if (getHealth() > 0 ) {
            return true;
        } else {
            return false;
        }
    }
}
