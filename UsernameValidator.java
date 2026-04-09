public class UsernameValidator {
    public static void main(String[] args) {
        String username = "  john_doe  ";
        String cleanedUsername = username.trim().toLowerCase();
        System.out.println("Original: '" + username + "'");
        System.out.println("Cleaned: '" + cleanedUsername + "'");
    }
}
