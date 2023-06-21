package ru.itmo.coursework02;

import java.io.*;

public class User implements Serializable {
    transient Command start;
    transient Command load;
    transient Command save;
    transient Command exit;
    transient Command cont;
    transient Game game;
    String login;
    String pwd;
    ObjectOutputStream output;
    ObjectInputStream input;
   // private String path = "/Users/air/Documents/ Наша папка/JAVA/homework/src/ru/itmo/coursework02/";


    public User(Command start,  Command cont, Command load, Command save, Command exit, String login, String pwd, Game game) {
        this.start = start;
        this.cont=cont;
        this.load = load;
        this.save = save;
        this.exit = exit;
        this.login = login;
        this.pwd=pwd;
        this.game=game;
    }

    public Command getLoad() {
        return load;
    }
    public Game getGame(){
        return game;
    }

    public String getLogin() {
        return login;
    }
    public String getPwd() {
        return pwd;
    }
    void startGame() throws IOException{
        start.execute(this);
    }
    void contGame() throws IOException {
        cont.execute(this);
    }
    void loadGame()throws IOException{
        load.execute(this);
    }
    void saveGame()throws IOException{
        save.execute(this);
    }

    void exitGame() throws IOException {
        exit.execute(this);
    }

}

