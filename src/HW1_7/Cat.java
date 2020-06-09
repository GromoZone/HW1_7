package HW1_7;

public class Cat {
    private String name;
    private int appetite;
    private int sitost;
    private boolean hungry;
    {
        hungry = false;
    }
    public Cat(String name, int appetite, int sitost) {
        this.name = name;
        this.appetite = appetite;
        this.sitost = sitost;
    }
    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }
    public void info () {
        System.out.println(name + " съел " + appetite + " вискаса из тарелки");
    }
}

