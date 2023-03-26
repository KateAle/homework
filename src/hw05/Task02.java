package hw05;
import java.util.Arrays;
//Создайте массив из чётных чисел [2;20] (использовать Math.random())
// и выведите элементы массива в консоль в обратном порядке (20 18 16 ... 4 2)
public class Task02 {
    public static void main(String[] args) {
        int[] arr02 = new int[5];
        System.out.print("Полученный массив: ");
        for (int i = 0; i < arr02.length; i++) {
            if (arr02[i] == 0) {
                int k = 2 + (int) (Math.random() * 20);
                if ( k % 2 == 0)  arr02[i] = k;
                else arr02[i] = k + 1;
            }
            System.out.print(arr02[i] + " ");
        }
        System.out.print("\n");

        for (int i = 0; i < arr02.length; i++) {
            System.out.print(arr02[(arr02.length-1) - i] + " ");
        }
    }
}
