public class BankingSystem {
    static class BankAccount {
        private double balance = 5000;
        
        public void withdraw(String accountHolder, double amount) {
            synchronized (this) {
                if (balance >= amount) {
                    System.out.println(accountHolder + " is withdrawing: " + amount);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    balance -= amount;
                    System.out.println(amount + " withdrawn. New balance: " + balance);
                } else {
                    System.out.println(accountHolder + " cannot withdraw " + amount + ". Insufficient balance: " + balance);
                }
            }
        }
        
        public void deposit(String accountHolder, double amount) {
            synchronized (this) {
                System.out.println(accountHolder + " is depositing: " + amount);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance += amount;
                System.out.println(amount + " deposited. New balance: " + balance);
            }
        }
        
        public double getBalance() {
            return balance;
        }
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        Thread user1 = new Thread(() -> {
            account.withdraw("User1", 2000);
        });
        
        Thread user2 = new Thread(() -> {
            account.deposit("User2", 1500);
        });
        
        Thread user3 = new Thread(() -> {
            account.withdraw("User3", 1000);
        });
        
        user1.start();
        user2.start();
        user3.start();
        
        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Final balance: " + account.getBalance());
    }
}
