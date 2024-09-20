package bookstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable<Book> {
    private List<Book> books;

    public Inventory() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Iterator<Book> iterator() {
        return books.iterator();
    }

    public void printInventory() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}