import java.util.StringTokenizer;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence with multiple words";
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        int wordCount = tokenizer.countTokens();
        System.out.println("Sentence: " + sentence);
        System.out.println("Total Words: " + wordCount);
    }
}
