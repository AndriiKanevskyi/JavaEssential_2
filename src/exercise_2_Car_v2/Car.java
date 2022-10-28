package exercise_2_Car_v2;
/*
Використовуючи Intelij IDEA, створити проект, пакет.(Наново!)
 Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
  Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-я, 4-а.
   Перевантажити конструктори.
    Створити клас Main, де створити екземляри класу Машина з різними параметрами.
 */
public class Car {

    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(int year) {
        this.year = year;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(double speed) {
        this.speed = speed;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(String color) {
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(int year, int weight) {
        this.year = year;
        this.weight = weight;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }


    public Car(int year, String color) {
        this.year = year;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car( String color, int year) {
        this.year = year;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car( double speed,int year) {
        this.year = year;
        this.speed = speed;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(double speed, String color) {
        this.speed = speed;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }
    public Car(String color,double speed) {
        this.speed = speed;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }
    public Car(int year,String color,double speed) {
        this.speed = speed;
        this.color = color;
        this.year=year;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(int year, int weight, String color) {
        this.year = year;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(int year,String color,int weight) {
        this.year = year;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(String color,int year,int weight) {
        this.year = year;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(String color,int year,double speed) {
        this.year = year;
        this.speed = speed;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(double speed,String color,int year) {
        this.year = year;
        this.speed = speed;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(double speed,int year, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(int year, int weight, String color,double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car(int year, int weight, double speed,String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }
    public Car( int weight, double speed,String color,int year) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

    public Car( String color,int weight, double speed,int year) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }
    public Car( int weight,String color, double speed,int year) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        System.out.println("Машина з вагою "+this.weight+", максималкою "+ this.speed+", роком продукції "+ this.year+", кольором "+ this.color+" створено");
    }

}
