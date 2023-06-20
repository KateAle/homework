package ru.itmo.coursework02;

import java.io.*;

public class User implements Serializable {
    Command start;
    Command load;
    Command save;
    Command exit;
    String login;
    String pwd;
    ObjectOutputStream output;
    ObjectInputStream input;
   // private String path = "/Users/air/Documents/ Наша папка/JAVA/homework/src/ru/itmo/coursework02/";


    public User(Command start, Command load, Command save, Command exit, String login, String pwd) {
        this.start = start;
        this.load = load;
        this.save = save;
        this.exit = exit;
        this.login = login;
        this.pwd=pwd;

    }

    public String getLogin() {
        return login;
    }
    public String getPwd() {
        return pwd;
    }
    void startGame(){
        start.execute(this);
    }
    void loadGame(){
        load.execute(this);
    }
    void saveGame(){
        save.execute(this);
    }
    void exitGame(){
        exit.execute(this);
    }

}

