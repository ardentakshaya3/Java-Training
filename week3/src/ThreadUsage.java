import java.lang.Thread;

class NThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadUsage {
    public static void main(String[] args) {
        NThread thread = new NThread();
        thread.start();
    }
}
