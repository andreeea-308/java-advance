package oop.Exercitii.Library;

import java.time.LocalDate;

public class Book {
    private String name;
    private String author;
    private int pages;
    private LocalDate expiryDate;

    public Book(String name, String author,  int pages, LocalDate expiryDate) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
