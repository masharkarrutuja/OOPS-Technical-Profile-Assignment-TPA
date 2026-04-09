import java.io.FileReader;
import java.io.IOException;

public class FileProcessingSystem {
    public static void main(String[] args) {
        FileReader reader = null;
        
        try {
            reader = new FileReader("nonexistent.txt");
            System.out.println("File opened successfully");
            int data = reader.read();
            System.out.println("Data read: " + data);
        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read");
            System.out.println("Exception: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("File closed and resources cleaned up");
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
            System.out.println("Cleanup process completed");
        }
        
        System.out.println("Program execution finished");
    }
}
