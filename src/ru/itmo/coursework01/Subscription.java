package ru.itmo.coursework01;

import java.text.SimpleDateFormat;
import java.util.*;
import java.time.*;

public class Subscription {
    private Type type;
    private final int number;
    private LocalDate date1;
    private LocalDate date2;
    private final String name;
    private final int year;

    public LocalDate getDate1() {
        return date1;
    }

    public LocalDate getDate2() {
        return date2;
    }


    //Calendar cl = Calendar. getInstance();


    enum Type {ONE_DAY, MORNING, FULL}

    public Subscription(Type type, int number, String start, String name, int year) { //Calendar date2,
        this.type = type;
        this.number = number;
        date1 = LocalDate.parse(start);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (type == null) {
            System.out.println("Укажите тип абонемента");
        } else if (type == Type.ONE_DAY) {//бассейн и тренажерный зал с 8 до 22
            date2 = date1;
        }
        if (type == Type.MORNING) {
            date2 = date1.plusMonths(6);// абонемент действует 6 месяцев
        }

        if (type == Type.FULL) {//тренажерный зал, бассейн и групповые занятия с 8 до 22 часов.
            date2 = date1.plusMonths(6);// абонемент действует 6 месяцев
        }
        this.name = name;
        this.year = year;
    }

    public Type getType() {
        return type;
    }

    public void setDate1() {
        this.date1 = date1;
    }


    public int getNumber() {
        if (number < 0) {
            throw new IllegalArgumentException("Exception: у абонемента должен быть номер!");
        }
        return number;
    }


    public String getName() {
        if (name == null) {
            throw new IllegalArgumentException("Exception: не указаны имя и фамилия владельца!");
        }
        return name;
    }

    public int getYear() {
        if (year < 0) {
            throw new IllegalArgumentException("Exception: не указан год рождения!");
        }
        return year;
    }

}