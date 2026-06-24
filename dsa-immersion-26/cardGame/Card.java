/**
 * Represents a single number card in the Secret Number Puzzle Game.
 * Each card holds a set of numbers and contributes a power-of-2 value
 * used to reconstruct the secret number via binary logic.
 */
public class Card {

    private int cardNumber;      // Card index (1-based)
    private int[] numbers;       // Numbers printed on this card
    private int binaryValue;     // Power-of-2 value this card represents (1, 2, 4, 8, 16)

    // ---------------------------------------------------------------
    // Constructor
    // ---------------------------------------------------------------
    public Card(int cardNumber, int[] numbers, int binaryValue) {
        this.cardNumber  = cardNumber;
        this.numbers     = numbers;
        this.binaryValue = binaryValue;
    }

    // ---------------------------------------------------------------
    // Getters
    // ---------------------------------------------------------------
    public int getCardNumber()  { return cardNumber;  }
    public int[] getNumbers()   { return numbers;     }
    public int getBinaryValue() { return binaryValue; }

    // ---------------------------------------------------------------
    // Display
    // ---------------------------------------------------------------
    /**
     * Prints the card in a formatted grid layout.
     */
    public void display() {
        System.out.println("+----------------------------+");
        System.out.printf( "|          CARD  %-2d          |%n", cardNumber);
        System.out.println("+----------------------------+");

        int cols = 5;
        for (int i = 0; i < numbers.length; i += cols) {
            StringBuilder sb = new StringBuilder();
            sb.append("|  ");
            for (int j = 0; j < cols; j++) {
                if (i + j < numbers.length) {
                    sb.append(String.format("%3d", numbers[i + j]));
                } else {
                    sb.append("   ");
                }
                if (j < cols - 1) {
                    sb.append("  ");
                }
            }
            sb.append("   |");
            System.out.println(sb.toString());
        }
        System.out.println("+----------------------------+");
    }
}
