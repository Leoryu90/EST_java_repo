package EST_java.day10.ex3;

public class Java_20240614_error5 {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();

    try {
      account.withdraw(10000);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }
  }
}
