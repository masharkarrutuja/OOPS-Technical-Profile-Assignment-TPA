public class FileExtensionExtractor {
    public static void main(String[] args) {
        String fileName = "report.pdf";
        int lastDot = fileName.lastIndexOf('.');
        
        if (lastDot > 0) {
            String extension = fileName.substring(lastDot + 1);
            System.out.println("File Name: " + fileName);
            System.out.println("Extension: " + extension);
        } else {
            System.out.println("No extension found");
        }
    }
}
