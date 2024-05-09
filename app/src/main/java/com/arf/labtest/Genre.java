package com.arf.labtest;

import java.util.ArrayList;
import java.util.List;

public class Genre {
    public List<Book>Mystry=new ArrayList<>();
    public List<Book>Fantasy=new ArrayList<>();
    public List<Book>Thriller=new ArrayList<>();
    public String show_book_info(String genre_name) {
        return "Book info";
    }

    public List<Book> getFantasy() {
        return Fantasy;
    }

    public List<Book> getMystry() {
        return Mystry;
    }

    public List<Book> getThriller() {
        return Thriller;
    }
}
