package Q7;

class BankAccount {
    private int balance = 10000;

    // Withdraw using synchronized block
    public void withdraw(int amount, String threadName) {
        System.out.println(threadName + " is trying to withdraw ₹" + amount);
        
        // Synchronize only the critical section
        synchronized (this) {
            if (balance >= amount) {
                try {
                    Thread.sleep(100); // Simulate delay
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
                balance -= amount;
                System.out.println(threadName + " successfully withdrew ₹" + amount);
            } else {
                System.out.println(threadName + " tried to withdraw ₹" + amount + " but insufficient balance");
            }
            System.out.println("Current balance: ₹" + balance);
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class SynchronizedBlockBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Thread 1
        Thread t1 = new Thread(() -> {
            account.withdraw(700, "Thread 1");
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            account.withdraw(700, "Thread 2");
        });

        t1.start();
        t2.start();
    }
}

