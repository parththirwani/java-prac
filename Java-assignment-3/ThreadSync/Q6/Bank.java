package Q6;

public class Bank {
    private int balance = 15000;

    public synchronized void withdraw(int amount, String threadName) {
        if (amount <= balance) {
            System.out.println(threadName + " is trying to withdraw " + amount + " from the balance" + balance);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The thread was interrupted" + e.getMessage());
            }
            balance-=amount;
        }else{
            System.out.println("The bank balance is insufficient");
        }
        System.out.println("The balance left is: "+balance);
    }

    public int getBalnce(){
        return balance;
    }

    public static void main(String[] args) {
        Bank account = new Bank();

        Thread t1 = new Thread(()->{
            account.withdraw(100, "parth");
        });

        Thread t2 = new Thread(()->{
            account.withdraw(15000, "ram");
        });

        t1.start();
        t2.start();
    }
}
