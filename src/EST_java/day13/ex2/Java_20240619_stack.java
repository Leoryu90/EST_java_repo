package EST_java.day13.ex2;

import java.util.Stack;

public class Java_20240619_stack {
  public static void main(String[] args) {
    Stack<Coin> coinStack = new Stack<>();

    coinStack.push(new Coin(100));
    coinStack.push(new Coin(500));
    coinStack.push(new Coin(10));
    coinStack.push(new Coin(50));

    while(!coinStack.isEmpty()){
      Coin pop = coinStack.pop();
      System.out.println(pop.getValue());
    }

  }
}
