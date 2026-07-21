public class SavingsAccount extends BankAccount{

    private double interestRate;

    SavingsAccount(String accountHolder,
                   long accountNumber,
                   double balance,
                   double interestRate) {

        super(accountHolder,
                accountNumber,
                balance);

        this.interestRate = interestRate;
    }

    void displaySavingsAccount(){
        System.out.println("Account Holder : " + getAccountHolder());
        System.out.println("Account Number : " + getAccountNumber());
        System.out.println("Balance        : ₹" + getBalance());
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println();
    }

    public static void main(String[] args) {

        SavingsAccount account1 =
                new SavingsAccount(
                        "Pranav More",
                        987654321012L,
                        82000,
                        6.5
                );

        SavingsAccount account2 =
                new SavingsAccount(
                        "Swara Umredkar",
                        876543210987L,
                        72000,
                        7.2
                );

        account1.deposit(10000);

        account2.withdraw(15000);

        account1.displaySavingsAccount();

        account2.displaySavingsAccount();

    }
}
