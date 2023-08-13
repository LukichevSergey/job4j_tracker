package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book java = new Book("Java", 300);
        Book python = new Book("Python", 250);
        Book swift = new Book("Swift", 200);
        Book cleanCode = new Book("Clean Code", 150);
        Book[] books = {java, python, swift, cleanCode};

        for (Book book : books) {
            System.out.println(book.getName());
        }
    }
}
