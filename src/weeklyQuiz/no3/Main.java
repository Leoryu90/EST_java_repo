package weeklyQuiz.no3;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookShelf<String> bookShelf = new BookShelf<>();
        BookStack<Integer> bookStack = new BookStack<>();
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 도서 정보 입력 받기 (BookShelf용)
        System.out.println("도서 정보를 입력하세요 (BookShelf용):");
        System.out.print("제목: ");
        String shelfTitle = scanner.nextLine();
        System.out.print("저자: ");
        String shelfAuthor = scanner.nextLine();
        System.out.print("식별자 (문자열): ");
        String shelfIdentifier = scanner.nextLine();

        Book<String> shelfBook = new Book<>(shelfTitle, shelfAuthor, shelfIdentifier);
        bookShelf.addBook(shelfBook);

        // 사용자로부터 도서 정보 입력 받기(BookStack용)
        System.out.println("\n도서 정보를 입력하세요 (BookStack용):");
        System.out.print("제목: ");
        String stackTitle = scanner.nextLine();
        System.out.print("저자: ");
        String stackAuthor = scanner.nextLine();
        System.out.print("식별자 (정수): ");
        int stackIdentifier = Integer.parseInt(scanner.nextLine());

        Book<Integer> stackBook = new Book<>(stackTitle, stackAuthor, stackIdentifier);
        bookStack.pushBook(stackBook);

        // 제목으로 검색 수행
        System.out.print("\n검색할 도서 제목: ");
        String searchTitle = scanner.nextLine();
        List<Book<String>> titleSearchResult = bookShelf.searchByTitle(searchTitle);
        System.out.println("제목 검색 결과:");
        for (Book<String> book : titleSearchResult) {
            System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor() + ", 식별자: " + book.getIdentifier());
        }

        // 저자로 검색 수행
        System.out.print("\n검색할 도서 저자: ");
        String searchAuthor = scanner.nextLine();
        List<Book<String>> authorSearchResult = bookShelf.searchByAuthor(searchAuthor);
        System.out.println("저자 검색 결과:");
        System.out.println("검색된 도서 수: " + authorSearchResult.size());  // 디버깅용 출력
        for (Book<String> book : authorSearchResult) {
            System.out.println("제목: " + book.getTitle() + ", 저자: " + book.getAuthor() + ", 식별자: " + book.getIdentifier());
        }

        // BookStack 작업 수행
        System.out.println("\nBookStack 작업:");
        Book<Integer> poppedBook = bookStack.popBook();
        System.out.println("꺼낸 도서: 제목: " + poppedBook.getTitle() + ", 저자: " + poppedBook.getAuthor() + ", 식별자: " + poppedBook.getIdentifier());

        bookStack.pushBook(poppedBook);  // 다시 넣기

        Book<Integer> peekedBook = bookStack.peekBook();
        System.out.println("맨 위의 도서: 제목: " + peekedBook.getTitle() + ", 저자: " + peekedBook.getAuthor() + ", 식별자: " + peekedBook.getIdentifier());

        System.out.println("BookStack이 비어있나요? " + bookStack.isEmpty());

        scanner.close();
    }
}