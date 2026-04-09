public class ATMWithdrawal {
    static class InsufficientFundsException extends Exception {
        InsufficientFundsException(String message) {
            super(message);
        }
    }
    
    public static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal amount " + amount + " exceeds balance " + balance);
        }
        System.out.println("Withdrawal successful: " + amount);
        System.out.println("Remaining balance: " + (balance - amount));
    }
    
    public static void main(String[] args) {
        double balance = 5000;
        
        try {
            withdraw(balance, 2000);
            withdraw(balance, 4000);
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
