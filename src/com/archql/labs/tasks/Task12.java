package com.archql.labs.tasks;

public class Task12 implements ITask{
    private String infoStr;

    @Override
    public boolean execute() {

        System.out.println("this is demo (you must look in the code to understand result");

        return true;
    }

    @Override
    public String description() {
        return """
                Задачи ООП, 12 - 15\s
                Book и ProgrammerBook\s
                """;
    }

    @Override
    public String detailedDescription() {
        return """
                Не пользуясь средствами автогенерации кода переопределить для класса Book методы equals(),\s
                hashCode() и toString().
                public class Book {
                \tprivate String title;
                \tprivate String author;
                \tprivate int price;
                \tprivate static int edition;
                }Не пользуясь средствами автогенерации кода переопределить для класса ProgrammerBook
                методы equals(), hashCode() и toString().
                public class ProgrammerBook extends Book{
                \tprivate String language;
                \tprivate int level;
                }Не пользуясь средствами автогенерации кода переопределить для класса Book из задачи 12 метод\s
                clone().Добавьте в класс Book из задачи 12 поле isbn. Реализуйте в классе Book интерфейс Comparable
                так, чтобы книги приобрели сортировку по умолчанию согласно номеру isbn.Реализуйте для класса Book из задачи 12 компараторы, позволяющие сортировать книги по\s
                названию; по названию, а потом по автору; по автору, а потом по названию; по автору, названию\s
                и цене.""";
    }

    @Override
    public String lastInfo() {
        return infoStr;
    }
}