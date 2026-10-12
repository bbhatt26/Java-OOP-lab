// Q9: Abstract Animal with eat() and sleep()
abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat (hunts in a pride).");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps up to 20 hours a day.");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger eats meat (hunts alone at night).");
    }

    @Override
    void sleep() {
        System.out.println("Tiger sleeps about 16 hours a day, hidden in dense cover.");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass, leaves and fruits (herbivore).");
    }

    @Override
    void sleep() {
        System.out.println("Deer takes short naps and stays alert for predators.");
    }
}

public class Q09_AbstractAnimal_Eat_Sleep {
    public static void main(String[] args) {
        Animal[] animals = { new Lion(), new Tiger(), new Deer() };
        for (Animal a : animals) {
            System.out.println("--- " + a.getClass().getSimpleName() + " ---");
            a.eat();
            a.sleep();
        }
    }
}
