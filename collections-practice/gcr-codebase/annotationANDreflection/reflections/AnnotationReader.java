package com.bridgelabz.reflections;

public class AnnotationReader {

    public static void main(String[] args) {

        Class<Book> cls = Book.class;

        Author author = cls.getAnnotation(Author.class);

        if (author != null) {
            System.out.println("Author Name: " + author.name());
        }
    }
}
