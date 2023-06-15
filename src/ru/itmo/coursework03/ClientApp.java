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
        try (Socket socket = new Socket(remote.getHostString(), remote.getPort())){
            try (ReadWrite readWrite = new ReadWrite(socket)){
            System.out.println("Подключение к серверу...");
            Thread sendToServer = new Thread(() -> {
                    System.out.println("Введите текст или /exit для выхода");
                    while (true) {
                        String text = scanner.nextLine();
                        if ("/exit".equalsIgnoreCase(text)) return;
                        try {
                            Message message = new Message(text);
                            readWrite.writeMessage(message);
                        } catch (IOException e) {////////////////////////////////////////////
                            System.out.println("Сервер не отвечает");
                        }
                    }
                }); sendToServer.start();

            Thread readFromServer = new Thread(() -> {
                    while (true) {
                        try {
                            Message fromServer = readWrite.readMessage();
                            System.out.println(fromServer.getText());
                        } catch (UnknownHostException e) {
                            System.out.println("Ошибка в IP сервера");///////////////////////////////////////////
                        } catch (IOException e) {
                            System.out.println("Сервер не отвечает");//////////////////////////////////////////
                        }
                    }
                }); readFromServer.start();
          }catch (IOException e) {////////////////////////////////////////////
               System.out.println("Не удалось создать объект ReadWrite");}

        } catch (UnknownHostException e) {
            System.out.println("Ошибка IP сервера");
        } catch (IOException e) {
            System.out.println("Сервер не отвечает");
        }
    }


    public static void main(String[] args) {
        String ip = "127.0.0.1";
        int port = 3333;
        InetSocketAddress remote = new InetSocketAddress(ip, port);
        ClientApp clientApp = new ClientApp(remote);
        clientApp.run();
    }
}
