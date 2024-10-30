package collection;

public class Pet implements Comparable<Pet> {
    public Pet(String name) {
        this.name = name;
    }

    // Instance variable for the pet's name
    public String name;
    // Constructor to initialize the pet's name
//        public Pet(String name) {
//            this.name = name;
//        }


    // Getter method for name
    public String getName() {
        return this.name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Speak method to be overridden by subclasses
    public  void speak()
    {System.out.println("The pet makes a sound." );

    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pet o)
    {return this.name.compareTo(o.getName());
    }
}
