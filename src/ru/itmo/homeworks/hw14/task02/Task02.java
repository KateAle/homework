package ru.itmo.homeworks.hw14.task02;

import java.util.List;

public class Task02 {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
        if (messageList.size() == 0) {
            System.out.println("нет данных");}

        int count = 0;
        for (var mes : messageList) {
            if (mes.getPriority() == Message.MessagePriority.LOW) {
                count ++;
            }

        }System.out.println("MessagePriority.LOW: "+ count);

        count = 0;
        for (var mes : messageList) {
            if (mes.getPriority() == Message.MessagePriority.MEDIUM) {
                count ++;
            }
        }System.out.println("MessagePriority.MEDIUM: "+ count);

        count = 0;
        for (var mes : messageList) {
            if (mes.getPriority() == Message.MessagePriority.HIGH) {
                count ++;
            }
        }System.out.println("MessagePriority.HIGH: "+ count);


        count = 0;
        for (var mes : messageList) {
            if (mes.getPriority() == Message.MessagePriority.URGENT) {
                    count ++;
                }
        }System.out.println("MessagePriority.URGENT: "+ count);
        }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль

        for ( int i=0; i < 11; i++) {
            int count = 0;
            for (var m : messageList) {
                if (i == m.getCode()) {
                    count++;
                }
            }if (count != 0) {
                System.out.println("messages code " + i + " : " + count);
            } else continue;
        }
        }


    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return null;
    }

    public static void removeEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
    }

    public static void removeOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(6);
        System.out.println(messages.toString());
        countEachPriority(messages);
        countEachCode(messages);
        uniqueMessageCount(messages);
        System.out.println(uniqueMessagesInOriginalOrder(messages));
        removeEach(messages, Message.MessagePriority.HIGH);
        removeOther(messages, Message.MessagePriority.LOW);

}}
