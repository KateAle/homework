package ru.itmo.homeworks.hw7hw8.transpotrFleet;
//уровень износа (изначально 0);
//   Цвета автобусов могут быть разными, перекрасить нельзя).
//      У автобуса должен быть флаг - наличие wifi.
public class Bus extends Transport implements Repair{

    public boolean wifi;
    private int level;
    private final String color;



    public Bus (int number, String color, boolean wifi, int level) {
        super(number, level);
        this.wifi= wifi;
        this.color= color;
    }
    public Boolean getWifi(boolean wifi){
        return wifi;
    }
    //у автобуса снижается уровень износа (значение не может стать меньше 0) и добавляется wifi, если его нет;
    @Override
    public void repair(){
        System.out.println("Автобус в ремонте");

        if (level >0){
        this.level = level - 1;}
        if (!wifi){
            wifi = true;
        }

    }



}
