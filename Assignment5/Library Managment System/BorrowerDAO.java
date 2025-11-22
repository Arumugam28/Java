import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class BorrowerDAO {
public int addBorrower(Borrower b) {
String sql = "INSERT INTO borrowers(name, phone, email) VALUES(?,?,?)";
try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
pst.setString(1, b.getName());
pst.setString(2, b.getPhone());
pst.setString(3, b.getEmail());
pst.executeUpdate();
try (ResultSet keys = pst.getGeneratedKeys()) {
if (keys.next()) return keys.getInt(1);
}
} catch (SQLException e) {
System.out.println("Error adding borrower: " + e.getMessage());
}
return -1;
}


public Borrower getBorrowerById(int id) {
String sql = "SELECT * FROM borrowers WHERE borrower_id = ?";
try (Connection con = DBConnection.getConnection(); PreparedStatement pst = con.prepareStatement(sql)) {
pst.setInt(1, id);
try (ResultSet rs = pst.executeQuery()) {
if (rs.next()) {
return new Borrower(rs.getInt("borrower_id"), rs.getString("name"), rs.getString("phone"), rs.getString("email"));
}
}
} catch (SQLException e) {
System.out.println("Error fetching borrower: " + e.getMessage());
}
return null;
}


public List<Borrower> listAllBorrowers() {
String sql = "SELECT * FROM borrowers";
List<Borrower> res = new ArrayList<>();
try (Connection con = DBConnection.getConnection(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {
while (rs.next()) {
res.add(new Borrower(rs.getInt("borrower_id"), rs.getString("name"), rs.getString("phone"), rs.getString("email")));
}
} catch (SQLException e) {
System.out.println("Error listing borrowers: " + e.getMessage());
}
return res;
}
}