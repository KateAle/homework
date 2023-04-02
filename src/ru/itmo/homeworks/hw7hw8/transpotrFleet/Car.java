package ru.itmo.homeworks.hw7hw8.transpotrFleet;

//уровень износа (изначально 0);
 //  номер (обязательное свойство, значение которого нельзя изменить);
//  цвета автомобилей могут быть разными. Остальные транспортные средства
// У автомобиля должна быть возможность изменить цвет.
public class Car extends Transport implements Repair{

 //public final int number;
 private int level;


   public Car (int number, String color, int level) {
   this.number = number;//final
   super(color);
   super(level);
  }

  @Override
  public int getNumber();{
         return number;
     }

    @Override
    public void repair(){
        System.out.println("Машина в ремонте");
        if (level >0){
        this.level = level - 1;
    }}
}
