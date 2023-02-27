package day0206.oop.constructor;

public class Book {
    String bookName;
    String author;
    int price;

    public Book() {
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public Book(String bookName, String author, int price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
}

