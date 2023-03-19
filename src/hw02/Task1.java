package hw02;
// Задача на тернарный оператор
//
//Даны два целых числа. Выведите в консоль наибольшее из них. Если числа равны, выведите в консоль любое.

public class Task1 {
    public static void main(String[] args) {
        int a = 75;
        int b = 53;
        int c = a>=b ? a : b ;
        System.out.println(c);

    }
}
