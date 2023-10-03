// Name- Anurag Bonde
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Booklogs {

    private String title;
    private String author;
    private boolean available;

    public Booklogs(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Library11 {
    private List<Booklogs> books;

    public Library11() {
        books = new ArrayList<>();
    }

    public void addBook(Booklogs book) {
        books.add(book);
    }

    public void removeBook(Booklogs book) {
        books.remove(book);
    }

    public List<Booklogs> getAllBooks() {
        return books;
    }
}

class Administrator {
    public static void main(String[] args) {
        Library11 library = new Library11();

        library.addBook(new Booklogs("Alice in wonderland", "Lewis carrol"));
        library.addBook(new Booklogs("Animal Farm", "Kazi Nasrul Islam"));
        library.addBook(new Booklogs("A Song of ice and fire", "George R. R. Martin"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. View all books");
            System.out.println("2. Add a book");
            System.out.println("3. Remove a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBooks(library.getAllBooks());
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter the title of the book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author of the book: ");
                    String author = scanner.nextLine();
                    library.addBook(new Booklogs(title, author));
                    System.out.println("Book added successfully!");
                    break;
                case 3:
                    displayBooks(library.getAllBooks());
                    System.out.print("Enter the index of the book to remove: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < library.getAllBooks().size()) {
                        Booklogs bookToRemove = library.getAllBooks().get(index);
                        library.removeBook(bookToRemove);
                        System.out.println("Book removed successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
    }

    private static void displayBooks(List<Booklogs> books) {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books available in the library:");
            for (int i = 0; i < books.size(); i++) {
                Booklogs book = books.get(i);
                System.out.println(i + ". " + book.getTitle() + " by " + book.getAuthor()
                        + (book.isAvailable() ? " (Available)" : " (Not available)"));
            }
        }
        System.out.println();
    }
}

class Client {
    public static void main(String[] args) {
        Library11 library = new Library11();

        library.addBook(new Booklogs("Book 1", "Author 1"));
        library.addBook(new Booklogs("Book 2", "Author 2"));
        library.addBook(new Booklogs("Book 3", "Author 3"));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. View all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayBooks(library.getAllBooks());
                    break;
                case 2:
                    displayBooks(library.getAllBooks());
                    System.out.print("Enter the index of the book to issue: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < library.getAllBooks().size()) {
                        Booklogs bookToIssue = library.getAllBooks().get(index);
                        if (bookToIssue.isAvailable()) {
                            bookToIssue.setAvailable(false);
                            System.out.println("Book issued successfully!");
                        } else {
                            System.out.println("Book is not available for issue!");
                        }
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    displayBooks(library.getAllBooks());
                    System.out.print("Enter the index of the book to return: ");
                    int returnIndex = scanner.nextInt();
                    if (returnIndex >= 0 && returnIndex < library.getAllBooks().size()) {
                        Booklogs bookToReturn = library.getAllBooks().get(returnIndex);
                        bookToReturn.setAvailable(true);
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println(" Thank you!" + "Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
    }

    private static void displayBooks(List<Booklogs> books) {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books available in the library:");
            for (int i = 0; i < books.size(); i++) {
                Booklogs book = books.get(i);
                System.out.println(i + ". " + book.getTitle() + " by " + book.getAuthor()
                        + (book.isAvailable() ? " (Available)" : " (Not available)"));
            }
        }
        System.out.println();
    }
}