public class Restaurant {
    static class Kitchen {
        private int foodCount = 0;
        
        public synchronized void produceFood(String dishName) {
            if (foodCount >= 3) {
                System.out.println("Kitchen full, cannot produce more " + dishName);
                return;
            }
            foodCount++;
            System.out.println("Chef produced: " + dishName + " (Total: " + foodCount + ")");
        }
        
        public synchronized void consumeFood(String customerName) {
            if (foodCount == 0) {
                try {
                    System.out.println(customerName + " waiting for food...");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (foodCount > 0) {
                foodCount--;
                System.out.println(customerName + " consumed food (Remaining: " + foodCount + ")");
                notify();
            }
        }
    }
    
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        
        Thread chef = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                kitchen.produceFood("Biryani");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        Thread customer1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                kitchen.consumeFood("Customer1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        Thread customer2 = new Thread(() -> {
            for (int i = 0; i < 2; i++) {
                kitchen.consumeFood("Customer2");
                try {
                    Thread.sleep(1200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        chef.start();
        customer1.start();
        customer2.start();
    }
}
