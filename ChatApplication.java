public class ChatApplication {
    static class ChatRoom {
        private String lastMessage = "";
        
        public void sendMessage(String sender, String message) {
            lastMessage = message;
            System.out.println("[" + sender + "] sending: " + message);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + sender + "] message sent");
        }
        
        public void receiveMessage(String receiver) {
            System.out.println("[" + receiver + "] waiting for message...");
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("[" + receiver + "] received: " + lastMessage);
        }
    }
    
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        
        Thread sender1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Sender-Alice");
                System.out.println("Thread: " + Thread.currentThread().getName() + " (State: " + Thread.currentThread().getState() + ") started");
                chatRoom.sendMessage("Alice", "Hello Bob!");
                System.out.println("Thread: " + Thread.currentThread().getName() + " (State: " + Thread.currentThread().getState() + ")");
            }
        });
        
        Thread receiver1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Receiver-Bob");
                System.out.println("Thread: " + Thread.currentThread().getName() + " (State: " + Thread.currentThread().getState() + ") started");
                chatRoom.receiveMessage("Bob");
                System.out.println("Thread: " + Thread.currentThread().getName() + " (State: " + Thread.currentThread().getState() + ")");
            }
        });
        
        Thread sender2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName("Sender-Bob");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread: " + Thread.currentThread().getName() + " (State: " + Thread.currentThread().getState() + ") started");
                chatRoom.sendMessage("Bob", "Hi Alice! How are you?");
                System.out.println("Thread: " + Thread.currentThread().getName() + " (State: " + Thread.currentThread().getState() + ")");
            }
        });
        
        sender1.start();
        receiver1.start();
        sender2.start();
        
        try {
            sender1.join();
            receiver1.join();
            sender2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Chat session ended");
    }
}
