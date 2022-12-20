package dz2_7;

public class BookshelfTest {
    public static void main(String[] args)
    {
        Book book1 = new Book("He", "English1", 1950, 500);
        Book book2 = new Book("She", "English2", 1951, 55);
        Book book3 = new Book("It", "English3", 1956, 89);
        Book book4 = new Book("They", "English4", 1999, 101);

        BookShelf bookShelf = new BookShelf(4);

        bookShelf.AddBook(book1);
        bookShelf.AddBook(book4);
        bookShelf.AddBook(book2);
        bookShelf.AddBook(book3);
        boolean isAddedBook = bookShelf.AddBook(book4);

        System.out.println("Добавлена ли предыдущая книга: " + isAddedBook);
        System.out.print(bookShelf.ToString());

        bookShelf.SortByYearBooks();
        System.out.println("Сортировка.....");
        System.out.print(bookShelf.ToString());
    }
}
