package com.archql.labs.tasks;

import com.archql.labs.help.Utils;

public class Task2 implements ITask {

    private String infoStr;

    @Override
    public boolean execute() {

        double x = Utils.readDouble("x");
        double y = Utils.readDouble("y");

        boolean greaterThanZero = y >= 0;
        boolean aCompatible = greaterThanZero && Utils.realLessEquals(y, 5)
                && Utils.realLessEquals(Math.abs(x), 4);
        boolean bCompatible = greaterThanZero && Utils.realGreaterEquals(y, -6)
                && Utils.realLessEquals(Math.abs(x), 6);

        infoStr = String.valueOf(aCompatible | bCompatible);

        return true;
    }

    @Override
    public String description() {
        return "Для области составить программу, которая печатает true...";
    }

    @Override
    public String detailedDescription() {
        return "Для данной области составить программу, которая печатает true, если точка с координатами (х,\n" +
                "у) принадлежит закрашенной области, и false — в противном случае";
    }

    @Override
    public String lastInfo() {
        return infoStr;
    }
}
