package hw03;
//Вывести на экран первые 10 элементов последовательности 2 4 6 8 10 и тд
public class Task01 {
    public static void main(String[] args) {
        int a=0, b=1;
        while (b <= 10) {
            a += 2;
            b++;
            System.out.println(a);
        }
    }
}
