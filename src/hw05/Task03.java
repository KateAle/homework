package hw05;

import java.util.Scanner;
import java.util.Arrays;

//Задать массив на N слов. В цикле считывать с консоли слова (scanner.nextLine()),
// и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
// В итоге в массиве будут только уникальные слова.
// Выход из программы по слову exit (слово 'exit' в массив не добавлять) или если массив заполнен.
// Перед завершением программы, вывести получившийся массив в консоль
public class Task03 {
    public static void main(String[] args) {
        String[] arr03 = new String[5]; //пустой массив
        Scanner in = new Scanner(System.in);
        System.out.println("Введите элементы массива. Для выхода введите exit:");

         for (int i = 0; i < arr03.length; i++) {
            String a = in.nextLine(); //ввод с консоли
            if (a.equals("exit")) break;
            else { arr03[i] = a ;
                for (int i1 = 0; i1 < i; i1++) {
                    if (a.equals(arr03[i1]) && i!=0) {
                        i--;
                        System.out.println("Повтор");
                        break;}
                }
            }
        }

        for (int i = 0; i < arr03.length; i++) {System.out.print(arr03[i] + " ");}


    }
}
