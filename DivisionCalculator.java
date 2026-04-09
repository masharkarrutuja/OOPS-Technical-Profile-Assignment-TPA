public class DivisionCalculator {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int divisor = 0;
        
        try {
            System.out.println("Performing divisions:");
            for (int num : numbers) {
                int result = num / divisor;
                System.out.println(num + " / " + divisor + " = " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
            System.out.println("Exception details: " + e.getMessage());
        } finally {
            System.out.println("Division operation completed");
        }
        
        System.out.println("\nCorrect division:");
        try {
            int result = 100 / 5;
            System.out.println("100 / 5 = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
        }
    }
}
