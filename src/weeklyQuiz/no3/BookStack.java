package weeklyQuiz.no3;

import java.util.EmptyStackException;
import java.util.Stack;

public class BookStack<T> {
    private Stack<Book<T>> books;

    // BookStack 생성자
    public BookStack() {
        this.books = new Stack<>();
    }

    // 새 도서를 스택의 맨 위에 추가
    public void pushBook(Book<T> book) {
        books.push(book);
    }

    // 스택의 맨 위 도서를 제거하고 반환, 스택이 비어있으면 예외 발생
    public Book<T> popBook() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return books.pop();
    }

    // 스택의 맨 위 도서를 반환하지만 제거하지는 않습니다. 스택이 비어있으면 예외를 발생
    public Book<T> peekBook() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return books.peek();
    }

    // 스택이 비어있는지 확인
    public boolean isEmpty() {
        return books.isEmpty();
    }
}