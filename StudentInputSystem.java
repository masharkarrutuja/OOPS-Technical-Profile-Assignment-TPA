import java.util.InputMismatchException;

public class StudentInputSystem {
    public static void main(String[] args) {
        int studentId = 0;
        int marks = 0;
        
        try {
            studentId = Integer.parseInt("ABC123");
            marks = 100 / 0;
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid student ID format");
            System.out.println("Message: " + e.getMessage());
            studentId = 101;
        } catch (ArithmeticException e) {
            System.out.println("Error: Invalid marks calculation");
            System.out.println("Message: " + e.getMessage());
            marks = 85;
        } catch (Exception e) {
            System.out.println("General error occurred: " + e);
        }
        
        System.out.println("Student ID: " + studentId);
        System.out.println("Marks: " + marks);
        
        try {
            int[] scores = {85, 90, 78};
            System.out.println("Score at index 5: " + scores[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
            System.out.println("Message: " + e.getMessage());
        }
    }
}
