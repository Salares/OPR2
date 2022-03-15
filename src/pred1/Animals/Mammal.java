package pred1.Animals;

public abstract class Mammal{
    public String name;
    public GENDER gender;
    private String race;
    private String color;
    private int foodSupply;
    private int foodConsumption;

    public Mammal(String name, GENDER gender, String race, String color, int foodSupply, int foodConsumption) {
        this.name = name;
        this.gender = gender;
        this.race = race;
        this.color = color;
        this.foodSupply = foodSupply;
        this.foodConsumption = foodConsumption;
    }

    public void feedYounglings() {
        System.out.print("is feeding younglings.\n");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", race='" + race + '\'' +
                ", color='" + color + '\'' +
                ", foodSupply=" + foodSupply +
                ", foodConsumption=" + foodConsumption +
                '}';
    }

    public int getFoodSupply() {
        return foodSupply;
    }

    public int getFoodConsumption() {
        return foodConsumption;
    }

    public void setFoodSupply(int foodSupply) {
        this.foodSupply = foodSupply;
    }

    public void setFoodConsumption(int foodConsumption) {
        this.foodConsumption = foodConsumption;
    }
}
