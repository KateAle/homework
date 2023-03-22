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
        /*System.out.println( "Введите число от 2 до 100: ");

        int userNumber = in.nextInt();
        int x = 100, a=2, n=0 ;
        if (userNumber < 2 || userNumber > 100) System.out.println("Неверный ввод");
        else {
            //for ( int x = 100 ; x != userNumber ; x = x / 2 ) {
                System.out.println( "Загаданное число равно "+ x + " ?");
                System.out.println( "1-ДА  0-НЕТ");

                 int que = in.nextInt();
                 if ( que == 1) System.out.println( "Число отгадано");
                 if ( que == 0) {

                     while ( que != 1) {

                         x = x / a;
                         System.out.println( "Загаданное число равно "+ x + " ?");
                         que = in.nextInt();
                         //if ( que == 1) System.out.println( "Число отгадано");
                         if ( que == 0)


                         x = x + x / (int) Math.pow( a, n);


                 }
            }
        }*/

        int x = 50, n=2;
        int q1 = 0, q2= 0 ;

        while ( q1 == 0) {
            System.out.println( "Загаданное число равно "+ x + " ?"); //вопрос 1
            System.out.println( "1-ДА  0-НЕТ");

            q1 = in.nextInt(); //ответ 1
            if ( q1 == 1) break;

            System.out.println( "Загаданное число больше "+ x + " ?"); //вопрос 2
            System.out.println( "1-ДА  0-НЕТ");

            q2 = in.nextInt(); //ответ 1

                if (q2 == 1) x= x + 50 / n;
                else { x= x- 50/n;
                }
            n *=n;
        if ( q1 == 1) System.out.println( "Вы загадали число "+ x );


    }





}}
