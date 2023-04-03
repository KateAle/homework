package ru.itmo.homeworks.hw7hw8.transpotrFleet;

//уровень износа (изначально 0);
 // Поезд должен хранить информацию о количестве вагонов (поезд не может быть создан без вагонов).
  //        все поезда должны быть одинакового цвета.перекрасить нельзя).
public class Train extends Transport implements Repair{
    private int wagon;
    private final String color = "blue";
    private int level;


    public Train (int number, String color, int wagon, int level) {
        super(number, color, level);
        //setColor(color);//final
        setWagon(wagon);
    }

    public void setWagon(int wagon) {
        if (wagon < 0) {
            throw new IllegalArgumentException("Exception: wagon count!!");
        }
        this.wagon = wagon;
    }
    @Override
    public void repair(){
        System.out.println("Поезд в ремонте");
        if (level >0){
            this.level = level - 1;}
        wagon++;
    }

}
