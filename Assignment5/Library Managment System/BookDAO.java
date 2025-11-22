import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    // -------------------------
    // ADD BOOK
    // -------------------------
    public void addBook(Book book) {
        String sql = "INSERT INTO books(title, author, publisher, available_copies) VALUES(?,?,?,?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, book.getTitle());
            pst.setString(2, book.getAuthor());
            pst.setString(3, book.getPublisher());
            pst.setInt(4, book.getAvailableCopies());

            pst.executeUpdate();
            System.out.println("Book added.");

        } catch (SQLException e) {
            System.out.println("Error adding book: " + e.getMessage());
        }
    }

    // -------------------------
    // GET BOOK BY ID
    // -------------------------
    public Book getBookById(int id) {
        String sql = "SELECT * FROM books WHERE book_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, id);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    return new Book(
                        rs.getInt("book_id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("publisher"),
                        rs.getInt("available_copies")
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Error fetching book: " + e.getMessage());
        }

        return null;
    }

    // -------------------------
    // SEARCH BOOK BY TITLE
    // -------------------------
    public List<Book> searchBooksByTitle(String titlePart) {
        String sql = "SELECT * FROM books WHERE title LIKE ?";
        List<Book> result = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, "%" + titlePart + "%");

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    result.add(
                        new Book(
                            rs.getInt("book_id"),
                            rs.getString("title"),
                            rs.getString("author"),
                            rs.getString("publisher"),
                            rs.getInt("available_copies")
                        )
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Error searching books: " + e.getMessage());
        }

        return result;
    }

    // -------------------------
    // LIST ALL BOOKS
    // -------------------------
    public List<Book> listAllBooks() {
        String sql = "SELECT * FROM books";
        List<Book> result = new ArrayList<>();

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                result.add(
                    new Book(
                        rs.getInt("book_id"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getString("publisher"),
                        rs.getInt("available_copies")
                    )
                );
            }

        } catch (SQLException e) {
            System.out.println("Error listing books: " + e.getMessage());
        }

        return result;
    }

    // -------------------------
    // ISSUE BOOK (DECREMENT COPY)
    // -------------------------
    public boolean decrementCopy(int bookId) {
        String sql = "UPDATE books SET available_copies = available_copies - 1 " +
                     "WHERE book_id = ? AND available_copies > 0";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, bookId);
            return pst.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error decrementing copy: " + e.getMessage());
            return false;
        }
    }

    // -------------------------
    // RETURN BOOK (INCREMENT COPY)
    // -------------------------
    public boolean incrementCopy(int bookId) {
        String sql = "UPDATE books SET available_copies = available_copies + 1 WHERE book_id = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, bookId);
            return pst.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error incrementing copy: " + e.getMessage());
            return false;
        }
    }
}
