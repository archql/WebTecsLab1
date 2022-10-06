package com.archql.labs.tasks.task12;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    ProgrammerBook() {
        super();
    }
    ProgrammerBook(String language, int level, String title, int price) {
        super(title, price);
        this.language = language;
        this.level = level;
    }
    ProgrammerBook(String language, int level, String title, String author, int price) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass() || !super.equals(o))
            return false;
        ProgrammerBook b = (ProgrammerBook) o;
        return level == b.level && language.equals(b.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "language='" + language + '\'' +
                ", level=" + level +
                super.toString() +
                "} ";
    }
}
