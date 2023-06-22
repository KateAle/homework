package ru.itmo.coursework01;

import java.time.LocalDate;
import java.time.LocalTime;

public enum Type {
    ONE_DAY(LocalTime.of(8, 0), LocalTime.of(22, 0), 1),
    MORNING(LocalTime.of(8, 0), LocalTime.of(16, 0), 120),
    FULL(LocalTime.of(8, 0), LocalTime.of(22, 0), 120);
    private LocalTime start; // начиная с этого времени можно попасть в фитнес
    private LocalTime end; // можно находиться в зале по указанное время
    private int limit; // срок действия в днях


    Type(LocalTime start, LocalTime end, int limit) {
        this.start = start;
        this.end = end;
        this.limit = limit;
    }

    public LocalTime getStart() {
        return start;
    }

    public LocalTime getEnd() {
        return end;
    }

    public int getLimit() {
        return limit;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}







/*
    ONE_DAY, MORNING, FULL;
    private LocalTime limit;
    private static LocalDate endDate;
    private static Type type;

    public static LocalDate getEndDate(Type type, LocalDate date1) {
            if (type == ONE_DAY) {
                endDate = date1;
            }
            else if (type == MORNING || type == FULL) {
                endDate = date1.plusMonths(6);
            } else System.out.println("ошибка");
            return endDate;

    }
    public LocalTime getLimit(Type type) {
       // for (Type type : values()) {
            if (type == MORNING) {
                limit = LocalTime.parse("16:00");
            }
            else { limit = LocalTime.parse("23:00");
            }
        return limit;
    }
}*/



