abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // Concrete method
    public void eat() {
        System.out.println(name + " is eating");
    }

    // Abstract method (must be implemented by subclasses)
    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof!");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        myDog.eat();      // Inherited concrete method
        myDog.makeSound(); // Implemented abstract method
    }
}