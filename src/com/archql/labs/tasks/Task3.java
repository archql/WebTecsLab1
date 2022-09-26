package com.archql.labs.tasks;

import com.archql.labs.help.Utils;

public class Task3 implements ITask {
    private String infoStr;

    private double F(double x)
    {
        return Math.tan(x);
    }

    @Override
    public boolean execute() {
        double a = Utils.readDouble("a");
        double b = Utils.readDouble("b");
        double h = Utils.readDouble("h");

        if (a > b || Utils.realEquals(h, 0.0)) {
            infoStr = "bad input!";
            return false;
        }

        System.out.format(" %10s | %10s \n", "x =", "F(x) =");
        while (Utils.realLessEquals(a, b)) {
            System.out.format(" %10f | %10f \n", a, F(a));

            a += h;
        }

        infoStr = "Ok";
        return true;
    }

    @Override
    public String description() {
        return "Составить программу для вычисления значений функции F(x)=tg(x) на отрезке [а, b]";
    }

    @Override
    public String detailedDescription() {
        return """
                Составить программу для вычисления значений функции F(x)=tg(x) на отрезке [а, b] с шагом h. Результат\s
                представить в виде таблицы, первый столбец которой – значения аргумента, второй -
                соответствующие значения функции.
                """;
    }

    @Override
    public String lastInfo() {
        return infoStr;
    }
}
