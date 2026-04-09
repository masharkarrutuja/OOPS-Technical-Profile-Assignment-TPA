public class ThreadPrioritySystem extends Thread {
    ThreadPrioritySystem(String name, int priority) {
        super(name);
        setPriority(priority);
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " (Priority: " + Thread.currentThread().getPriority() + ") - Executing task " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished execution");
    }
    
    public static void main(String[] args) {
        ThreadPrioritySystem lowPriorityThread = new ThreadPrioritySystem("LowPriorityTask", Thread.MIN_PRIORITY);
        ThreadPrioritySystem normalPriorityThread = new ThreadPrioritySystem("NormalPriorityTask", Thread.NORM_PRIORITY);
        ThreadPrioritySystem highPriorityThread = new ThreadPrioritySystem("HighPriorityTask", Thread.MAX_PRIORITY);
        
        lowPriorityThread.start();
        normalPriorityThread.start();
        highPriorityThread.start();
    }
}
