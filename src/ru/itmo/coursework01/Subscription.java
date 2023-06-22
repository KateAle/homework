package ru.itmo.coursework01;


import java.text.SimpleDateFormat;
import java.time.*;

public class Subscription {
    public Type type;
    private final int number;
    private LocalDate dateStart;
    private LocalDate dateEnd;

    public String owner;

    public Subscription(int ownerId, Type type, String start) {
        owner = Members.members[ownerId-1];
        number = ownerId;
        this.type = type;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        dateStart = LocalDate.parse(start);
        dateEnd = dateStart.plusDays(type.getLimit());
    }
    public LocalDate getDateStart() {return dateStart;}

    public LocalDate getDateEnd(LocalDate dateStart){
        return dateStart.plusDays(type.getLimit());}

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
        System.out.println("Действует с "+ dateStart + " по "+ dateEnd );//dateStart.plusDays(type.getLimit())
    }

}