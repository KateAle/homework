package ru.itmo.homeworks.hw13.task1;
//Объявить класс PairContainer со свойствами key и value. key и value -
// generic свойства без ограничений, но могут быть разных типов.

public class PairContainer<K ,V > {
    private K key;
    private V value;
    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return key;
    }
    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

}

