package ru.itmo.homeworks.hw7hw8.transpotrFleet;

public class Application {
    public static void main(String[] args) {
        Transport train01 = new Train(12,"blue", 4, 6);
        Transport bus01 = new Bus(4, "yellow", false,5);
        Transport car01 = new Car(335, "red", 7);
        Transport train02 = new Train(52,"blue", 4, 3);
        Transport bus02 = new Bus(6, "green", true,5);
        Transport car02 = new Car(328, "white", 0);

        RepairShop rep = new RepairShop();

        rep.array(train01);
        rep.array(bus01);
        rep.array(car01);
       //System.out.print(rep.array.toString());
        rep.transportRepair();
         //car01.changeColor();
        //System.out.println(rep.array.toString());


    }
}
