/**
 * SecretNumberGame – Entry point for the Secret Number Puzzle Game.
 *
 * Responsibilities:
 *   - Creates a Game instance.
 *   - Drives the main menu loop.
 *   - Delegates all game logic to the Game class.
 *
 * Usage:
 *   javac Card.java Game.java SecretNumberGame.java
 *   java  SecretNumberGame
 */
public class SecretNumberGame {

    public static void main(String[] args) {

        Game game = new Game();
        boolean running = true;

        System.out.println("Welcome to the Secret Number Puzzle Game!");

        while (running) {
            int choice = game.showMenu();

            switch (choice) {
                case 1:
                    game.displayRules();
                    break;

                case 2:
                    game.displayCards();
                    break;

                case 3:
                    game.playGame();
                    break;

                case 4:
                    // "Play Again" – just re-runs the game directly
                    System.out.println("\n--- Starting a new round! ---");
                    game.playGame();
                    break;

                case 5:
                    System.out.println("\nThank you for playing! Goodbye.");
                    game.closeScanner();
                    running = false;
                    break;

                default:
                    // Already validated by readIntInput – should never reach here
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
