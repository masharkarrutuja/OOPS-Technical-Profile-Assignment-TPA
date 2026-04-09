public class RailwayReservation {
    static class SeatReservation {
        private int availableSeats = 5;
        
        public synchronized boolean reserveSeat(String passengerName, int seatsNeeded) {
            if (availableSeats >= seatsNeeded) {
                System.out.println(passengerName + " is reserving " + seatsNeeded + " seats");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                availableSeats -= seatsNeeded;
                System.out.println(seatsNeeded + " seats reserved for " + passengerName + ". Remaining: " + availableSeats);
                return true;
            } else {
                System.out.println(passengerName + " could not reserve " + seatsNeeded + " seats. Only " + availableSeats + " available");
                return false;
            }
        }
    }
    
    public static void main(String[] args) {
        SeatReservation reservation = new SeatReservation();
        
        Thread t1 = new Thread(() -> {
            reservation.reserveSeat("Passenger A", 2);
        });
        
        Thread t2 = new Thread(() -> {
            reservation.reserveSeat("Passenger B", 3);
        });
        
        Thread t3 = new Thread(() -> {
            reservation.reserveSeat("Passenger C", 2);
        });
        
        t1.start();
        t2.start();
        t3.start();
    }
}
