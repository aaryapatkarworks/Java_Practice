public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    BankAccount() {
        accountHolder = "Unknown";
        accountNumber = 0;
        balance = 1000;
    }

    //parameterized constructor
    BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    //method
    void displayAccount() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : ₹" + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("Aarya Patkar", 123456789012L, 90000);

        account1.displayAccount();
        account2.displayAccount();
        account2.deposit(5000);
        account2.displayAccount();
    }
}