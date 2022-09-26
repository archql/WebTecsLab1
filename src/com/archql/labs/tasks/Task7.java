package com.archql.labs.tasks;

import com.archql.labs.help.Utils;

public class Task7 implements ITask {

    private String infoStr;

    private void shellSort(int [] a, int len)
    {
        int i = 0;
        while(i < len - 1) {
            if (a[i] <= a[i+1]){
                i++; // next
            } else {
                int tmp = a[i]; // swap
                a[i] = a[i+1];
                a[i+1] = tmp;
                i--; // back
                if (i < 0)
                    i = 0;
            }
        }
    }

    @Override
    public boolean execute() {
        int [] array = Utils.readIntArray();
        if (array == null) {
            infoStr = "Invalid!";
            return false;
        }
        shellSort(array, array.length);

        // print array
        for (int j : array) {
            System.out.format("%5d", j);
        }
        System.out.println();

        return true;
    }

    @Override
    public String description() {
        return "Сортировка Шелла.";
    }

    @Override
    public String detailedDescription() {
        return """
                Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по\s
                возрастанию. Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 .\s
                Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, то производится\s
                перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.""";
    }

    @Override
    public String lastInfo() {
        return infoStr;
    }
}
