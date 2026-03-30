package com.bridgelabz.collectors;

import java.util.*;
import java.util.stream.*;

class Book {
    String genre;
    int pages;

    Book(String genre, int pages) {
        this.genre = genre;
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public int getPages() {
        return pages;
    }
}

public class LibraryBookStatics {
    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Fiction", 300),
                new Book("Fiction", 450),
                new Book("Science", 500),
                new Book("Science", 350)
        );

        Map<String, IntSummaryStatistics> stats =
                books.stream()
                        .collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)
                        ));

        stats.forEach((genre, summary) -> {
            System.out.println(genre + " -> " + summary);
        });
    }
}

