package EST_java.day13.ex3;

public class Message {
    private String command;
    private String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }
}
