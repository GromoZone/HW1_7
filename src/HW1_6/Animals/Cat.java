package HW1_6.Animals;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void swim(int dist) {
        System.out.println(name + " не умеет плавать!!!");
    }
}
