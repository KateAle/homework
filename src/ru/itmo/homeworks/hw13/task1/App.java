package ru.itmo.homeworks.hw13.task1;
//Создать экземпляр PairContainer, где key - любые числа, value - строка
//Создать экземпляр PairContainer, где key - строка, value -
// тип User, у которого id - любые числа
//Создать экземпляр PairContainer, где key - строка, value -
// тип PairContainer, у которого key - любые числа,
// value - тип User, у которого id - строка
public class App {
    public static void main(String[] args) {

        PairContainer<Number, String> pc01 = new PairContainer<>();
        pc01.setValue("ftlk");
        pc01.setKey(35);


       PairContainer<String, User<Number>> pc02 = new PairContainer<>();
        pc02.setKey("hgfy");
        User<Number> user01 = new User<>();
        pc02.setValue(user01);


        PairContainer <String, PairContainer<String, User<String>>> pc03 = new PairContainer<>();
        pc03.setKey("gvyg");
        User<String> user02 = new User<>();
        PairContainer<String, User<String>> pc04 = new PairContainer<>();
        pc03.setValue( pc04);

    }
}
