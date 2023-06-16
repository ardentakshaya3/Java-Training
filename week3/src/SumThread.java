import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SumThread {
    public static final int size = 100;
    public static final int threadCount = 5;
    public static int[] arr = new int[size];
    public static int[] partial = new int[threadCount];

    public static void main(String[] args) {
        // Fill the arr with values from 1 to 100
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        for (int i = 0; i < threadCount; i++) {
            int startIndex = i * (size / threadCount);
            int endIndex = startIndex + (size / threadCount);
            executor.execute(new PartialSumCalculator(i, startIndex, endIndex));
        }

        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int finalSum = 0;
        for (int sum : partial) {
            finalSum += sum;
        }

        System.out.println("Final sum: " + finalSum);
    }

    private static class PartialSumCalculator implements Runnable {
        private int threadId;
        private int startIndex;
        private int endIndex;

        public PartialSumCalculator(int threadId, int startIndex, int endIndex) {
            this.threadId = threadId;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            int sum = 0;
            for (int i = startIndex; i < endIndex; i++) {
                sum += arr[i];
            }

            partial[threadId] = sum;
        }
    }
}