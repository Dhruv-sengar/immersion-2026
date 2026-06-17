public class Transaction {

    private String senderAccountNumber;
    private String receiverAccountNumber;
    private double amount;

    // Constructor
    public Transaction(String senderAccountNumber, String receiverAccountNumber, double amount) {
        this.senderAccountNumber = senderAccountNumber;
        this.receiverAccountNumber = receiverAccountNumber;
        this.amount = amount;
    }

    // Display transaction details
    public void displayTransaction() {
        System.out.println("Transaction Details:");
        System.out.println("  From    : " + senderAccountNumber);
        System.out.println("  To      : " + receiverAccountNumber);
        System.out.println("  Amount  : Rs " + amount);
    }
}
