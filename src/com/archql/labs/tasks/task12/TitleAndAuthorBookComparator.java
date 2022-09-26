package com.archql.labs.tasks.task12;

import java.util.Comparator;

public class TitleAndAuthorBookComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        int nameTest = o1.getTitle().compareTo(o2.getTitle());
        if (nameTest == 0)
            return o1.getAuthor().compareTo(o2.getAuthor());
        return nameTest;
    }
}
