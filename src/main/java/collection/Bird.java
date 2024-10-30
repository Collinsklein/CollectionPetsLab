package collection;

public class Bird extends Pet {
    public Bird(String name) {
        super(name);
        this.name = name;

    }

    @Override
    public void speak() {
        System.out.println("Quack! Quack!");
    }
}
