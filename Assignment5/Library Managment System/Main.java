import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final BookDAO bookDAO = new BookDAO();
    private static final BorrowerDAO borrowerDAO = new BorrowerDAO();
    private static final IssueDAO issueDAO = new IssueDAO();

    public static void main(String[] args) {
        System.out.println("Welcome to Library Management CLI");
        while (true) {
            printMenu();
            int choice = readInt("Choose an option: ");
            sc.nextLine(); // CLEAR BUFFER AFTER readInt()

            switch (choice) {
                case 1: addBook(); break;
                case 2: listBooks(); break;
                case 3: searchBook(); break;
                case 4: addBorrower(); break;
                case 5: listBorrowers(); break;
                case 6: issueBook(); break;
                case 7: returnBook(); break;
                case 0: System.out.println("Goodbye"); System.exit(0);
                default: System.out.println("Invalid choice");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n1. Add Book\n2. List All Books\n3. Search Book by Title\n4. Add Borrower\n5. List Borrowers\n6. Issue Book\n7. Return Book\n0. Exit");
    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print(prompt);
        }
        return sc.nextInt();
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();    // <-- FIXED (only one nextLine)
    }

    private static void addBook() {
        String title = readLine("Title: ");
        String author = readLine("Author: ");
        String publisher = readLine("Publisher: ");
        int copies = readInt("Available copies: ");
        sc.nextLine();  // clear buffer

        Book b = new Book(title, author, publisher, copies);
        bookDAO.addBook(b);
    }

    private static void listBooks() {
        List<Book> books = bookDAO.listAllBooks();
        if (books.isEmpty()) System.out.println("No books found.");
        else books.forEach(System.out::println);
    }

    private static void searchBook() {
        String q = readLine("Enter title part: ");
        List<Book> books = bookDAO.searchBooksByTitle(q);
        if (books.isEmpty()) System.out.println("No books found.");
        else books.forEach(System.out::println);
    }

    private static void addBorrower() {
        String name = readLine("Name: ");
        String phone = readLine("Phone: ");
        String email = readLine("Email: ");
        Borrower b = new Borrower(name, phone, email);
        int id = borrowerDAO.addBorrower(b);
        System.out.println("Borrower added with id: " + id);
    }

    private static void listBorrowers() {
        List<Borrower> list = borrowerDAO.listAllBorrowers();
        if (list.isEmpty()) System.out.println("No borrowers found.");
        else list.forEach(System.out::println);
    }

    private static void issueBook() {
        int borrowerId = readInt("Borrower ID: ");
        int bookId = readInt("Book ID: ");
        sc.nextLine();
        issueDAO.issueBook(borrowerId, bookId);
    }

    private static void returnBook() {
        int issueId = readInt("Issue ID: ");
        sc.nextLine();
        issueDAO.returnBook(issueId);
    }
}
