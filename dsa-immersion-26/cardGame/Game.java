import java.util.Scanner;

/**
 * Core game logic for the Secret Number Puzzle Game.
 * Responsible for displaying menus, rules, cards, and running the game loop.
 */
public class Game {

    // ---------------------------------------------------------------
    // Fields
    // ---------------------------------------------------------------
    private Scanner scanner;
    private Card[]  cards;          // The five predefined number cards

    // ---------------------------------------------------------------
    // Constructor – initialises scanner and builds the card deck
    // ---------------------------------------------------------------
    public Game() {
        scanner = new Scanner(System.in);
        initCards();
    }

    // ---------------------------------------------------------------
    // Getter for testing
    // ---------------------------------------------------------------
    public Card[] getCards() {
        return cards;
    }

    // ---------------------------------------------------------------
    // Card initialisation (binary-logic cards for numbers 1–20)
    // ---------------------------------------------------------------
    /**
     * Each card holds numbers whose binary representation has a '1' in
     * the bit-position that the card represents:
     *   Card 1 → bit 0  (value 1)
     *   Card 2 → bit 1  (value 2)
     *   Card 3 → bit 2  (value 4)
     *   Card 4 → bit 3  (value 8)
     *   Card 5 → bit 4  (value 16)
     */
    private void initCards() {
        cards = new Card[5];

        // Card 1 – numbers whose bit-0 is set
        cards[0] = new Card(1,
            new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19},
            1);

        // Card 2 – numbers whose bit-1 is set
        cards[1] = new Card(2,
            new int[]{2, 3, 6, 7, 10, 11, 14, 15, 18, 19},
            2);

        // Card 3 – numbers whose bit-2 is set
        cards[2] = new Card(3,
            new int[]{4, 5, 6, 7, 12, 13, 14, 15, 20},
            4);

        // Card 4 – numbers whose bit-3 is set
        cards[3] = new Card(4,
            new int[]{8, 9, 10, 11, 12, 13, 14, 15},
            8);

        // Card 5 – numbers whose bit-4 is set
        cards[4] = new Card(5,
            new int[]{16, 17, 18, 19, 20},
            16);
    }

    // ---------------------------------------------------------------
    // Menu
    // ---------------------------------------------------------------
    /**
     * Displays the main menu and returns the user's validated choice.
     */
    public int showMenu() {
        System.out.println();
        System.out.println("============================================");
        System.out.println("       SECRET NUMBER PUZZLE GAME            ");
        System.out.println("============================================");
        System.out.println("  1. View Game Rules");
        System.out.println("  2. Display Secret Number Cards");
        System.out.println("  3. Play Game");
        System.out.println("  4. Play Again");
        System.out.println("  5. Exit");
        System.out.println("============================================");
        System.out.print("  Enter your choice: ");

        return readIntInput(1, 5);
    }

    // ---------------------------------------------------------------
    // Option 1 – Rules
    // ---------------------------------------------------------------
    public void displayRules() {
        System.out.println();
        System.out.println("==================== GAME RULES ====================");
        System.out.println(" 1. Think of any number between 1 and 20.");
        System.out.println(" 2. You will be shown 5 cards, each with a set");
        System.out.println("    of numbers printed on it.");
        System.out.println(" 3. For each card, answer Y (Yes) if your number");
        System.out.println("    appears on that card, or N (No) if it does not.");
        System.out.println(" 4. After all 5 cards, the game will reveal your");
        System.out.println("    secret number using binary logic magic!");
        System.out.println("=====================================================");
    }

    // ---------------------------------------------------------------
    // Option 2 – Display all cards
    // ---------------------------------------------------------------
    public void displayCards() {
        System.out.println();
        System.out.println("========== SECRET NUMBER CARDS ==========");
        for (Card card : cards) {
            card.display();
            System.out.println();
        }
    }

    // ---------------------------------------------------------------
    // Option 3 – Play
    // ---------------------------------------------------------------
    public void playGame() {
        System.out.println();
        System.out.println("Think of a secret number between 1 and 20.");
        System.out.println("(Don't tell me — I'll figure it out!)");
        System.out.println();

        int secret = calculateSecretNumber();

        System.out.println();
        if (secret < 1 || secret > 20) {
            System.out.println("*********************************************************");
            System.out.println("*  Wait! That doesn't seem right...                     *");
            System.out.printf( "*  The calculated number is %-2d, which is invalid.     *%n", secret);
            System.out.println("*  Did you make a mistake or think of a number outside  *");
            System.out.println("*  the range 1 to 20? Let's try again!                  *");
            System.out.println("*********************************************************");
        } else {
            System.out.println("*******************************************");
            System.out.printf( "*   Your Secret Number is:  %-3d           *%n", secret);
            System.out.println("*******************************************");
        }
    }

    // ---------------------------------------------------------------
    // Core algorithm – sum binary values of cards answered 'Yes'
    // ---------------------------------------------------------------
    /**
     * For each card, asks the user whether their number appears on it.
     * Accumulates the card's binary value for every 'Yes' answer.
     * The accumulated sum IS the secret number.
     */
    public int calculateSecretNumber() {
        int secretNumber = 0;

        for (Card card : cards) {
            card.display();
            System.out.printf("Is your number present in Card %d? (Y/N): ",
                              card.getCardNumber());

            boolean answer = readYesNo();
            if (answer) {
                secretNumber += card.getBinaryValue();
            }
            System.out.println();
        }

        return secretNumber;
    }

    // ---------------------------------------------------------------
    // Input helpers
    // ---------------------------------------------------------------
    /**
     * Reads and validates a Yes/No answer.
     * Accepts: Y, y, Yes, yes, N, n, No, no
     */
    private boolean readYesNo() {
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("y") || input.equals("yes")) return true;
            if (input.equals("n") || input.equals("no"))  return false;
            System.out.print("  Invalid input. Please enter Y or N: ");
        }
    }

    /**
     * Reads an integer within [min, max] (inclusive), re-prompting on error.
     */
    private int readIntInput(int min, int max) {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine().trim());
                if (value >= min && value <= max) return value;
                System.out.printf("  Please enter a number between %d and %d: ", min, max);
            } catch (NumberFormatException e) {
                System.out.printf("  Invalid input. Enter a number (%d-%d): ", min, max);
            }
        }
    }

    // ---------------------------------------------------------------
    // Cleanup
    // ---------------------------------------------------------------
    public void closeScanner() {
        scanner.close();
    }
}
