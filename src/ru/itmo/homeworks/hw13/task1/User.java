package ru.itmo.homeworks.hw13.task1;

public class User <T> {
    // тип T компилируется в Object
    // у свойства id можно вызвать только методы Object
    private T id;
    private String login;
    public void setId(T id) {
        this.id = id;
    }
    public T getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

}
