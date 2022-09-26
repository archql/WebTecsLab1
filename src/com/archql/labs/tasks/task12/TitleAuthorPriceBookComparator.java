package com.archql.labs.tasks.task12;

import java.util.Comparator;

public class TitleAuthorPriceBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int test = o1.getTitle().compareTo(o2.getTitle());
        if (test == 0)
            test = o1.getAuthor().compareTo(o2.getAuthor());
        if (test == 0)
            return Integer.compare(o1.getPrice(), o2.getPrice());
        return test;
    }
}