public class insufficientBalanceException extends Exception {
    public insufficientBalanceException(double amount) {
        super("Insufficient balance. Requested: Rs " + amount);
    }
}
