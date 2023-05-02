package ru.itmo.coursework01;

import java.time.LocalDate;
import java.time.LocalTime;

public enum Type {
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
}



