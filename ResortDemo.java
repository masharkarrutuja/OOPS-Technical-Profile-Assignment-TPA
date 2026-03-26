import java.util.Scanner;

class Resort {
    private int rNo;
    private String name;
    private double charges;
    private int days;

    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        rNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Guest Name: ");
        name = sc.nextLine();
        System.out.print("Enter Daily Charges: ");
        charges = sc.nextDouble();
        System.out.print("Enter Number of Days: ");
        days = sc.nextInt();
    }

    public double compute() {
        double total = charges * days;
        if (total > 11000) {
            total = total + (total * 0.02);
        }
        return total;
    }

    public void dispInfo() {
        double total = compute();
        System.out.println("\n=== Resort Booking Details ===");
        System.out.println("Room Number: " + rNo);
        System.out.println("Guest Name: " + name);
        System.out.println("Daily Charges: Rs. " + charges);
        System.out.println("Number of Days: " + days);
        System.out.println("Total Amount: Rs. " + total);
    }
}

public class ResortDemo {
    public static void main(String[] args) {
        Resort resort = new Resort();
        resort.getInfo();
        resort.dispInfo();
    }
}
