// Question 12: Payment Methods - Demonstrating Abstraction and Polymorphism

abstract class Payment {
    protected String transactionId;
    
    public Payment() {
        this.transactionId = "TXN" + System.nanoTime();
    }
    
    // Abstract method - to be implemented by subclasses
    public abstract void pay(double amount);
    
    // Common method
    public void printReceipt(double amount) {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: Rs. " + amount);
    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolderName;
    
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        super();
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("--- Credit Card Payment ---");
        System.out.println("Cardholder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber.substring(cardNumber.length() - 4));
        printReceipt(amount);
        System.out.println("Status: Payment Success (Credit Card)\n");
    }
}

class UPIPayment extends Payment {
    private String upiId;
    
    public UPIPayment(String upiId) {
        super();
        this.upiId = upiId;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("--- UPI Payment ---");
        System.out.println("UPI ID: " + upiId);
        printReceipt(amount);
        System.out.println("Status: Payment Success (UPI)\n");
    }
}

class NetBankingPayment extends Payment {
    private String bankName;
    private String accountNumber;
    
    public NetBankingPayment(String bankName, String accountNumber) {
        super();
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("--- Net Banking Payment ---");
        System.out.println("Bank: " + bankName);
        System.out.println("Account: " + accountNumber);
        printReceipt(amount);
        System.out.println("Status: Payment Success (Net Banking)\n");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        System.out.println("=== Payment Processing System ===\n");
        
        // Create different payment objects
        Payment creditCardPay = new CreditCardPayment("1234567890123456", "Rajesh Kumar");
        Payment upiPay = new UPIPayment("rajesh@okhdfcbank");
        Payment netBankingPay = new NetBankingPayment("HDFC Bank", "1234567890");
        
        // Process payments using polymorphism
        double amount = 5000;
        
        creditCardPay.pay(amount);
        upiPay.pay(amount);
        netBankingPay.pay(amount);
        
        System.out.println("=== All Payments Processed Successfully ===");
    }
}
