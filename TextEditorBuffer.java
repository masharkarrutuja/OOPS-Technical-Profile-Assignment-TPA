public class TextEditorBuffer {
    public static void main(String[] args) {
        StringBuffer editor = new StringBuffer("Hello World");
        
        System.out.println("Original text: " + editor);
        
        editor.append(" from Java");
        System.out.println("After append: " + editor);
        
        editor.insert(6, "Beautiful ");
        System.out.println("After insert: " + editor);
        
        StringBuffer reversed = new StringBuffer(editor).reverse();
        System.out.println("Reversed: " + reversed);
        
        System.out.println("Final string length: " + editor.length());
    }
}
