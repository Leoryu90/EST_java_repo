package weeklyQuiz.no3;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements BookManager<T> {
    private List<Book<T>> books;

    // 생성자
    public BookShelf() {
        this.books = new ArrayList<>();
    }

    // Book 객체를 books 리스트에 삽입
    @Override
    public void addBook(Book<T> book) {
        books.add(book);
    }

    // Book 객체를 books 리스트에서 제거
    @Override
    public void removeBook(Book<T> book) {
        books.remove(book);
    }

    // Book 객체의 제목이 주어진 제목(title)을 포함하는지 확인
    @Override
    public List<Book<T>> searchByTitle(String title) {
        List<Book<T>> result = new ArrayList<>();
        for (Book<T> book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    // 저자로 검색 하는 메소드
    @Override
    public List<Book<T>> searchByAuthor(String author) {
        List<Book<T>> result = new ArrayList<>();
        for (Book<T> book : books) {
            if (book.getTitle().toLowerCase().contains(author.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }
}
