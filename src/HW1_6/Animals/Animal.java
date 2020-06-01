package HW1_6.Animals;

public class Animal {
    String name;
    String color;
    int age;
    private String type;
    private int maxSwim;

    public void info() {
        System.out.println(name + " " + color + " " + age);
    }
    public void run(int dist) {
        System.out.println(this.name + " пробежал " + dist + " метров");
    }

    public void swim(int dist) {
        System.out.println(this.name + " проплыл " + dist + " метров");
    }
}
