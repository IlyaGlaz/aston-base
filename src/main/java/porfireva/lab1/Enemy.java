public abstract class Enemy extends Fighter{
    private boolean reincarnationAbility;
    private int reincarnationNumber;

    public Enemy(double healthPoints, boolean reincarnationAbility) {
        super(healthPoints);
        this.reincarnationAbility = reincarnationAbility;
        this.reincarnationNumber = 3;
    }

    @Override
    public void takeDamage(double damagePoints){
        if (super.isAlive()){
            super.setHealthPoints(super.getHealthPoints() - damagePoints);
            if( !this.isAlive() && this.reincarnationAbility)
                this.reincarnate();
        }
    }

    protected void reincarnate(){
        if (this.reincarnationNumber > 0)
        {
            super.setHealthPoints(100);
            this.reincarnationNumber--;
        }
            
    }
}
