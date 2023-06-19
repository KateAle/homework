package ru.itmo.coursework03;


import java.io.*;
import java.net.*;

import java.util.ArrayList;
import java.util.Scanner;


public class ClientApp {
    private InetSocketAddress remote;
    private ReadWrite connection;
    private String path = "/Users/air/Documents/ Наша папка/JAVA/homework/src/ru/itmo/coursework03/ClientFiles/";


    public ClientApp(InetSocketAddress remote) {
        this.remote = remote;
    }

    public void run() {
        // устанавливаем соединение с сервером 1 раз
        // если делать это в цикле, клиент будет все время подключаться заново
        // без try с ресурсами, чтобы не закрывать соединение
        try {
            Socket socket = new Socket(remote.getHostString(), remote.getPort());
            connection = new ReadWrite(socket);

            // запускаем потоки:
            // для получения сообщений
            Reader reader = new Reader();
            reader.start();

            // для отправки сообщений
            Sender sender = new Sender();
            sender.start();

            // потоки не нужно создавать в цикле, их должно быть 2: один пишет, второй читает
        } catch (IOException e) {
            System.out.println("Сервер не отвечает");
        }
    }

    private class Reader extends Thread {
        @Override
        public void run() {
            while (true){
                try {
                    Message fromServer = connection.readMessage();
                    if (fromServer.getText().startsWith("Loading")){
                        String s = fromServer.getText().substring(7);
                        String name = s.split("/")[0];
                        String f = s.substring(s.indexOf("/"));
                        PrintWriter writer = new PrintWriter(path+name+".txt", "UTF-8");
                        writer.println(f);
                        writer.close();
                        System.out.println("Файл загружен");
                    } else {System.out.println(fromServer.getText());}
                } catch (IOException e) {
                    System.out.println("Не удалось принять сообщение");
                    System.out.println("Сервер не отвечает");
                    System.out.println("Завершение программы");
                    System.exit(0);
                }
            }
        }
    }


    private class Sender extends Thread {
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст или /exit для выхода");
            System.out.println("/add для загрузки файла");
            System.out.println("/catalog для просмотра файлов");
            while (true){
                Message message = null;
                String text = scanner.nextLine();
                if ("/add".equalsIgnoreCase(text)) {
                    try {
                        message = new Message(Message.fileLoad(path));
                        connection.writeMessage(message);

                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if ("/exit".equalsIgnoreCase(text)) {
                    System.out.println("Завершение программы");
                    System.exit(0);
                }
                try {
                    message = new Message(text);
                    connection.writeMessage(message);
                    //System.out.println("Сообщение отправлено");
                } catch (IOException e) {
                    System.out.println("Не удалось отправить сообщение");
                    System.out.println("Сервер не отвечает");
                    System.out.println("Завершение программы");
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        String ip = "127.0.0.1";
        int port = 8081;
        InetSocketAddress remote = new InetSocketAddress(ip, port);
        ClientApp clientApp = new ClientApp(remote);
        clientApp.run();
    }
}
