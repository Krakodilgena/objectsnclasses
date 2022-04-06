package ru.skypro;

import java.awt.print.Book;
import src.ru.skypro.Author;
import src.ru.skypro.Book;

public class Main {


    public static void main(String[] args) {
	Author author = new Author("Дима", "Маслеников");
    Book book = new Book("Book 1 ", author, 2026);
        System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName() + " "
                + book.getAuthor().getLastName() + " " + book.getYear());

        book.setYear(2015)

        System.out.println(book.getTitle() + " " + book.getAuthor().getFirstName() + " "
                + book.getAuthor().getLastName() + " " + book.getYear());
    }
}
