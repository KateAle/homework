package hw02;

// Задача на Math.random() и IF
//Самостоятельно разобрать как работает Math.random() и написать код,
// который будет проверять попало ли случайно сгенерированное целое число из
// отрезка [10;500] в интервал (25;200) и выводить результат в консоль.
//[10;500] - квадратные скобки означают, что числа включены в диапазон.
// (25;200) - круглые скобки означают, что числа не включены в диапазон
//Примеры работы программы:
//
//Число 345 не содержится в интервале (25;200)
//Число 110 содержится в интервале (25;200)

public class Task5 {
    public static void main(String[] args) {

        int num01 = 10 + (int) (Math.random () * 491); // случайное целое в диапазоне [10;500]

        if ( num01 <= 25 || num01 >= 200 ) System.out.println("Число "+num01+" не содержится в интервале (25;200)");
        else System.out.println("Число "+num01+" содержится в интервале (25;200)");


    }
}
