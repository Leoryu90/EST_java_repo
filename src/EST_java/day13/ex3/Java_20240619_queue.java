package EST_java.day13.ex3;

import java.util.LinkedList;
import java.util.Queue;

public class Java_20240619_queue {
  public static void main(String[] args) {
    Queue<Message> messageQueue = new LinkedList<>();

    messageQueue.offer(new Message("sendMail", "1"));
    messageQueue.offer(new Message("sendDM", "2"));
    messageQueue.offer(new Message("sendTalk", "3"));
    messageQueue.offer(new Message("sendCall", "4"));
    messageQueue.offer(new Message("sendPhoto", "5"));

    while (!messageQueue.isEmpty()) {
      Message message = messageQueue.poll();
      switch (message.getCommand()) {
        case "sendMail":
          System.out.println(message.getTo() + "에게 메일을 보냅니다.");
          break;
        case "sendDM":
          System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
          break;
        case "sendTalk":
          System.out.println(message.getTo() + "에게 카톡을 보냅니다.");
          break;
        case "sendCall":
          System.out.println(message.getTo() + "에게 전화를 겁니다.");
          break;
        default:
          System.out.println(message.getTo() + "에게 아무거나 보냅니다.");
      }
    }
  }
}
