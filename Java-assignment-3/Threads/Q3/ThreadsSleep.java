package Threads.Q3;

public class ThreadsSleep {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("Thread 1");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    System.out.println("Thread 1 interrupted: "+e.getMessage());
                }
            }
        });

        Thread thread2 = new Thread(()->{
            while (true) {
                System.out.println("Thread 2");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    System.out.println("Thread 2 interrupted "+e.getMessage());
                }
            }
        });
        thread1.start();
        thread2.start();

    }

};

