/**
 * GameTest – Self-contained unit tests for the Secret Number Puzzle Game.
 * Verifies card properties and binary reconstruction math.
 */
public class GameTest {
    private static int testsRun = 0;
    private static int testsFailed = 0;

    public static void main(String[] args) {
        System.out.println("============================================");
        System.out.println("       RUNNING GAME LOGIC TESTS             ");
        System.out.println("============================================");

        testCardInitialization();
        testBinaryReconstruction();

        System.out.println();
        System.out.println("============================================");
        System.out.printf( "  Tests Run:    %d%n", testsRun);
        System.out.printf( "  Tests Failed: %d%n", testsFailed);
        System.out.println("============================================");

        if (testsFailed > 0) {
            System.out.println(">>> FAILURE: Some tests did not pass!");
            System.exit(1);
        } else {
            System.out.println(">>> SUCCESS: All tests passed successfully!");
            System.exit(0);
        }
    }

    private static void assertEquals(int expected, int actual, String message) {
        testsRun++;
        if (expected != actual) {
            System.out.printf("[FAIL] %s%n       Expected: %d, Got: %d%n", message, expected, actual);
            testsFailed++;
        } else {
            System.out.printf("[PASS] %s%n", message);
        }
    }

    private static void assertTrue(boolean condition, String message) {
        testsRun++;
        if (!condition) {
            System.out.printf("[FAIL] %s%n", message);
            testsFailed++;
        } else {
            System.out.printf("[PASS] %s%n", message);
        }
    }

    /**
     * Verifies that the five cards are set up with correct numbers and powers of 2.
     */
    private static void testCardInitialization() {
        System.out.println("\n--- Testing Card Initialization ---");
        Game game = new Game();
        Card[] cards = game.getCards();

        assertTrue(cards != null, "Cards array should not be null");
        assertEquals(5, cards.length, "Should initialize exactly 5 cards");

        int[] expectedValues = {1, 2, 4, 8, 16};
        for (int i = 0; i < 5; i++) {
            Card card = cards[i];
            assertEquals(i + 1, card.getCardNumber(), "Card number should match 1-based index");
            assertEquals(expectedValues[i], card.getBinaryValue(), "Card binary value should be " + expectedValues[i]);
            assertTrue(card.getNumbers().length > 0, "Card " + (i + 1) + " numbers list should not be empty");
        }
    }

    /**
     * Mathematically proves that the binary game logic correctly maps each
     * integer in [1, 20] to its unique card membership combination.
     */
    private static void testBinaryReconstruction() {
        System.out.println("\n--- Testing Binary Number Reconstruction ---");
        Game game = new Game();
        Card[] cards = game.getCards();

        for (int num = 1; num <= 20; num++) {
            int reconstructedSum = 0;
            for (Card card : cards) {
                if (containsNumber(card.getNumbers(), num)) {
                    reconstructedSum += card.getBinaryValue();
                }
            }
            assertEquals(num, reconstructedSum, "Reconstruction for number " + num);
        }
    }

    private static boolean containsNumber(int[] numbers, int target) {
        for (int num : numbers) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
