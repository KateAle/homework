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

public class RepairShop{
    public Transport[] array;
    //public final String[] colors =  {"white", "blue", "yellow", "green", "red"};
    public int i;

    public RepairShop () {
        array = new Transport[10];
    }

    public void array(Transport type) {
        if (type == null) {
            System.out.println("В мастерской ремонтируют транспорт");
            return;
        }

        if (array.length == i) {
            System.out.println(type + "Все места заняты");
            return;
        }
        array[i] = type;
        i++;
    }

    // перебрать массив вызвать метод ремонт со своей реализацией
    public void transportRepair() {
        for (i = 0; i == array.length - 1; i++) {
            array[i].repair();
            array[i] = null;
        }
    }
    public void showArray(Transport[] array){
        System.out.println(array.toString());
    }
}
    /*public void setColors(){
        //colors =  {"white", "blue", "yellow", "green"};
        colors[0] = "blue";
        colors[1] = "yellow";
        colors[2] = "red";
        colors[3] = "black";
        colors[4] = "green";}*/



