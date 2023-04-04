package ru.itmo.homeworks.hw7hw8.transpotrFleet;

//уровень износа (изначально 0);
 //  номер (обязательное свойство, значение которого нельзя изменить);
//  цвета автомобилей могут быть разными. Остальные транспортные средства
// У автомобиля должна быть возможность изменить цвет.
public class Car extends Transport implements Repair{

    //public final int number;
 private int level;
 public String color;



 public Car (int number, String color, int level) {
       super(number, level);
       setColor(color);
  }


        public void setColor(String color){
        this.color = color;
        }


    @Override
    public void repair(){
        System.out.println("Машина в ремонте");
        if (level >0){
        this.level = level - 1;
    }}


    public String changeColor() {
        color = colors[(int) (Math.random() * 5)];
        return color;
    }

}
