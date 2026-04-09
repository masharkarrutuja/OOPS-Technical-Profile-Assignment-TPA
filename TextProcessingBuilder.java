public class TextProcessingBuilder {
    public static void main(String[] args) {
        // StringBuilder is faster and not thread-safe, while StringBuffer is synchronized and thread-safe
        StringBuilder builder = new StringBuilder("Programming");
        
        System.out.println("Original: " + builder);
        
        builder.append(" in Java");
        System.out.println("After append: " + builder);
        
        builder.insert(11, " is fun");
        System.out.println("After insert: " + builder);
        
        builder.reverse();
        System.out.println("Reversed: " + builder);
        
        System.out.println("Character at index 0: " + builder.charAt(0));
    }
}
