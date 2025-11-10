
class BankAccount {
    private double balance;
    private String accountNumber;
    private String accountType;
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountType(String accountType){
        this.accountType=accountType;
    }

    public String getAccountType(){
        return accountType;
    }

    public static void main(String args[]){
        BankAccount acc=new BankAccount();
        acc.setBalance(50000.75);
        acc.setAccountNumber("SB123456789");
        acc.setAccountType("Savings");

        System.out.println("Account Number: "+acc.getAccountNumber());
        System.out.println("Account Type: "+acc.getAccountType());
        System.out.println("Balance: "+acc.getBalance());
    }
}
