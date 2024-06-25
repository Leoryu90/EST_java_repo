package weeklyQuiz.no3;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements BookManager{
    private List<Book> books;


    public BookShelf() {
        this.books = new ArrayList<>();
    }


    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return List.of();
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        return List.of();
    }
}
