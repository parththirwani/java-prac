package Threads.ThreadImpl;

public class LambdaThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->System.out.println("The thread is running"));
        t1.start();
    }
}
