public class DeadLock {
    public static Object o1 = new Object();
    public static Object o2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (o1) {
                System.out.println("Thread 1 acquired o1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (o2) {
                    System.out.println("Thread 1 acquired o2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (o2) {
                System.out.println("Thread 2 acquired o2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (o1) {
                    System.out.println("Thread 2 acquired o1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}