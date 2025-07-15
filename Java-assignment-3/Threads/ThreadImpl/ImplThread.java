package Threads.ThreadImpl;

public class ImplThread implements Runnable {
    public void run(){
        System.out.println("The thread is running...");
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new ImplThread());
        t1.start();
    }
}
