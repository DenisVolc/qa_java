package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) throws IndexOutOfBoundsException{
        if (kittensCount < 0){throw new IndexOutOfBoundsException("Котят не может быть меньше нуля");}//Это моя самодеятельность.
        // Хотел написать тест который будет проверять отрицаетльное значение и что бы результат был правдивым.
        return kittensCount;
    }

}
