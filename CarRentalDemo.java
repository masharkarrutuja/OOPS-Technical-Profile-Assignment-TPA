import java.util.Scanner;

class CarRental {
    private String carType;
    private int days;
    private double rent;

    public void getCar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car type (Small Car/Van/SUV): ");
        carType = sc.nextLine();
        System.out.print("Enter number of days: ");
        days = sc.nextInt();
    }

    public void getRent() {
        if (carType.equalsIgnoreCase("Small Car")) {
            rent = 1000 * days;
        } else if (carType.equalsIgnoreCase("Van")) {
            rent = 800 * days;
        } else if (carType.equalsIgnoreCase("SUV")) {
            rent = 2500 * days;
        } else {
            rent = 0;
        }
    }

    public void showCar() {
        System.out.println("\n=== Rental Details ===");
        System.out.println("Car Type: " + carType);
        System.out.println("Days: " + days);
        System.out.println("Total Rent: Rs. " + rent);
    }
}

public class CarRentalDemo {
    public static void main(String[] args) {
        CarRental rental = new CarRental();
        rental.getCar();
        rental.getRent();
        rental.showCar();
    }
}
