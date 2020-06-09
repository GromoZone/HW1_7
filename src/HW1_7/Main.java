package HW1_7;

public class Main {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Барсик", 5, 10);
        catsArray[1] = new Cat("Мурзик", 7, 15);
        catsArray[2] = new Cat ("Рыжик", 10, 20);

        Plate plate = new Plate(22);

        plate.info();
        catsArray[0].eat(plate);
        catsArray[1].eat(plate);
        catsArray[2].eat(plate);
        plate.info();
        catsArray[0].info();
        catsArray[1].info();
        catsArray[2].info();
    }
}
