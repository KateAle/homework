package hw02;
//Задача на тернарный оператор
//
//Дано целое число. Если оно чётное, выведите в консоль 0, если нет, то выведите в консоль -1;

public class Task2 {
    public static void main(String[] args) {
        int a= 57;
        int res= a % 2 == 0 ? 0 : -1;

        System.out.println(res);

    }
}
