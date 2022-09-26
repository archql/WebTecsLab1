package com.archql.labs.tasks;

import com.archql.labs.help.Utils;

public class Task1 implements ITask {
    private String infoStr;

    @Override
    public boolean execute() {
        double x = Utils.readDouble("x");
        double y = Utils.readDouble("y");

        double temp = 1 + x*x + y*y;
        // denomenator is never zero
//        if (Utils.realEquals(temp, 0.0)) {
//            infoStr = "Denominator equals 0!";
//            return false;
//        }
        temp = 2 + Math.abs(x - (2*x) / (temp));
//        if (Utils.realEquals(temp, 0.0)) {
//            infoStr = "Denominator equals 0!";
//            return false;
//        }
        double atemp = Math.sin(x + y);
        temp = (1 + atemp * atemp) / temp + x;

        infoStr = "result is: " + temp;
        return true;
    }

    @Override
    public String description() {
        return "Вычислить значение выражения по формуле";
    }

    @Override
    public String detailedDescription() {
        return """
                Вычислить значение выражения по формуле:\s
                 1 +sin^2(x+y) / (2 + |x - 2x/ (1+x^2*y^2)|) + x\s
                 (все переменные принимают действительные\s
                значения)""";
    }

    @Override
    public String lastInfo() {
        return infoStr;
    }
}
