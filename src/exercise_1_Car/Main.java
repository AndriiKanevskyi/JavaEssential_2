package exercise_1_Car;
/*
Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас Машина з полями рік(int), колір(String).
Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.
 */
public class Main {
    public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car(2001);
        Car car3= new Car(2001,"Green");
    }
}
