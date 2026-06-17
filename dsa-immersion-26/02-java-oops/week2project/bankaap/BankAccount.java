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
    public String getAccountNumber()     { return accountNumber;     }
    public String getAccountHolderName() { return accountHolderName; }
    public String getAccountType()       { return accountType;       }
    public double getBalance()           { return balance;           }

    // Deposit money
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: Rs " + amount + " | New Balance: Rs " + balance);
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount + " | Remaining Balance: Rs " + balance);
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs " + balance);
    }

    // Transfer money to another account
    public void transferAmount(BankAccount receiver, double amount) {
        if (receiver == null) {
            System.out.println("Receiver account not found.");
        } else if (amount <= 0) {
            System.out.println("Transfer amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for transfer.");
        } else {
            balance -= amount;
            receiver.balance += amount;
            System.out.println("Transfer of Rs " + amount + " successful.");
            System.out.println("Your new balance: Rs " + balance);
        }
    }
}
