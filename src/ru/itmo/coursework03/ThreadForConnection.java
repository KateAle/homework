package ru.itmo.coursework03;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

public class ThreadForConnection extends Thread {
    private final CopyOnWriteArraySet<ReadWrite> connections;
    private final ReadWrite connection;
    private int counter;

    ThreadForConnection(ReadWrite connection, CopyOnWriteArraySet<ReadWrite> connections, int counter) {
        this.connection = connection;
        this.connections = connections;
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        while (true) {
            // получение сообщения
            Message message = null;
            try {
                message = connection.readMessage();
            } catch (IOException e) {
                System.out.println("Соединение потеряно");
                connections.remove(connection);
                return;
            }
            if (message.getText().contains("//")) {//что пришло от клиента

                String[] fields = message.getText().split("//");
                Server.documents.add(fields);//документ добавлен в список

                for (ReadWrite client : connections) {//рассылка сообщения о добавлении нового док
                    try {
                        client.writeMessage(new Message("Добавлен файл: " + fields[0] + " - " + fields[1]));
                    } catch (IOException e) {
                        System.out.println("Ошибка отправки сообщения");
                        connections.remove(client);
                    }
                }
            }  //клиент запросил каталог
            else if (message.getText().equalsIgnoreCase("/catalog")) {
                try {
                    connection.writeMessage(new Message(Server.getCatalog()));
                    connection.writeMessage(new Message("Введите название документа для скачивания"));
                } catch (IOException e) {
                    System.out.println("Ошибка отправки сообщения");
                    connections.remove(connection);
                }
            }
            //клиент запросил файл для скачивания
            else {
                for (String[] doc : Server.documents) {
                    if (message.getText().equalsIgnoreCase(doc[0])) {
                        try {
                            if (Server.getDesc(doc[0]).equalsIgnoreCase("Файл не найден")){
                                connection.writeMessage(new Message("Файл не найден"));
                            } else {
                            connection.writeMessage(new Message(Server.getDesc(doc[0])));
                            connection.writeMessage(new Message("Loading" + doc[0] + "/" + Server.getDoc(doc[0])));
                        }
                        }catch (IOException e) {
                            System.out.println("Ошибка отправки сообщения");
                            connections.remove(connection);
                        }
                    }
                }

            if (message == null) {
                    System.out.println("Соединение потеряно");
                    connections.remove(connection);
                    return;
            } else {
                    for (ReadWrite client : connections) {
                        try { if (!(message.getText().equalsIgnoreCase("/add"))&&
                                !(message.getText().equalsIgnoreCase("Файл загружен"))&&
                                !(message.getText().equalsIgnoreCase("Файл не загружен"))&&
                                !(message.getText().equalsIgnoreCase("/catalog"))
                        ){
                            client.writeMessage(new Message(">> Client No " + getCounter() + "  : " + message.getText()));}
                        } catch (IOException e) {
                            System.out.println("Ошибка отправки сообщения");
                            connections.remove(client);
                        }
                    }
                }
            }
        }
    }
}