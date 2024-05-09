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
        Info x=new Info(units,genre_name);
        Book y=new Book(title,author);
        return y.getTitle()+"by"+y.getAuthor()+"is added";
        switch(genre_name) {
            case "Fantasy":
                Genre.Fantasy.add(y);
                break;
            case "Mystry":
                Genre.Mystry.add(y);
                break;
            case "Thriller":
                Genre.Thriller.add(y);
                break;
        }

    }
    public String borrowBook(String title,int units){
        switch(title) {
            case "Fantasy":
                if(Genre.Fantasy.size()>=units) {
                    return "Book is available";
                }
                else {
                    return "Book is not available";
                }
            case "Mystry":
                if(Genre.Mystry.size()>=units) {
                    return "Book is available";
                }
                else {
                    return "Book is not available";
                }
            case "Thriller":
                if(Genre.Thriller.size()>=units) {
                    return "Book is available";
                }
                else {
                    return "Book is not available";
                }
        }

    }
}
