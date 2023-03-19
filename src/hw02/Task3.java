package hw02;
// Задача на IF
//
//Дан номер месяца, например int month = 5.
// В зависимости от данного значения вывести в консоль время года
public class Task3 {
    public static void main(String[] args) {
        int month = 9;
        if ( month == 1  || month == 2 || month == 12) System.out.println("Winter");
        else if ( month >=3 && month <= 5) System.out.println("Spring");
        else if ( month >=6 && month <=8 ) System.out.println("Summer");
        else System.out.println("Autumn");

    }
}
