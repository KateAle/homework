package ru.itmo.homeworks.hw7hw8.transpotrFleet;

//уровень износа (изначально 0);
 //  номер (обязательное свойство, значение которого нельзя изменить);
//  цвета автомобилей могут быть разными. Остальные транспортные средства
// У автомобиля должна быть возможность изменить цвет.
public class Car extends Transport implements Repair{

 //public final int number;
 private int level;
 private final int number;


   public Car (int number, String color, int level) {
       super(number, color, level);
       this.number=number;
  }

  //@Override
  //public void setNumber(int number);{
  //       this.number = number;
  //   }


    @Override
    public void repair(){
        System.out.println("Машина в ремонте");
        if (level >0){
        this.level = level - 1;
    }}
}
