package EST_java.day7;

import java.util.Scanner;

public class Java_20240611_8_bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("계좌번호를 입력하세요: ");
        String accountNumber = scanner.nextLine();
        System.out.print("소유자 이름을 입력하세요: ");
        String ownerName = scanner.nextLine();
        Java_20240611_9_bankAccount account = new Java_20240611_9_bankAccount(accountNumber, ownerName);

        // 입금 및 출금
        account.deposit(500);
        account.withdraw(50000);

        // 잔액 조회
        account.printBalance();

        scanner.close();
    }
}
