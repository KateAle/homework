package hw05;
//Заполните массив на N элементов (размер массива вводит пользователь)
// случайным целыми числами и выведете максимальное,
// минимальное и среднее арифметическое значение элементов массива

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[] arr01 = new int[5];
        System.out.print("Полученный массив: ");
            for (int i = 0; i < arr01.length; i++) {
            if (arr01[i] == 0) {
                arr01[i] = (int) (Math.random() * 30);
                System.out.print(arr01[i] + " ");
            }
            }
            System.out.print("\n");
            int max = arr01[0];
            int min = arr01[0];
            int mid = 0;
            for (int i = 0; i < arr01.length ; i ++) {
                mid  += arr01[i];
                if (arr01[i] > max) max = arr01[i];
                else if (arr01[i]< min) min = arr01[i];
            }
        System.out.println("Максимальное значение : " + max);
        System.out.println("Минимальное значение : " + min);
        System.out.println("Среднее арифметическое : " + mid/ arr01.length);
    }
}
