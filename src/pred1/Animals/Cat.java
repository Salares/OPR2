package pred1.Animals;

public class Cat extends Mammal implements Animal{

    public Cat(String name, GENDER gender, String race, String color, int foodSupply, int foodConsumption) {
        super(name, gender, race, color, foodSupply, foodConsumption);
    }

    public void throwDownThings() {
        System.out.println("Makes bordel");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }

    @Override
    public void move() {
        System.out.println("Moves");
    }

    @Override
    public void eat() {
        this.setFoodSupply(this.getFoodSupply() - this.getFoodConsumption());
        System.out.println("Eats " + this.getFoodConsumption() + ", " + this.getFoodSupply() + " food left.");
    }

    @Override
    public void feedYounglings() {
        System.out.print("Cat ");
        super.feedYounglings();
    }

    public void buyMeSomeFood(int amount) {
        this.setFoodSupply(this.getFoodSupply() + amount);
        System.out.println("Bought " + amount + " of food. Current food supply is " + this.getFoodSupply());
    }
}
