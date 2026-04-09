public class OnlineShoppingSystem {
    static class ShoppingCart {
        private double cartTotal = 0;
        private String orderStatus = "Pending";
        
        public void processPayment(String customerName, double amount) {
            System.out.println(customerName + " is processing payment of: " + amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cartTotal = amount;
            System.out.println("Payment processed successfully for: " + customerName);
        }
        
        public void processOrder(String customerId) {
            System.out.println("Processing order for customer: " + customerId);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            orderStatus = "Confirmed";
            System.out.println("Order confirmed for customer: " + customerId);
        }
    }
    
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        Thread paymentThread = new Thread(() -> {
            cart.processPayment("Customer1", 5999.99);
        });
        
        Thread orderThread = new Thread(() -> {
            cart.processOrder("CUST001");
        });
        
        paymentThread.start();
        orderThread.start();
        
        try {
            paymentThread.join();
            orderThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Shopping process completed");
    }
}
