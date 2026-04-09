public class BankApplication {
    static class BankException extends Exception {
        BankException(String message) {
            super(message);
        }
    }
    
    public static void processTransaction(double amount, double balance) throws BankException {
        if (amount <= 0) {
            throw new BankException("Amount must be greater than zero");
        }
        if (amount > balance) {
            throw new BankException("Insufficient balance for transaction");
        }
        System.out.println("Transaction successful for amount: " + amount);
    }
    
    public static void main(String[] args) {
        double accountBalance = 10000;
        
        try {
            processTransaction(5000, accountBalance);
            accountBalance -= 5000;
            System.out.println("Remaining balance: " + accountBalance);
        } catch (BankException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        
        try {
            processTransaction(8000, accountBalance);
        } catch (BankException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        
        try {
            processTransaction(-1000, accountBalance);
        } catch (BankException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
