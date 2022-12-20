package dz2_7;

public class BookShelf {
    private Book[] books = {};

    private int maxBooksCount = 0;
    private int currentBooksCount = 0;

    BookShelf(int maxBooksCount)
    {
        books = new Book[maxBooksCount];
        this.maxBooksCount = maxBooksCount;
    }

    public boolean AddBook(Book book)
    {
        if (currentBooksCount >= maxBooksCount)
            return false;

        books[currentBooksCount] = book;
        currentBooksCount++;

        return true;
    }

    public Book GetLatestBook()
    {
        Book latestBook = new Book("none", "none", 0, 0);

        for(Book book : books)
            if(book.GetYear() > latestBook.GetYear())
                latestBook = book;

        return latestBook;
    }

    public Book GetOldestBook()
    {
        Book oldestBook = GetLatestBook();

        for(Book book : books)
            if(book.GetYear() < oldestBook.GetYear())
                oldestBook = book;

        return oldestBook;
    }

    public void SortByYearBooks()
    {
        Book temp1 = books[0];
        int temp1Id = 0;
        int sortedBooks = 0;

        while (sortedBooks < books.length)
        {
            for (int counter = 0; counter < books.length - sortedBooks; counter++) {
                Book book = books[counter];

                if (book.GetYear() > temp1.GetYear())
                {
                    temp1 = book;
                    temp1Id = counter;
                }
            }
            int lastUnSortedBookId = books.length - 1 - sortedBooks;
            books[temp1Id] = books[lastUnSortedBookId];
            books[lastUnSortedBookId] = temp1;

            temp1 = books[0];
            temp1Id = 0;
            sortedBooks++;
        }
    }

    public String ToString()
    {
        String booksString = "";

        for (Book book: books)
        {
            booksString += String.format("Автор: %s, Книга: %s, Год: %s, Листы: %s\n", book.GetAuthor(), book.GetName(), book.GetYear(), book.GetPages());
        }
        return booksString;
    }
}