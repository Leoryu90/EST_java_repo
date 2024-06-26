package weeklyQuiz.no3;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
    private Stack<Book<T>> books;

    public BookStack() {
        this.books = new Stack<>();
    }

    public void pushBook(Book<T> book) {
        books.push(book);
    }

    public Book<T> popBook() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return books.pop();
    }

    public Book<T> peekBook() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return books.peek();
    }

    public boolean isEmpty() {
        return books.isEmpty();
    }
}