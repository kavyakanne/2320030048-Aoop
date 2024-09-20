package bookstore;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private String author;
    private double price;
    private int year;

    public Book(String title, String author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
    public Book clone() throws CloneNotSupportedException {
        return (Book) super.clone();
    }
    public String toString() {
        return title + " by " + author + " (" + year + ") - $" + price;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public int getYear() { return year; }
}
