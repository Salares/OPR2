package pred1.Animals;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Sheila",GENDER.FEMALE,"Persian cat", "Gray", 1000, 50);
        cat.eat();
        cat.move();
        cat.makeNoise();
        cat.feedYounglings();
        cat.throwDownThings();
        cat.buyMeSomeFood(150);
        System.out.println(cat.toString());
    }
}
