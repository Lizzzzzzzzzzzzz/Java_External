package Java;

import java.util.ArrayList;
import java.util.List;

public class BookArray {
    public Book[] createBookArray() {
        Book[] books = new Book[10];
        books[0] = new Book("Джошуа Блок", "Effective Java", "Sun", 2016, 700, 1000);
        books[1] = new Book("Robert Martin", "Clean Code", "Sun1", 2018, 787, 678);
        books[2] = new Book("Key Horstmann", "Java Prof", "Sun2", 2011, 879, 453);
        books[3] = new Book("Shield Gerber", "Java prog", "Sun3", 2019, 877, 984);
        books[4] = new Book("Eric Freeman", "Patterns", "Sun4", 2016, 767, 784);
        books[5] = new Book("Creyge Ums", "Spring in Action", "Sun5", 2002, 896, 656);
        books[6] = new Book("Lasse Koskela", "TDD", "Sun6", 2001, 432, 342);
        books[7] = new Book("Bert Beits", "Learn java", "Sun7", 2009, 675, 456);
        books[8] = new Book("Robert Sedweik", "Algoritms", "Sun8", 2008, 355, 656);
        books[9] = new Book("McLauglin", "OOP", "Sun9", 2014, 345, 231);
        return books;
    }

    public static List<Book> booksByAuthor(String author, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            for (Object o : books) {
                if (o.equals(book.getAuthor())) {
                    result.add(book);
                }
            }
        }
        return result;
    }

    public static List<Book> booksByPublisher(String publisher, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (publisher.equals(book.getPublishingHouse())) {
                result.add(book);
            }
        }
        return result;
    }

    public static List<Book> booksAfterYear(int year, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (year < book.getPublishingYear()) {
                result.add(book);
            }
        }
        return result;
    }
}
