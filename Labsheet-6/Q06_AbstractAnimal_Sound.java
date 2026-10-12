// Q6: Abstract class Animal with abstract sound()
abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars: Roarrr!");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Tiger growls: Grrrr!");
    }
}

public class Q06_AbstractAnimal_Sound {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        lion.sound();
        tiger.sound();
    }
}
