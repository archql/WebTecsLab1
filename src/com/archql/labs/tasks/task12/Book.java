package com.archql.labs.tasks.task12;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;

    Book() {
    }

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    Book(String title, String author, int price) {
        this(title, price);
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int isbn;

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final Book b = (Book) o;
        return title.equals(b.title) &&
                author.equals(b.author) &&
                price == b.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        final Book clone;
        try {
            clone = (Book) super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new RuntimeException("superclass messed up", ex);
        }
        clone.author = this.author;
        clone.title = this.title;
        clone.price = this.price;

        return clone;
    }

    @Override
    public int compareTo(Book o) {
        if (o == null)
            throw new NullPointerException();
        return isbn - o.isbn;
    }
}
