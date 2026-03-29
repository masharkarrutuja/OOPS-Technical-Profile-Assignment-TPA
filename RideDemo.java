// Question 15: Ride Fare System - Demonstrating Runtime Polymorphism with Array

abstract class Ride {
    protected double distance;
    protected String rideType;
    
    public Ride(double distance, String rideType) {
        this.distance = distance;
        this.rideType = rideType;
    }
    
    // Abstract method - must be implemented by subclasses
    public abstract double calculateFare();
    
    public void displayRideInfo() {
        System.out.println("Ride Type: " + rideType);
        System.out.println("Distance: " + distance + " km");
    }
}

class BikeRide extends Ride {
    private static final double RATE_PER_KM = 5.0;
    
    public BikeRide(double distance) {
        super(distance, "Bike");
    }
    
    @Override
    public double calculateFare() {
        // Bike: Rs. 5 per km
        return distance * RATE_PER_KM;
    }
}

class AutoRide extends Ride {
    private static final double RATE_PER_KM = 8.0;
    
    public AutoRide(double distance) {
        super(distance, "Auto Rickshaw");
    }
    
    @Override
    public double calculateFare() {
        // Auto: Rs. 8 per km
        return distance * RATE_PER_KM;
    }
}

class CarRide extends Ride {
    private static final double RATE_PER_KM = 12.0;
    
    public CarRide(double distance) {
        super(distance, "Car");
    }
    
    @Override
    public double calculateFare() {
        // Car: Rs. 12 per km
        return distance * RATE_PER_KM;
    }
}

public class RideDemo {
    public static void main(String[] args) {
        System.out.println("=== Ride Fare Calculator System ===\n");
        
        // Create individual ride objects
        BikeRide bikeRide = new BikeRide(10);
        System.out.println("--- Bike Ride ---");
        bikeRide.displayRideInfo();
        System.out.println("Fare: Rs. " + bikeRide.calculateFare() + "\n");
        
        AutoRide autoRide = new AutoRide(15);
        System.out.println("--- Auto Ride ---");
        autoRide.displayRideInfo();
        System.out.println("Fare: Rs. " + autoRide.calculateFare() + "\n");
        
        CarRide carRide = new CarRide(20);
        System.out.println("--- Car Ride ---");
        carRide.displayRideInfo();
        System.out.println("Fare: Rs. " + carRide.calculateFare() + "\n");
        
        // Runtime Polymorphism - Array of Ride objects
        System.out.println("=== Multiple Rides Booking System ===\n");
        
        Ride[] rides = {
            new BikeRide(8),
            new AutoRide(12),
            new CarRide(25),
            new BikeRide(5),
            new AutoRide(10)
        };
        
        double totalFare = 0;
        
        for (int i = 0; i < rides.length; i++) {
            System.out.println("Ride #" + (i + 1));
            rides[i].displayRideInfo();
            double fare = rides[i].calculateFare();
            System.out.println("Fare: Rs. " + fare);
            totalFare += fare;
            System.out.println();
        }
        
        System.out.println("=== Summary ===");
        System.out.println("Total Number of Rides: " + rides.length);
        System.out.println("Total Fare Collected: Rs. " + totalFare);
        System.out.println("Average Fare per Ride: Rs. " + String.format("%.2f", totalFare / rides.length));
    }
}
