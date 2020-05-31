package HW1_5;

public class Employee {
    String name;
    String prof;
    String email;
    String phone;
    String money;
    int age;

    public Employee(String name, String prof, String email, String phone, String money, int age) {
        this.name = name;
        this.prof = prof;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }

    public void info() {
        System.out.println(name + ", " + prof + ", " + email + ", " + phone + ", " + money + ", " + age);
    }

    public int getAge() {
        return age;
    }
}
