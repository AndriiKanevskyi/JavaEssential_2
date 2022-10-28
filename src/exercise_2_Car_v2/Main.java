package exercise_2_Car_v2;
/*
Використовуючи Intelij IDEA, створити проект, пакет.(Наново!)
 Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
  Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-я, 4-а.
   Перевантажити конструктори.
    Створити клас Main, де створити екземляри класу Машина з різними параметрами.
 */
public class Main {

    public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car("Red");
        Car car3= new Car(2018);
        Car car4 = new Car(205.5,2018);
        Car car5 = new Car(2018,205.5);
        Car car6 = new Car(2018,1700);
        Car car7 = new Car(2018,"white");
        Car car8 = new Car(205.5);
        Car car9 = new Car(205.5,"blue");
        Car car10 = new Car(2018,"black",205.5);
        Car car11 = new Car(2018,205.5,1700);
        Car car12 = new Car("red",205.5);
        Car car13 = new Car("red",2018);
        Car car14 = new Car(2001,"Green",205.5,1700);
        Car car15 = new Car(2018,"Green",1700);
        Car car16 = new Car(2018,1700,"Green");
        Car car17 = new Car("Green",2018,1700);
        Car car18 = new Car("Green",2018,205.5);
        Car car19 = new Car(205.5,"Grown",2018);
        Car car20 = new Car(2018,205.5,1700,"silver");
        Car car21 = new Car(205.5,2018,1700,"silver");
        Car car22 = new Car(1700,205.5,"gold",2018);
        Car car23 = new Car("gold",1700,205.5,2018);
        Car car24 = new Car(2018,1700,"gold",205.5);
        Car car25 = new Car(2018,1700,205.5,"yellow");

        System.out.println("Так, деякі машини ідентичні і це не мало сенсу =)");


    }
}
