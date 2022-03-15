package pred1.Animals;

public class Dog extends Mammal implements Animal{



    public Dog(String name, GENDER gender, String race, String color, int foodSupply, int foodConsumption) {
        super(name, gender, race, color, foodSupply, foodConsumption);
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark!");
    }

    @Override
    public void move() {
        System.out.println("Moves");
    }

    @Override
    public void eat() {
        System.out.println("Eats");
    }

    @Override
    public void feedYounglings() {
        System.out.print("Dog ");
        super.feedYounglings();
    }
}
