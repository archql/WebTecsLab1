package com.archql.labs.tasks;

import com.archql.labs.tasks.task09.Ball;
import com.archql.labs.tasks.task09.Basket;

public class Task9 implements  ITask{
    private String infoStr;

    @Override
    public boolean execute() {

        Basket basket = new Basket();
        basket.read();

        basket.write();

        System.out.println("Sum weight: " + basket.weight());
        // System.out.print("Input target color name: ");
        // String colorName = Utils.scanner.nextLine();
        // Ball.COLOR clr = Ball.COLOR.fromString(colorName.trim());
        System.out.println("Balls amount with color blue : " + basket.countByColor(Ball.COLOR.BLUE));

        return true;
    }

    @Override
    public String description() {
        return "Создать класс Мяч. Создать класс Корзина. Наполнить корзину мячиками. Определить вес \n" +
                "мячиков в корзине и количество синих мячиков";
    }

    @Override
    public String detailedDescription() {
        return description();
    }

    @Override
    public String lastInfo() {
        return infoStr;
    }
}
