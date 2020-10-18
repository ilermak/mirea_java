package ex_11;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class Threads {

    static int totalSum;
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            final int localI = i;
            Thread thread = new Thread(() -> hardFunction(localI));
            thread.start();
            threads.add(thread);
        }

        for (Thread t : threads) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("total sum: " + totalSum);
    }



    private static void hardFunction(int a) {
        for (int i = 0; i < 10; i++) {
            long startTime = System.currentTimeMillis();
            long result = doHardWork(a * 1000, 100_000_000);
            long endTime = System.currentTimeMillis();
            System.out.println(a + ": " + result + " | time: " + (endTime - startTime));
        }

    }

    private synchronized static long doHardWork(int start, int count) {
        long a = 0;
        for (int i = 0; i < count; i++) {
            a += (start + i) * (start + i) * Math.sqrt(start + i) * (start*start + i*i);
            totalSum++;
        }
        return a;
    }
}