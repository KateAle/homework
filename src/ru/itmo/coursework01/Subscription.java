package ru.itmo.coursework01;


import java.text.SimpleDateFormat;
import java.time.*;

public class Subscription {
    public Type type;
    private final int number;
    private LocalDate dateStart;
    //private LocalDate date2;
    //public int index;
    public String owner;

    public Subscription(int ownerId, Type type, String start) {
        //this.owner = owner;
        owner = Members.members[ownerId-1];
        number = ownerId;
        //index= number-1;
        this.type = type;
        //this.number = number;
        //type = Type.getType();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dateStart = LocalDate.parse(start);
    }
    public LocalDate getDateStart() {return dateStart;}
//    public LocalDate getDate2() {
//        date2 = type.getEndDate(getDate1());
//        return date2;
//    }

   public String getOwner() {
      return owner;
   }
   public int getNumber() {
        if (number < 0) {
            throw new IllegalArgumentException("Exception: у абонемента должен быть номер!");
        }
        return number;
    }

    public Type getType() {
        return type;
    }

    public void getInfo() {
        System.out.println(getOwner());
        System.out.println("Абонемент номер: "+getNumber()+"     Тип: "+ type);
        System.out.println("Действует с "+ dateStart + " по "+ Type.getEndDate(type,dateStart));
    }

}