package weeklyQuiz.no3;

import java.util.List;

public interface BookManager<T> {
    // 도서를 추가하는 메소드
    void addBook(Book<T> book);

    // 도서를 삭제하는 메소드
    void removeBook(Book<T> book);

    // 도서 제목으로 검색하는 메소드
    List<Book<T>> searchByTitle(String title);

    // 도서 저자로 검색하는 메소드
    List<Book<T>> searchByAuthor(String author);
}
