package exercise_4_MyArea;
/*
Використовуючи Intelij IDEA, створити проект, пакет.
Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
який повинен приймати радіус та використовуючи PI порахувати площу кола.
Створити клас Main, де запустити цей метод.
 */
public class MyArea {
    static final double PI = 3.14;

    static double areaOfCircle(double radius){
       double calculatedArea=PI*(radius*radius);
       return calculatedArea;

    }



}
