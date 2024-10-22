// Поскольку оба - и Hero, и Enemy по сути являеются Mortal (имеют баллы здоровья и могут погибнуть)
// они оба будут наследоваться от абстрактного класса-бойца Fighter, который имплементит Mortal.
public abstract class Fighter implements Mortal{
    private double healthPoints;
    
    public Fighter(double healthPoints){
        this.healthPoints = healthPoints;
    }

    public double getHealthPoints(){
        return this.healthPoints;
    }

    public void setHealthPoints(double newHealthPoints){
        this.healthPoints = newHealthPoints;
    }

    public boolean isAlive(){
        return healthPoints > 0;
    }
   
    // У Enemy этот метод несколько иной - поскольку враг может воскреснуть (я решила реализовать воскрешение автоматическое)
    public void takeDamage(double damagePoints) {
        if (this.isAlive())
            this.healthPoints -= damagePoints;
    }

    // Данный метод является абстрактным, поскольку каждый из воинов атакует разными способами
    public abstract void attack(Fighter toAttack);
}
