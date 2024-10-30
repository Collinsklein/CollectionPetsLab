package collection;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
       this.name = name;

    }

    @Override
    public void speak() {
        System.out.println("Wuu! Wuu!");
    }
}
