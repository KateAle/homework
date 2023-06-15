package ru.itmo.coursework03;

import java.util.concurrent.CopyOnWriteArraySet;

public class ThreadForConnection extends Thread{
       CopyOnWriteArraySet<ReadWrite> connections;
       ReadWrite connection;
       ThreadForConnection(ReadWrite connection, CopyOnWriteArraySet<ReadWrite> connections) {
        this.connection = connection;
        this.connections = connections;
        };
    }