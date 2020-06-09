package HW1_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int amount) {
        if (food < amount) {
            return false;
        } else {
            food -= amount;
            return true;
        }
    }
        public void info () {
            System.out.println("Тарелка: " + food);
        }
        public void plateGetFood (int amount){
        food += amount;
    }
}
