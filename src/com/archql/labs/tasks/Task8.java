package com.archql.labs.tasks;

import com.archql.labs.help.Utils;

public class Task8 implements ITask {

    private String infoStr;

    @Override
    public boolean execute() {

        int[] arrayA = Utils.readIntArray();
        int[] arrayB = Utils.readIntArray();
        if (arrayA == null || arrayB == null) {
            infoStr = "Invalid!";
            return false;
        }
        // check input
        int i = 0;
        while (i < arrayA.length - 1) {
            if (arrayA[i] > arrayA[i + 1]) {
                infoStr = "Ascending A required!";
                return false;
            }
            i++;
        }
        int j = 0;
        while (j < arrayB.length - 1) {
            if (arrayB[j] > arrayB[j + 1]) {
                infoStr = "Ascending B required!";
                return false;
            }
            j++;
        }

        // calc
        i = 0;
        j = 0;
        while (i < arrayA.length) {
            while (j < arrayB.length && arrayA[i] > arrayB[j]) {
                System.out.println("Insert b[" + j + "]=" + arrayB[j] + " before a[" + i + "]=" + arrayA[i]);
                j++;
            }
            i++;
        }
        while (j < arrayB.length) {
            System.out.println("Insert b[" + j + "]=" + arrayB[j] + " after last at a = " + arrayA[i - 1]);
            j++;
        }

        return true;
    }

    @Override
    public String description() {
        return "Требуется указать те места, на которые нужно вставлять элементы";
    }

    @Override
    public String detailedDescription() {
        return """
                Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= … <=an и b1
                <= b2 <= … <= bm. Требуется указать те места, на которые нужно вставлять элементы\s
                последовательности b1 <= b2 <= … <= bm в первую последовательность так, чтобы новая\s
                последовательность оставалась возрастающей.""";
    }

    @Override
    public String lastInfo() {
        return infoStr;
    }
}
