public class Archer extends Hero{
    private int shootRange;

    public Archer(String name, double healthPoints, int shootRange){
        super(name, healthPoints);
        this.shootRange = shootRange;
    }

    public void attack(Fighter toAttack){
        int damage = this.shootRange * 3;
        toAttack.takeDamage(damage);
    }
}
