package ru.itmo.coursework03;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Server {
    private int port;
    private CopyOnWriteArraySet<ReadWrite> connections;
    public static CopyOnWriteArrayList<String[]> documents;

    public Server(int port) {
        this.port = port;
        connections = new CopyOnWriteArraySet<>();
        documents = new CopyOnWriteArrayList<String[]>();
    }
    public static String getCatalog(){
        StringBuffer sb = new StringBuffer();
        for ( String[] doc: documents) {
            sb.append(doc[0])
                    .append(" ; ");
        }
        return sb.toString();
    }

    public static String getDesc(String name){
        String d = null;
        for ( String[] doc: documents) {
            if (doc[0].equalsIgnoreCase(name)){
                d= doc[1];
            } else {
                d= "Файл не найден";
            }
        } return d;
    }

    public static String getDoc(String name){
        String d = null;
        for ( String[] doc: documents) {
            if (doc[0].equalsIgnoreCase(name)){
                d= doc[2];
            } else {
                d= "Файл не найден";
            }
        } return d;
    }



    public void startServer() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен");
            int counter = 0;
            while (true) {
                Socket socket = null;
                counter++;
                socket = serverSocket.accept();
                System.out.println(" >> " + "Client No " + counter + " подключен");
                ReadWrite connection = new ReadWrite(socket);
                connections.add(connection);
                ThreadForConnection thread = new ThreadForConnection(connection, connections, counter);
                thread.start();
            }

        } catch (IOException e) {
            System.out.println("Ошибка сервера");
        }
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(8081);
        server.startServer();
    }
}