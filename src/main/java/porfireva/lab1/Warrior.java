public class Warrior extends Hero{
    private int deathCount;
    //по задумке у кадого воина счетчик свой
    
    public Warrior(String name, double healthPoints){
        super(name, healthPoints);
        this.deathCount = 0;
    }

    public int getDeathCount() {
        return this.deathCount;
    }

    public void attack(Fighter toAttack){
        int damage = this.deathCount + 1;
        toAttack.takeDamage(damage);
        if (!toAttack.isAlive())
            this.deathCount++;
    }
}
