package com.example.booklogapp.Database;

public class BookMemo {
    String title;
    String author;
    String content;

    public BookMemo() {}

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BookMemo(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
}
