package Threads.Q5;

public class DaemonThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Main Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted" + e.getMessage());
                }
            }
        });
        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("Daemon Thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("DaemonThread interrupted" + e.getMessage());
                }
            }
        });
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
