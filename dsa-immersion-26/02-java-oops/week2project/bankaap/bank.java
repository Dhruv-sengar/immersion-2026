import java.util.ArrayList;

public class bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    // Add an account to the bank
    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account added: " + account.getAccountNumber());
    }

    // Find account by account number
    public BankAccount findAccount(String accountNumber) throws AccountNotFoundException {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        throw new AccountNotFoundException(accountNumber);
    }

    // Transfer money between two accounts
    public void transfer(String senderNumber, String receiverNumber, double amount)
            throws AccountNotFoundException, insufficientBalanceException {

        BankAccount sender = findAccount(senderNumber);
        BankAccount receiver = findAccount(receiverNumber);

        if (amount <= 0) {
            System.out.println("Transfer amount must be greater than zero.");
            return;
        }

        if (sender.getBalance() < amount) {
            throw new insufficientBalanceException(amount);
        }

        sender.transferAmount(receiver, amount);

        Transaction t = new Transaction(senderNumber, receiverNumber, amount);
        t.displayTransaction();
    }
}
