package com.archql.labs.tasks;

import com.archql.labs.help.Utils;

public class Task4 implements ITask {

    private String infoStr;

    @Override
    public boolean execute() {

        int [] array = Utils.readIntArray();
        if (array == null) {
            infoStr = "Invalid!";
            return false;
        }
        // check on primes
        for (int i = 0; i < array.length; i++)
        {
            if (Utils.isPrime(array[i]))
                System.out.println("prime value detected at " + i + ": " + array[i]);
        }
        infoStr = "Ok";

        return true;
    }

    @Override
    public String description() {
        return "Есть ли среди элементов массива простые числа?";
    }

    @Override
    public String detailedDescription() {
        return "Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа?\n" +
                "Если да, то вывести номера этих элементов.";
    }

    @Override
    public String lastInfo() {
        return infoStr;
    }
}
