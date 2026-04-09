public class PasswordMaskingSystem {
    public static void main(String[] args) {
        String password = "SecurePass123";
        
        System.out.println("Original password: " + password);
        
        String maskedPassword = password.replaceAll(".(?=.{2})", "*");
        System.out.println("Masked password: " + maskedPassword);
        
        String anotherPassword = "MyP@ssw0rd";
        String masked2 = anotherPassword.replaceAll(".(?=.{2})", "*");
        System.out.println("Another password: " + anotherPassword);
        System.out.println("Masked variant: " + masked2);
    }
}
