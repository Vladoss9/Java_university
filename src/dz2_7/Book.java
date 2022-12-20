package dz2_7;

public class Book {
    private String author = "athur";
    private String name = "bik";
    private int year = 42;
    private int pages = 1;

    Book(String author, String name, int year, int pages)
    {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public int GetPages() {
        return pages;
    }

    public int GetYear() {
        return year;
    }

    public String GetName() {
        return name;
    }

    public String GetAuthor() {
        return author;
    }

    public void SetAuthor(String author) {
        this.author = author;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetPages(int pages) {
        this.pages = pages;
    }

    public void SetYear(int year) {
        this.year = year;
    }
}
