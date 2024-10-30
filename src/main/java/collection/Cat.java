package collection;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
        this.name = name;

    }

    @Override
    public void speak() {
        System.out.println("Meow! Meow!");
    }
}

