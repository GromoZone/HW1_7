package HW1_6;

import HW1_6.Animals.Cat;
import HW1_6.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "рыжего цвета", 2);
        cat.info();
        cat.run (200);
        cat.swim(50);

        Dog dog = new Dog("Полкан", "черного цвета", 5);
        dog.info();
        dog.run (500);
        dog.swim(10);

    }
}
