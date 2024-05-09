package com.arf.labtest;

public class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String addBook(String title, String author,int units, String genre_name) {
        return "Book added";
    }
    public String borrowBook(String title,int units) {
        return "Book borrowed";
    }
}
