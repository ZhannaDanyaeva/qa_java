package ru.yandex.praktikum;

import java.util.List;

public class AlexLion extends Lion {

    public AlexLion(Feline feline) throws Exception {
        super("Самец", feline); // Алекс всегда самец
    }

    @Override
    public int getKittens() {
        return 0; // У Алекса нет львят
    }

    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    public void dance() {
        System.out.println("Алекс танцует!");
    }
}
