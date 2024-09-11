package dsa.Exercitii.Map;

import java.util.*;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static UUID seachByTitle(SortedMap<UUID, Book> catalog, String searchTitle) {
        for (Map.Entry<UUID, Book> it : catalog.entrySet()) {
            if (it.getValue().getTitle().equals(searchTitle)) {
                return it.getKey();
            }
        }
        return null;
    }
}

public class LibraryCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedMap<UUID, Book> catalog = new TreeMap<>();
        String author;
        String title;
        while (true) {
            System.out.println("\nLibrary catalog system:");
            System.out.println("1. Add Book:");
            System.out.println("2. Remove Book by title:");
            System.out.println("3. Search Book by title:");
            System.out.println("4. Display all books:");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    UUID isbn = UUID.randomUUID();
                    System.out.print("Enter title:");
                    title = scanner.nextLine();
                    System.out.print("Enter author:");
                    author = scanner.nextLine();
                    catalog.put(isbn, new Book(title, author));
                    System.out.println("Book added successfully!");
                    break;
                case 2:
                    System.out.print("Enter title of the book you want to remove: ");
                    title = scanner.nextLine();
                    UUID removeBookById = Book.seachByTitle(catalog, title);
                    if (removeBookById != null) {
                        catalog.remove(removeBookById);
                        System.out.println("Book removed successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 3:
                    System.out.print("Enter tittle of book to searh: ");
                    title = scanner.nextLine();
                    UUID searchBookById = Book.seachByTitle(catalog, title);
                    if (searchBookById != null) {
                        System.out.println("Book found successfully with ID: " + searchBookById + " called "
                                + catalog.get(searchBookById).getTitle() + " by " +
                                catalog.get(searchBookById).getAuthor());
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:
                    System.out.println("Books: ");
                    for (Map.Entry<UUID, Book> it : catalog.entrySet()) {
                        System.out.println(it.getKey() + " : " + it.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Exiting peogram...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again from 1 to 5.");
            }
        }
    }
}
