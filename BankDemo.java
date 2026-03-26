interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    @Override
    public double getInterestRate() {
        return 7.0;
    }
}

class HDFC implements Bank {
    @Override
    public double getInterestRate() {
        return 6.5;
    }
}

class ICICI implements Bank {
    @Override
    public double getInterestRate() {
        return 6.0;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        System.out.println("=== Bank Interest Rates ===\n");

        Bank sbi = new SBI();
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");

        Bank hdfc = new HDFC();
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");

        Bank icici = new ICICI();
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
