package ru.itmo.homeworks.hw7hw8.transpotrFleet;

abstract public class Transport {
    //protected String type;
    protected int level;
    protected int number;
    protected String color;

    public Transport(int number, String color, int level) {
        setColor(color);
        setNumber(number);
        setLevel(level);
    }

    /*public final void setType(String type){
        if (type == null || type.length() < 3) {
            throw new IllegalArgumentException("Exception: type.length < 3");
        }
        this.type = type;
    }*/
    public final void setNumber(int number){
        if (number < 0) {
            throw new IllegalArgumentException("Exception: set number!");
        }
        this.number = number;
    }
    public final void setColor(String color){
        if (color == null || color.length() < 3) {
            throw new IllegalArgumentException("Exception: color < 3");
        }
        this.color = color;
    }
    public void setLevel(int level){
        //level=0;
        this.level = level;
    }
    abstract public void repair();
}
