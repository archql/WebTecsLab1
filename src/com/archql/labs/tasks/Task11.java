package com.archql.labs.tasks;

public class Task11 implements ITask{
    private String infoStr;

    @Override
    public boolean execute() {
        return true;
    }

    @Override
    public String description() {
        return "Создать запускной jar-файл и запустить приложение, созданное при решении задачи 9-ть.";
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
