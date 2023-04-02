package ru.itmo.homeworks.hw7hw8.transpotrFleet;

public class Application {
    public static void main(String[] args) {
        Train train01 = new Train(12,"blue", 4, 6);
        Bus bus01 = new Bus(4, "yellow", false,6);
        Car car01 = new Car(335, "red", 5);

        Train train02 = new Train(4, "red", 5, 4);
        RepairShop types = new RepairShop();
        types.setTypes();
        types.transport(train01);
        types.transport(bus01);
        types.transport(car01);
        System.out.println(types.toString());
        types.transportRepair();
        //car01.changeColour;
        System.out.println(types.toString());


    }
}
