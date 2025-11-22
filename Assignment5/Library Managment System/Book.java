public class Book {
private int bookId;
private String title;
private String author;
private String publisher;
private int availableCopies;


public Book() {}


public Book(int bookId, String title, String author, String publisher, int availableCopies) {
this.bookId = bookId;
this.title = title;
this.author = author;
this.publisher = publisher;
this.availableCopies = availableCopies;
}


public Book(String title, String author, String publisher, int availableCopies) {
this.title = title;
this.author = author;
this.publisher = publisher;
this.availableCopies = availableCopies;
}


// getters and setters
public int getBookId() { return bookId; }
public void setBookId(int bookId) { this.bookId = bookId; }
public String getTitle() { return title; }
public void setTitle(String title) { this.title = title; }
public String getAuthor() { return author; }
public void setAuthor(String author) { this.author = author; }
public String getPublisher() { return publisher; }
public void setPublisher(String publisher) { this.publisher = publisher; }
public int getAvailableCopies() { return availableCopies; }
public void setAvailableCopies(int availableCopies) { this.availableCopies = availableCopies; }


@Override
public String toString() {
    return  "\n--------------------------------------\n" +
            "Book ID         : " + bookId + "\n" +
            "Title           : " + title + "\n" +
            "Author          : " + author + "\n" +
            "Publisher       : " + publisher + "\n" +
            "Available Copies: " + availableCopies + "\n" +
            "--------------------------------------";
}

}