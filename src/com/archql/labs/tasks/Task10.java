package com.archql.labs.tasks;

public class Task10 implements ITask{
    private String infoStr;

    @Override
    public boolean execute() {
        return true;
    }

    @Override
    public String description() {
        return "Скомпилировать и запустить приложение, созданное при решении задачи 9 из командной строки.";
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
