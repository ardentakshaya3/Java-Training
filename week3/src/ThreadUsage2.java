import java.lang.Thread;

class NumberRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadUsage2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberRunnable());
        thread.start();
    }
}
