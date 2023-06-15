package ru.itmo.coursework03;


import java.io.*;
import java.net.*;
import java.util.Scanner;
public class ClientApp {
    private InetSocketAddress remote;

    public ClientApp(InetSocketAddress remote) {
        this.remote = remote;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст или /exit для выхода");
        while (true) {
            String text = scanner.nextLine();
            if ("/exit".equalsIgnoreCase(text)) return;
            try (Socket socket = new Socket(remote.getHostString(), remote.getPort())) {
                try (ReadWrite readWrite = new ReadWrite(socket)) {
                    System.out.println("Создан объект ReadWrite");
                   Thread sendToServer = new Thread(() -> {
                        try {
                            Message message = new Message(text);
                            readWrite.writeMessage(message);
                            System.out.println("Сообщение отправлено");
                        } catch (IOException e) {////////////////////////////////////////////
                            System.out.println("Не удалось отправить сообщение");
                        }
                   });sendToServer.start();

                   Thread readFromServer = new Thread(() -> {
                        try {
                            Message fromServer = readWrite.readMessage();
                            System.out.println(fromServer.getText());
                        } catch (IOException e) {////////////////////////////////////////////
                            System.out.println("Не удалось принять сообщение");
                        }
                   });readFromServer.start();
                } catch (IOException e) {////////////////////////////////////////////
                    System.out.println("Не удалось создать объект ReadWrite");
                }
            } catch (UnknownHostException e) {
                    System.out.println("Ошибка в IP сервера");///////////////////////////////////////////
                } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        }




    public static void main(String[] args) {
        String ip = "127.0.0.1";
        int port = 2345;
        InetSocketAddress remote = new InetSocketAddress(ip, port);
        ClientApp clientApp = new ClientApp(remote);
        clientApp.run();
    }
}
