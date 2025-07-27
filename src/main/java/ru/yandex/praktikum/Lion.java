package ru.yandex.praktikum;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final Predator predator;

    public Lion(String sex, Predator predator) throws Exception {
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.predator = predator;
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.getFood("Хищник");
    }

    public int getKittens() {
        return predator.getKittens();
    }
}
