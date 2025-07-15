package Threads.Q2;

public class Hello implements Runnable{
    public void run(){
        for(int i = 0; i<5; i++){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Hello());
        t1.start();
    }
}
