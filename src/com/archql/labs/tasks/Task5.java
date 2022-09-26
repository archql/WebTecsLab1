package com.archql.labs.tasks;

import com.archql.labs.help.Utils;

public class Task5 implements ITask{

    private String infoStr;

    @Override
    public boolean execute() {

        int [] array = Utils.readIntArray();
        if (array == null) {
            infoStr = "Invalid!";
            return false;
        }

        int numDropped = 0; // dropped elements
        int lastMax = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] >= lastMax)
                lastMax = array[i];
            else {
                numDropped++;
            }
        }

        infoStr = String.valueOf(numDropped);

        return true;
    }

    @Override
    public String description() {
        return "Найти наименьшее число K элементов, которые можно\n" +
                "выкинуть, так чтобы осталась возрастающая";
    }

    @Override
    public String detailedDescription() {
        return """
                Дана целочисленная таблица А[n]. Найти наименьшее число K элементов, которые можно\s
                выкинуть из данной последовательности, так чтобы осталась возрастающая\s
                подпоследовательность.
                """;
    }

    @Override
    public String lastInfo() {
        return infoStr;
    }
}
