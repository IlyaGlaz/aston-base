public abstract class Hero extends Fighter{
    private String name;

    Hero(String name, double healthPoints){
        super(healthPoints);
        this.name = name;
    }

    public String getName(){
         return this.name;
    }
}
