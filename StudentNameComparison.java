public class StudentNameComparison {
    public static void main(String[] args) {
        String name1 = "Alice";
        String name2 = "alice";
        
        System.out.println("Name 1: " + name1);
        System.out.println("Name 2: " + name2);
        
        if (name1.equals(name2)) {
            System.out.println("Names are equal (case-sensitive)");
        } else {
            System.out.println("Names are not equal (case-sensitive)");
        }
        
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Names are equal (case-insensitive)");
        } else {
            System.out.println("Names are not equal (case-insensitive)");
        }
    }
}
