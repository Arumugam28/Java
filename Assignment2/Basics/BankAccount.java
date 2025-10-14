public class BankAccount {
    private double balance=200000;
    private long accountNumber = 376576523;
    private String accountType = "Business";
    public long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public double getbalance(){
        return balance;
    }
    public double setbalance(double balance){
        return this.balance = balance;
    }
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.setbalance(1256200);
        System.out.println("Updated balance : "+b.getbalance());
        b.setAccountNumber(817683181);
        System.out.println("Updated AccountNumber : "+ b.getAccountNumber());
        b.setAccountType("Savings");
        System.out.println("Updated AccountType : "+b.getAccountType())
        ;
    }
}
