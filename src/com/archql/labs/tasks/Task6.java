package com.archql.labs.tasks;

import com.archql.labs.help.Utils;

public class Task6 implements ITask {

    private String infoStr;

    @Override
    public boolean execute() {

        int [] array = Utils.readIntArray();
        if (array == null) {
            infoStr = "Invalid!";
            return false;
        }
        int len = array.length;

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                System.out.format("%5d", array[j]);
            }
            for (int j = 0; j < i; j++) {
                System.out.format("%5d", array[j]);
            }
            System.out.println();
        }

        infoStr= "Ok";


        return true;
    }

    @Override
    public String description() {
        return "Даны действительные числа a1, a2, …, an. Получить следующую квадратную матрицу порядка n";
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
