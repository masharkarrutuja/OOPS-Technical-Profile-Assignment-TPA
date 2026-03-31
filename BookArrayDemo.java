class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

class BookArrayDemo {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[0] = new Book("Java Programming", "Herbert Schildt", 500);
        books[1] = new Book("Data Structures", "Mark Allen Weiss", 450);
        books[2] = new Book("Algorithms", "Thomas Cormen", 600);

        for (Book book : books) {
            book.display();
        }
    }
}
