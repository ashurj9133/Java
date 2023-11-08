package onlineClasses;

class Animal {
    void makeSound1() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    
    void makeSound() {
        System.out.println("Bark");
    }

    void fetch() {
        System.out.println("Fetching a stick");
    }
}

public class Main {
    public static void main(String[] args) {
        // Upcasting: Treating a Dog object as an Animal reference
        Animal my = new Dog();

        // Calls the overridden method in Dog
        my.makeSound1();

        // Compilation error: Animal reference cannot access fetch()
        // myAnimal.fetch();

        // Downcasting: Converting back to Dog to access Dog-specific methods
//        if (myAnimal instanceof Dog) {
//            Dog myDog = (Dog) myAnimal;
//            myDog.fetch(); // This is now valid
//        }
    }
}

