package weeklyQuiz.no3;

public class Book<T> {
    private String title;  // 책의 제목
    private String author; // 책의 저자
    private T identifier;  // 책의 고유 식별자


    // Book 클래스의 생성자
    public Book(String title, String author, T identifier){
        this.title = title;
        this.author = author;
        this.identifier = identifier;
    }

    // 각 변수의 getter 메서드

    // 책의 제목을 반환
    public String getTitle() {
        return title;
    }

    // 책의 저자를 반환
    public String getAuthor() {
        return author;
    }

    //책의 고유 식별자를 반환
    public T getIdentifier() {
        return identifier;
    }


}
