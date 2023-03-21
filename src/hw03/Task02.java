package hw03;

import java.util.Scanner;

//Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр
public class Task02 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        int userNum = a.nextInt();

        int sum = 0;
        while (userNum >= 10) {
            sum = userNum % 10 + sum; // прибавили единицы к сумме
            userNum /= 10;  // отбросили единицы
        }

        sum += userNum;

        System.out.println("Сумма цифр числа = "+ sum);
    }
}
