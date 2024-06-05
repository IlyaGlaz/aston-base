public class BattleGround {
    public static void main(String[] args)  {
        Enemy zombieBob = new Zombie(100, 26);
        Enemy zombieJack = new Zombie(50, 70);
        Enemy zombieIvan = new Zombie(40, 88);

        Archer archer = new Archer("Legolas", 100, 10);
        Mage mage = new Mage("Gandalf", 70, 12);
        Warrior warrior = new Warrior("Aragorn", 91.2);

        System.out.println("Before attack mage named " + mage.getName() + " is wise at rate:  " + mage.getWisdom());
        mage.attack(zombieIvan);
        System.out.println("After attack mage named " + mage.getName() + " is wise at rate:  " + mage.getWisdom());
        System.out.println("Zombie Ivan is alive: " + zombieIvan.isAlive() + ", HP is " + zombieIvan.getHealthPoints());

        //warrior убивает двух врагов
        while(zombieJack.isAlive())
        {
            warrior.attack(zombieJack);
        }

        archer.attack(zombieBob);
        while(zombieBob.isAlive())
            {
                warrior.attack(zombieBob);
            }
           
        System.out.println("Warrior " + warrior.getName() + " has death count of " + warrior.getDeathCount() + " and HP is " + warrior.getHealthPoints());
        //у всех зомби атака одинаковая, так что демонстрация на одном
        zombieIvan.attack(warrior);
        System.out.println("Warrior " + warrior.getName() + " new HP is " + warrior.getHealthPoints());
    }
}
