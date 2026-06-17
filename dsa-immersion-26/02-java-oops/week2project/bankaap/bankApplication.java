public class bankApplication {

    public static void main(String[] args) {

        // Create bank
        bank myBank = new bank();

        // Create accounts
        BankAccount acc1 = new BankAccount("ACC001", "Dhruv Sengar", "Savings", 50000);
        BankAccount acc2 = new BankAccount("ACC002", "Riya Sharma", "Current", 30000);

        // Add to bank
        myBank.addAccount(acc1);
        myBank.addAccount(acc2);

        System.out.println();

        // Display account details
        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();
        System.out.println();

        // Check balance
        System.out.println("Balance of ACC001: Rs " + acc1.getBalance());
        System.out.println();

        // Transfer money
        try {
            myBank.transfer("ACC001", "ACC002", 10000);
        } catch (AccountNotFoundException | insufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        // Display updated balances
        System.out.println("Updated Balance - ACC001: Rs " + acc1.getBalance());
        System.out.println("Updated Balance - ACC002: Rs " + acc2.getBalance());

        System.out.println();

        // Test: Transfer with insufficient balance
        try {
            myBank.transfer("ACC001", "ACC002", 999999);
        } catch (AccountNotFoundException | insufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test: Transfer to invalid account
        try {
            myBank.transfer("ACC001", "ACC999", 5000);
        } catch (AccountNotFoundException | insufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
