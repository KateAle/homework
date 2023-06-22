package ru.itmo.coursework01;

import java.text.SimpleDateFormat;
import java.time.*;


public class FitnessClub {

    private Subscription[] gym;
    private Subscription[] pool;
    private Subscription[] group;
    private int gi, pi, gri;//счетчики GYM, POOL, GROUP


    enum Training {//вид тренировки
        GYM, POOL, GROUP;
    }
    public FitnessClub(){
        gym = new Subscription[20];
        pool = new Subscription[20];
        group = new Subscription[20];

    }

    ZoneId z = ZoneId.of( "Europe/Moscow" ) ;
    LocalDate today = LocalDate.now();
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
    LocalTime now = LocalTime.now();
    LocalTime open = LocalTime.parse( "08:00" );
    LocalTime close = LocalTime.parse( "23:00" );


    public void training (Subscription sub,Training train) {
        if (now.isBefore(open) && now.isAfter(close)) { // сравнить настоящее время и время работы
            System.out.println("Фитнес-клуб закрыт");
        } else if (today.isAfter(sub.getDateEnd(sub.getDateStart())) ){// сравнить сегодня и дату окончания
            System.out.println("Абонемент недействителен");
        } else if (sub.getType() == Type.ONE_DAY && train == Training.GROUP) {
            System.out.println("В абонемент не включено посещение групповых занятий");
        } else if (sub.getType() == Type.MORNING && train == Training.POOL) {
            System.out.println("В абонемент не включено посещение бассейна");
        } else if (sub.getType() == Type.MORNING && now.isAfter(Type.MORNING.getEnd())) {// сравнение времени для утреннего абон
            System.out.println("Вы не можете посещать клуб после 16 часов");
        } else if (train == Training.GROUP) {
            if (group.length == gri) {
                System.out.println("Зал групповых занятий заполнен");
                return;
            }
            group[gri] = sub;
            gri++;
            System.out.println("Вы в зале групповых занятий");
        } else if (train == Training.POOL) {
            if (pool.length == /*>=*/ pi) {
                System.out.println("Бассейн заполнен");
                return;
            }
            pool[pi] = sub;
            pi++;
            System.out.println("Вы в бассейне");
        } else if (train == Training.GYM) {
            if (gym.length == /*>=*/ gi) {
                System.out.println("Тренажерный зал заполнен");
                return;
            }
            gym[gi] = sub;
            gi++;
            System.out.println("Вы в тренажерном зале");
        }
    }
        // в 22 часа массивы обнуляются
        public void closeClub(){
            if (now.isAfter(close)){
                for (int i = 0; i < gym.length; i++) {
                    gym[i] = null;
                    pool[i] = null;
                    group[i] = null;
                }
            }System.out.println("Фитнес-клуб закрыт");
        }



}
