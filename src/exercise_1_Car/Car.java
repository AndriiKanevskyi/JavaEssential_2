package exercise_1_Car;
/*
Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас Машина з полями рік(int), колір(String).
Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.
 */
public class Car {

    int year;
    String color;

    public Car() {
    }

    public Car(int y){
        this.year=y;
    }

    public Car(int y, String c){
        this.year=y;
        this.color=c;
    }
}
