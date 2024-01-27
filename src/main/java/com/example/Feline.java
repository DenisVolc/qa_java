package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");// todo зависимость!
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);// todo зависимость!
    }

    public int getKittens(int kittensCount) {//ЗОЧЕМ?
        return kittensCount;
    }

}
