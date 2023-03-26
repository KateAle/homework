package hw04;

import java.util.Scanner;

//Считывать с консоли строки до тех пор, пока пользователь не введёт "exit".
// Каждую полученную строку приводить к виду:
// первая заглавная, остальные маленькие и выводить в консоль.
// Пробелов в начале и конце строки быть не должно.
public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine(); //ввод с консоли
        while (!str.equalsIgnoreCase("exit")) {
            str = str.trim();
            str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
            System.out.println(str);
            str = in.nextLine();
        }
    }
}