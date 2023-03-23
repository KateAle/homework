package hw03;

import java.util.Scanner;

//Программа загадывает число в диапазоне [1;9]
//Пользователь вводит число с клавиатуры
//Программа в зависимости от введенного числа выводит в консоль следующее:
//"загаданное число больше"
//"загаданное число меньше"
//"Вы угадали" (программа завершает работу)
//Если введен 0, выввести "выход из программы" (программа завершает работу)
public class Task03 {
    public static void main(String[] args) {
        int w = 1 + (int) (Math.random() * 9) ;

        Scanner input = new Scanner( System.in);
        System.out.println("Введите число от 1  до 9");

        int userNumber = input.nextInt();

        while ( w != userNumber) {
            if (userNumber == 0) break;
            if ( userNumber < w) System.out.println( "Загаданное число больше "+userNumber);
            else if ( userNumber > w) System.out.println( "Загаданное число меньше "+userNumber);
            System.out.println( "Следующая попытка : ");
            userNumber = input.nextInt();
        }
        if (userNumber !=0 ) System.out.println( "Вы угадали число  " + w);
    }
}
