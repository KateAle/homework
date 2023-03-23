package hw03;
//Пользователь загадывает число в диапазоне от [2 до 100]
// Программа пытается его угадать (используйте метод бинарного поиска, т.е деление отрезка на 2).
// Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...? и в зависимоти от ответа пользователя принимать решения.
// Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
// Подумайте, что можно сделать, если пользователь загадает число вне указанного диапазона.


import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите нижнюю границу диапазона: ");
        int low = in.nextInt();
        System.out.println("Введите верхнюю границу диапазона: ");
        int high  = in.nextInt();
        System.out.println( "Загадайте число в выбранных пределах: ");
        int userNumber = in.nextInt();
        if (userNumber < low || userNumber > high) System.out.println("Неверный ввод");

        while  (low <= high ) {
            int mid = ( low + high) / 2;
            System.out.println( "Загаданное число равно "+ mid + " ?  1-ДА  0-НЕТ");
            int q = in.nextInt();

            if ( q == 1) {System.out.println( "Вы загадали число "+ mid); break;}
            else  {
                System.out.println( "Загаданное число больше "+ mid + " ?  1-ДА  0-НЕТ");
                q = in.nextInt();
                if ( q == 1 ) low = mid +1;
                else high = mid -1;
            }
        }
}}
