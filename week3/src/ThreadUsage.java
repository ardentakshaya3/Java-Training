import java.lang.Thread;

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadUsage {
    public static void main(String[] args) {
        NumberThread thread = new NumberThread();
        thread.start();










































    }
}
