// Q1: Method overriding - Animal and Cat
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat barks: Woof! Woof!");
    }
}

public class Q01_Animal_Cat {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Animal c = new Cat();   // runtime polymorphism
        c.makeSound();
    }
}
