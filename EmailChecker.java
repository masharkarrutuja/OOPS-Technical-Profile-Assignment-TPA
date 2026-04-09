public class EmailChecker {
    public static void main(String[] args) {
        String email = "user@gmail.com";
        if (email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }
    }
}
