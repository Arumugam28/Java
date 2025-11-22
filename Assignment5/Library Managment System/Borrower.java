public class Borrower {
private int borrowerId;
private String name;
private String phone;
private String email;


public Borrower() {}
public Borrower(int borrowerId, String name, String phone, String email) {
this.borrowerId = borrowerId;
this.name = name;
this.phone = phone;
this.email = email;
}
public Borrower(String name, String phone, String email) {
this.name = name;
this.phone = phone;
this.email = email;
}


// getters and setters
public int getBorrowerId() { return borrowerId; }
public void setBorrowerId(int borrowerId) { this.borrowerId = borrowerId; }
public String getName() { return name; }
public void setName(String name) { this.name = name; }
public String getPhone() { return phone; }
public void setPhone(String phone) { this.phone = phone; }
public String getEmail() { return email; }
public void setEmail(String email) { this.email = email; }


@Override
public String toString() {
return String.format("[%d] %s — %s — %s", borrowerId, name, phone, email);
}
}