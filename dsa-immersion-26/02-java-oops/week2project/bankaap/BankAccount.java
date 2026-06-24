public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.println("Deposited Rs " + amount + " to " + accountNumber + ". New balance: Rs " + balance);
    }

    // Withdraw money
    public void withdraw(double amount) throws insufficientBalanceException {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }
        if (balance < amount) {
            throw new insufficientBalanceException(amount);
        }
        balance -= amount;
        System.out.println("Withdrawn Rs " + amount + " from " + accountNumber + ". New balance: Rs " + balance);
    }

    // Transfer amount to another account
    public void transferAmount(BankAccount receiver, double amount) throws insufficientBalanceException {
        if (balance < amount) {
            throw new insufficientBalanceException(amount);
        }
        balance -= amount;
        receiver.balance += amount;
        System.out.println("Transfer of Rs " + amount + " successful.");
        System.out.println("Your new balance: Rs " + balance);
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs " + balance);
    }
}