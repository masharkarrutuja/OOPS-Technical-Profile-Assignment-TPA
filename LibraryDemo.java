import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                System.out.println("Book removed: " + books.get(i).getTitle());
                books.remove(i);
                return;
            }
        }
        System.out.println("Book not found!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library!");
            return;
        }
        System.out.println("\n=== Books in Library ===");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Programming", "James Gosling", "ISBN001");
        Book book2 = new Book("OOP Concepts", "Robert Martin", "ISBN002");
        Book book3 = new Book("Design Patterns", "Gang of Four", "ISBN003");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.removeBook("ISBN002");

        library.displayBooks();
    }
}
