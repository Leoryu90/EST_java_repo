package EST_java.day14;

public class MyRunnable implements Runnable{

    private int number;

    public MyRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(this.number);
    }
}