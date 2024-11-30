public class Zombie extends Enemy {
    private int decompositionRate;
    
    public Zombie(double healthPoints, int decompositionRate){
        super(healthPoints, true);
        this.decompositionRate = decompositionRate;
    } 

    @Override
    public void attack(Fighter toAttack) {
        double damage = (this.decompositionRate / 100d) * toAttack.getHealthPoints();
        toAttack.takeDamage(damage);
    }
}

