package ru.itmo.coursework03;


import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArraySet;

public class Server{
    private int port;
    private CopyOnWriteArraySet<ReadWrite> connections;
    public Server(int port) {
        this.port = port;
        connections = new CopyOnWriteArraySet<>();
    }

   public void startServer() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен");
            int counter=0;
            while (true) {
               Socket socket = null;
                try {
                    counter++;
                    socket = serverSocket.accept();
                    System.out.println(" >> " + "Client No:" + counter + " подключен");
                    try (ReadWrite connection = new ReadWrite(socket)){
                    connections.add(connection);
                    ThreadForConnection thread = new ThreadForConnection(connection, connections);
                    thread.start();
                    } catch (IOException e){
                        System.out.println("Ошибка во время создания объекта");
                    }
                }
                catch (IOException e) {
                    System.out.println("Не удалось установить соединение с клиентом");
                    if (socket != null) socket.close();/////////////////////////////////////////
                }}
            } catch(IOException e){
                System.out.println("Ошибка сервера");}
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(2345);
        server.startServer();
    }
}