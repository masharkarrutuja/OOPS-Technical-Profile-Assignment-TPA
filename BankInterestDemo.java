class Bank {
    private final double interestRate;

    public Bank(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest(double amount) {
        return amount * interestRate / 100;
    }

    public void displayInterest(String customerName, double amount) {
        double interest = calculateInterest(amount);
        System.out.println("Customer: " + customerName + ", Amount: " + amount + ", Interest: " + interest);
    }
}

class BankInterestDemo {
    public static void main(String[] args) {
        Bank bank = new Bank(5.5);

        bank.displayInterest("John", 10000);
        bank.displayInterest("Sarah", 25000);
        bank.displayInterest("Mike", 50000);
    }
}
