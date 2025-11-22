import java.sql.*;
import java.time.LocalDate;


public class IssueDAO {
private BookDAO bookDAO = new BookDAO();


public boolean issueBook(int borrowerId, int bookId) {
String sql = "INSERT INTO issued_books(borrower_id, book_id, issue_date) VALUES(?,?,?)";
try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
con.setAutoCommit(false);

boolean decremented = bookDAO.decrementCopy(bookId);
if (!decremented) {
System.out.println("No copies available to issue.");
con.rollback();
con.setAutoCommit(true);
return false;
}


pst.setInt(1, borrowerId);
pst.setInt(2, bookId);
pst.setDate(3, java.sql.Date.valueOf(LocalDate.now()));
pst.executeUpdate();

con.commit();
con.setAutoCommit(true);
System.out.println("Book issued successfully.");
return true;
} catch (SQLException e) {
System.out.println("Error issuing book: " + e.getMessage());
return false;
}
}
public boolean returnBook(int issueId) {
String sqlSelect = "SELECT book_id FROM issued_books WHERE issue_id = ? AND return_date IS NULL";
String sqlUpdate = "UPDATE issued_books SET return_date = ? WHERE issue_id = ?";
try (Connection con = DBConnection.getConnection(); PreparedStatement pstSel = con.prepareStatement(sqlSelect); PreparedStatement pstUpd = con.prepareStatement(sqlUpdate)) {
pstSel.setInt(1, issueId);
try (ResultSet rs = pstSel.executeQuery()) {
if (!rs.next()) {
System.out.println("No active issued record found for given issue id.");
return false;
}
int bookId = rs.getInt("book_id");
pstUpd.setDate(1, java.sql.Date.valueOf(LocalDate.now()));
pstUpd.setInt(2, issueId);
pstUpd.executeUpdate();
bookDAO.incrementCopy(bookId);
System.out.println("Book returned successfully.");
return true;
}
} catch (SQLException e) {
System.out.println("Error returning book: " + e.getMessage());
return false;
}
}
}