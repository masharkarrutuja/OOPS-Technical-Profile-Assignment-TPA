public class DownloadManager {
    static class DownloadTask implements Runnable {
        private String fileName;
        private int downloadSpeed;
        
        DownloadTask(String fileName, int downloadSpeed) {
            this.fileName = fileName;
            this.downloadSpeed = downloadSpeed;
        }
        
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Downloading: " + fileName + " - " + (i + 1) * 20 + "% (Speed: " + downloadSpeed + " MB/s)");
                try {
                    Thread.sleep(downloadSpeed * 100);
                } catch (InterruptedException e) {
                    System.out.println("Download interrupted");
                }
            }
            System.out.println("Download completed: " + fileName);
        }
    }
    
    public static void main(String[] args) {
        Thread download1 = new Thread(new DownloadTask("Document.pdf", 5));
        Thread download2 = new Thread(new DownloadTask("Video.mp4", 10));
        Thread download3 = new Thread(new DownloadTask("Image.zip", 8));
        
        download1.start();
        download2.start();
        download3.start();
        
        System.out.println("All downloads started");
    }
}
