package ru.itmo.homeworks.hw14.task01;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {
    private ArrayList<Fruit> fruits; // коллекция для хранения фруктов (коллекцию выбрать самостоятельно)


    public FruitStorage() {
        fruits = new ArrayList<>(); // коллекция для хранения фруктов (коллекцию выбрать самостоятельно)
    }

    public void addFruit(Fruit newFruit) {
        if (newFruit == null) return;
        for (Fruit fruit : fruits) {
            if (fruit == newFruit) return;
            if (fruit.equals(newFruit)) {
                fruit.setCount(fruit.getCount() + newFruit.getCount());
                return;
            }
        }
        fruits.add(newFruit);
        // добавление фрукта newFruit в коллекцию fruits
        // newFruit не может быть null
        // newFruit не может быть ссылкой на элемент коллекции
        // Если в коллекции fruits уже есть фрукт с типом и ценой, как у newFruit,
        // увеличивать значение свойства count
        // фрукта из коллекции на значение свойства count объекта newFruit
        // В противном случае просто добавлять newFruit в коллекцию fruits
    }

    public int getNumberOfFruitsByType(Fruit.FruitType fruitType) {
        // возвращает количество фруктов типа fruitType
        if (fruits.size() == 0) return 0;
        int count = 0;
        for (var fruit : fruits) {
            if (fruit.getType() == fruitType) {
                count += fruit.getCount();
            }
        }
        return count;
    }

    public int getNumberOfFruits() {
         // возвращает количество всех фруктов (цикл не использовать) =(((
        //return fruits.size();

        int count = 0;
        for (var fruit : fruits) {
            count += fruit.getCount();
            }
        return count;
    }



    public void increasePrice(/*int value*/) {
        // value может быть в диапазоне [10; 30)
        // увеличить цену фруктов на value процентов
        int value = (int)(10 + Math.random() * 30);

        for (Fruit fruit : fruits) {
                fruit.setPrice(fruit.getPrice() + fruit.getPrice()*value/10);
                return;
            }


    }

    public double getFruitsPrice() {
        // возвращает общую стоимость фруктов на складе
        double price = 0;
        for (var fruit : fruits) {
            price += fruit.getCount() * fruit.getPrice();
        }
        return price;
    }

    public List<Fruit> getFruitsByTypeAndPrice(Fruit.FruitType fruitType, int maxPrice) {
        // maxPrice должна быть положительной
        // возвращает список, в который войдут фрукты из коллекции fruits
        // с типом fruitType и ценой не выше maxPrice
        List<Fruit> fruits01 = new ArrayList<>();
        for (var f : fruits) {
            if (f.getType() == fruitType || f.getPrice()< maxPrice) {
                fruits01.add(f);
            }
        }
        return fruits01;
    }
}