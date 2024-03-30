public class BankAccount {
    private long accountNumber;
    private Integer balance;
    private String ownerName;

    public BankAccount(){}

    public long getAccountNumber() {
        return accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public static void main(String [] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 1234567891;
        bankAccount.balance = 73000300;
        bankAccount.ownerName = "Anwar";

        System.out.println("For the client: " + bankAccount.getOwnerName()+ " who has the account number: " + bankAccount.getAccountNumber()+ ", his balance is: "+ bankAccount.getBalance() );

    }
}
