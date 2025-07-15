package Threads.Q4;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("Thread 1");

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted" + e.getMessage());
                }
            }

        });
        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("Thread 2");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    System.out.println("Thread 2 interrupted" + e.getMessage());
                }

            }

        });

        t1.setPriority(1);
        t2.setPriority(2);
        t1.start();
        t2.start();
    }

}
