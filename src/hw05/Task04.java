package hw05;


import java.util.Arrays;

//Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины.
//
//Предложение для поска длинного слова: "в предложении все слова разной длины"
// (самостоятельно найти метод преобразования строки в массив строк).
public class Task04 {
    public static void main(String[] args) {
        String text = "в предложении все слова разной длины";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));
        String max = words[0];
        for ( int i = 1; i < words.length; i++ ) {
            if (words[i].length() > max.length()) {
                max = words[i];
            } else continue;
        }
        System.out.println("самое длинное слово в предложении - "+ max);
        }



    }
