package HW1_5;

public class Main {
    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivan Ivanov", "Marketolog", "ivanov@yandex.ru", "89261234567", "50.000 RUB", 32);
        persArray[1] = new Employee("Sergey Sergeev", "Programist", "sergeev@yandex.ru", "89621234567", "55.000 RUB", 28);
        persArray[2] = new Employee("Andrey Smirnov", "Designer", "smirnov@yandex.ru", "89991234567", "45.000 RUB", 29);
        persArray[3] = new Employee("Oleg Petrov", "Driver", "petrov@yandex.ru", "89871234567", "30.000 RUB", 45);
        persArray[4] = new Employee("Fedor Fedorov", "Director", "fedorov@yandex.ru", "89451234567", "80.000 RUB", 50);

        for(int i = 0; i < persArray.length; i++) {
            if(persArray[i].getAge() > 40) {
                persArray[i].info();
            }
        }
            /*persArray[0].info();
            persArray[1].info();
            persArray[2].info();
            persArray[3].info();
            persArray[4].info();*/
            }
        }
