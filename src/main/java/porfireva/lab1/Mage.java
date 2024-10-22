public class Mage extends Hero {
    private double wisdom; 

    public Mage(String name, double healthPoints, double wisdom){
        super(name, healthPoints);
        this.wisdom = wisdom;
    }

    public double getWisdom(){
        return this.wisdom;
    }

    public void attack(Fighter toAttack){
        double damage = Math.random() * this.wisdom;
        toAttack.takeDamage(damage);
        this.wisdom = damage + wisdom;
    }
}
