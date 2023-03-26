package hw05;

import java.util.Arrays;

///Создать массив, наполнить его целыми числами (отрицательными и положительными).
// Отрицательные элементы массива скопировать в новый массив.
//
//Размер массива должен быть равен количеству отрицательных элементов.
public class Task05 {
    public static void main(String[] args) {
        int[] arr05 = new int[10];
        System.out.print("Полученный массив: ");
        for (int i = 0; i < arr05.length; i++) {
            if (arr05[i] == 0) {
                arr05[i] = -10 + (int) (Math.random() * 20);
                System.out.print(arr05[i] + " ");
            }
        }//массив заполнен
        System.out.print("\n");

        Arrays.sort(arr05); //массив отсортирован
        System.out.println(Arrays.toString(arr05));
        int count = 0 ;
            for ( int i: arr05) {
                 if ( i < 0) count++;
                 }

            int[] newArr05 = Arrays.copyOf(arr05, count);
            System.out.println(Arrays.toString(newArr05));
    }
}
