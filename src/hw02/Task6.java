package hw02;

// Задача на SWITCH (ДЕЛАЙТЕ, ЕСЛИ РАЗБЕРЕТСЬ САМОСТОЯТЕЛЬНО ПО PDF ФАЙЛУ)
//Дана переменная sum - сумма покупки и переменна saleCode - номер купона.
//Если номер купона равен 4525 - вывести сумму с учетом скидки 30%
//Если номер купона равен 6424 или 7012 - вывести сумму с учетом скидки 20%
//Если номер купона равен 7647 или 9011 или 6612 - вывести сумму с учетом скидки 10%
//В остальных случаях скидка не предусмотрена, вывесть полную стоимость покупки.

public class Task6 {
    public static void main(String[] args) {
        double sum = 5467;
        String saleCode = "6612"; //4525 6424 7012 7647 9011 6612
        System.out.println("Номер купона "+ saleCode);


        switch ( saleCode) {
            case "4525" :
                //System.out.println("К оплате " + sum * 0.7);
                sum *= 0.7;
                break;
            case "6424" :
            case "7012" :
                //System.out.println("К оплате " +  sum * 0.8 );
                sum *= 0.8;
                break;
            case "7647" :
            case "9011" :
            case "6612" :
                //System.out.println("К оплате " +  sum * 0.9 );
                sum *= 0.9;
                break;
            default:
                //System.out.println("К оплате " + sum);
                sum *= 1;
        }
        // System.out.println(sum);

        String result = String.format("%.2f", sum);
        System.out.println("К оплате " + result);



    }
}
