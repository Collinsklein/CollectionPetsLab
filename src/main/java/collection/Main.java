package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

        //Pseudo steps
        //Prompt the user to input the number of pets
//    public static void main(String[]args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many Pets Do you have ?");
//        int numberOfPets = scanner.nextInt();
//        //System.out.println(numberOfPets);
//        //For each pet they have , ask the type and name
//
//        System.out.println("Which type Pet Do you have ?");
//        String typeOfPet = scanner.nextLine();
//      //3
//        // scanner.close();
//
//        System.out.println("What is the name of the pet that you have ?");
//        String nameOfThePet = scanner.nextLine();
//        scanner.close();
//        //Store the information about the pets
//        Pet[] petsKind = new Pet[numberOfPets];
//        Pet[] petsNames = new Pet[numberOfPets];
//
//        for (int petIndex = 0; petIndex < numberOfPets; petIndex++) {
//            System.out.print("Enter the kind of pet " + (petIndex + 1) + ": ");
//           String pet = scanner.nextLine();
//
//           if (pet == "Dog") {
//               System.out.print("Enter the name of pet " + (petIndex + 1) + ": ");
//               //petsNames[petIndex] = scanner.nextLine();
//           }
//        }
//
//        System.out.println("Your pets are: ");
//        for (int petIndex = 0; petIndex < numberOfPets; petIndex++) {
//            System.out.println(petsKind[petIndex] + " named " + petsNames[petIndex]);
//        }
//
//
//
//    }
        public static int Pets() {

            Scanner petsInput = new Scanner(System.in);


            System.out.print("Enter the number of pets you have: ");
            int numberOfPets = petsInput.nextInt();
            petsInput.nextLine();

            Dog dog = new Dog("Box");
            dog.getName();

            Cat cat = new Cat("Paka");
            cat.getName();

            String[] petsKind = new String[numberOfPets];
            String[] petsNames = new String[numberOfPets];

            for (int i = 0; i < numberOfPets; i++) {
                System.out.print("Enter the kind of pet " + (i + 1) + ": ");
                petsKind[i] = petsInput.nextLine();

                System.out.print("Enter the name of pet " + (i + 1) + ": ");
                petsNames[i] = petsInput.nextLine();
                if (dog.name == "Dog") {
                    System.out.print("Enter the name of pet " + (i + 1) + ": ");
                    petsNames[i] = petsInput.nextLine();
                }
            }

            System.out.println("Your pets are: ");
            for (int petIndex = 0; petIndex < numberOfPets; petIndex++) {
                System.out.println(petsKind[petIndex] + " named " + petsNames[petIndex]);

            }


            System.out.println("Invalid input. Please enter a valid number for the number of pets.");

            return numberOfPets;
        }

        //Modify your program from part 1 to use the Pet class and its subclasses.
        // Keep a list of the pets your user lists and at the end of the program print out a list of their names and what they say when they speak.


        public static void main(String[] args) {
            // Pet pet = new Pet();


            List<Pet> pets = new ArrayList<>();

            pets.add(new Pet("Box"));
            pets.add(new Pet("Paka"));
            pets.add(new Pet("Ndege"));


            NameComparator nameComparator = new NameComparator();
            Collections.sort(pets, nameComparator);


            Collections.sort(pets);
            List<Dog> dogs = new ArrayList<>();
            //System.out.println(Pets());
            Dog dog1 = new Dog("Box");
            Dog dog2 = new Dog("Ches");
            Dog dog3 = new Dog("Patch");

            for (Dog d : dogs) {
                System.out.println(d);
                dog1.speak();
                System.out.println(dog2.getName());
            }
            Scanner petsInput = new Scanner(System.in);


            System.out.print("Enter the number of pets you have: ");
            int numberOfPets = petsInput.nextInt();
            petsInput.nextLine();
            String answer = petsInput.nextLine();

            if(answer.equals("AnimalType")){
                //list.add(Animal);
                pets.add(new Pet("Box"));
                pets.add(new Pet("Paka"));
                pets.add(new Pet("Ndege"));
            }



            for(Pet pet: pets){
                System.out.print(pet);
                pet.speak();
            }
//        Cat cat1 = new Cat("Paka");
//        for (Pet p : pets) {
//            //System.out.println(p);
//            cat1.speak();
//             System.out.println(p.getName());
//            }
//            Bird bird1 = new Bird("Shiff");
//            for (Pet p : pets) {
//                System.out.println(p);
//                bird1.speak();
//                System.out.println(p.getName());
//            }
        }
    }







    //part 2
    /*
    1. Create a petClass and subclass for three different types of pet
    2. The subclass will be; dog, cat, parrot
    3. Create a speakMethod that returns the sound of an animal
    4. Give it a name field/attribute/variable
    5. create a setter and getter to be able to access the pet name
    6. For each subclass override the speakMethod with the sound that the animal makes
    7. Access the name attribute in each subclass

       Part3
     1. For each pet print out the name and sound they produce

     */





/*
Part 1:
Create a program that asks the user how many pets they have.
Once you know how many pets they have, ask them what kind of pet each one is, along with each pet's name.


For now your program should just hold onto the user input and print out the list at the end; we'll modify this later


Part 2:
Create a Pet class, and a subclass for each type of pet that you want your program to support. Your classes should follow the following requirements:
You must support at least three types of pets.
Dog must be one of the types you support.
Cat must be one of the types you support.
The Pet class must have a speak method that each subclass overrides.
The Pet class must have a name field with setters and getters.


Part 3:
Modify your program from part 1 to use the Pet class and its subclasses.
Keep a list of the pets your user lists, and at the end of the program print out a list of their names and what they say when they speak.

 */

