package Threads.Q1;

public class NumberPrinterThread implements Runnable{

    @Override
    public void run(){
        try{
        for(int i =0; i<10;i++){
            System.out.println(i+1);
            Thread.sleep(1000);
        }
    }catch (InterruptedException e){
        System.out.println("Interruption occured: "+e.getMessage());
    }
    }
    public static void main(String[] args) {
    Thread thread = new Thread(new NumberPrinterThread());
    thread.start();
    }
}