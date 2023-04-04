package ru.itmo.homeworks.hw7hw8.transpotrFleet;

abstract public class Transport {
    //protected String type;
    protected int level;
    protected final int number;
    protected String color;

    public Transport(int number, int level) {
        if (number <= 0) {
            throw new IllegalArgumentException("Exception: number > 0 !");
        }
        else this.number= number;
        setLevel(level);
    }

    /*public final void setType(String type){
        if (type == null || type.length() < 3) {
            throw new IllegalArgumentException("Exception: type.length < 3");
        }
        this.type = type;
    }*/
    public int getNumber(){
        if (number < 0) {
            throw new IllegalArgumentException("Exception: set number!");
        }
        return  number;
    }

    public void setLevel(int level){
        //level=0;
        this.level = level;
    }
    abstract public void repair();


}
