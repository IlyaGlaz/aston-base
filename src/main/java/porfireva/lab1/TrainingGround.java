public class TrainingGround {
    public static void main(String[] args) {
        Hero archerDemo = new Archer("Legolas", 10, 10);
        Hero mageDemo = new Mage("Gandalf", 10, 12);
        Hero warriorDemo = new Warrior("Aragorn", 10.2);

        System.out.println("Archer name: " + archerDemo.getName() + " HP: " + archerDemo.getHealthPoints());
        System.out.println("Mage name: " + mageDemo.getName() + " HP: " + mageDemo.getHealthPoints());
        System.out.println("Warrior name: " + warriorDemo.getName() + " HP: " + warriorDemo.getHealthPoints());

    }
}
