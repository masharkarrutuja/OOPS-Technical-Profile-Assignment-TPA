public class MusicPlayer extends Thread {
    private String songName;
    
    MusicPlayer(String songName) {
        this.songName = songName;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Playing: " + songName + " - Progress: " + (i + 1) * 20 + "%");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Playback interrupted");
            }
        }
        System.out.println("Song \"" + songName + "\" finished playing");
    }
    
    public static void main(String[] args) {
        MusicPlayer player1 = new MusicPlayer("Bohemian Rhapsody");
        MusicPlayer player2 = new MusicPlayer("Imagine");
        
        player1.start();
        
        try {
            player1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        player2.start();
    }
}
