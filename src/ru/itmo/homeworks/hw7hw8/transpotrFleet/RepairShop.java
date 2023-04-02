package ru.itmo.homeworks.hw7hw8.transpotrFleet;
//"Ремонтная мастерская" (отдельный класс) хранит следующую информацию:
//
//массив транспортных средств (одновременно в мастерской может находиться до 10 транспортных средств);
//массив строк - названия цветов.
//Методы класса "ремонтная мастерская":
//
//добавить транспортное средство в массив;
//
//ремонтировать транспортные средства - все транспортные средства,
// находящиеся в массиве ремонтируют + автомобили перекрашивают
// (случайный цвет выбирать из массива с названиями цветов). После ремонта все элементы массива с
// транспортными средствами заменяются дефолтными значениями.

public class RepairShop {
    private Transport[] types;
    private String[] colors;
    private int i;


    public void setTypes(){
        types = new Transport[10];
    }
    public void transport(Transport type) {
        if (type == null) {
            System.out.println("В мастерской ремонтируют транспорт");
            return;
        }

        if (types.length == /*>=*/ i) {
            System.out.println(type + "Все места заняты");
            return;
        }
        types[i] = type;
        i++;
    }
    // перебрать массив вызвать метод ремонт со своей реализацией
    public void transportRepair(){
        for ( i = 0; i == types.length-1; i++) {
            types[i].repair();
            types[i] = null;
        }

    }
    public void setColors(){
        //colors =  {"white", "blue", "yellow", "green"};
        colors[0] = "blue";
        colors[1] = "yellow";
        colors[2] = "red";
        colors[3] = "black";
        colors[4] = "green";}
    public String changeColor(Transport type){
        type.color = colors[(int) (Math.random() * 5)];
}




}
