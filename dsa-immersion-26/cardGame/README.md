# Secret Number Puzzle Game

Welcome to the **Secret Number Puzzle Game**! This is a console-based Java game that uses binary logic to guess a secret number between **1 and 20** that you think of.

---

## 🌟 The Magic Behind the Game

The game displays 5 special number cards. For each card, you answer **Yes (Y)** if your secret number is printed on it, or **No (N)** if it is not. 

How does the game know your number? **It's pure binary arithmetic!**

Every number from 1 to 20 can be written as a 5-digit binary number (using bits representing $16, 8, 4, 2, 1$):
* Card 1 represents the $2^0$ bit (value **1**)
* Card 2 represents the $2^1$ bit (value **2**)
* Card 3 represents the $2^2$ bit (value **4**)
* Card 4 represents the $2^3$ bit (value **8**)
* Card 5 represents the $2^4$ bit (value **16**)

When you answer **Yes** to Card $X$, the game adds that card's binary value to a running sum. When you have answered for all cards, the final sum is your secret number!

### Example:
Suppose your secret number is **13**:
* 13 in binary is `01101` ($8 + 4 + 1 = 13$).
* Therefore, 13 appears on:
  * **Card 1** (value 1) - *Yes*
  * **Card 3** (value 4) - *Yes*
  * **Card 4** (value 8) - *Yes*
* 13 is not on Card 2 (value 2) or Card 5 (value 16).
* Sum: $1 + 4 + 8 = 13$.

---

## 📁 File Structure

* **[SecretNumberGame.java](file:///d:/cardGame/SecretNumberGame.java)**: The main entry point. Handles the top-level menu loop.
* **[Game.java](file:///d:/cardGame/Game.java)**: Core game state and interaction handlers.
* **[Card.java](file:///d:/cardGame/Card.java)**: Represents a single binary card and prints it with beautifully aligned borders.
* **[GameTest.java](file:///d:/cardGame/GameTest.java)**: The test suite verifying card setup and math correctness for all numbers in $[1, 20]$.
* **[run.bat](file:///d:/cardGame/run.bat)**: Windows batch script to compile and run the game.
* **[test.bat](file:///d:/cardGame/test.bat)**: Windows batch script to compile and run tests.

---

## 🚀 How to Run the Game

### Using Provided Batch Scripts (Windows)
* Double-click **`run.bat`** to compile and start the game.
* Double-click **`test.bat`** to compile and run the test suite.

### Manually via CLI
1. Open a terminal and navigate to the project directory.
2. Compile the files:
   ```bash
   javac Card.java Game.java SecretNumberGame.java
   ```
3. Run the application:
   ```bash
   java SecretNumberGame
   ```

---

## 🧪 How to Run Tests
1. Compile the test classes:
   ```bash
   javac Card.java Game.java GameTest.java
   ```
2. Run the test suite:
   ```bash
   java GameTest
   ```

---

## 🛠️ Key Improvements Made
1. **Perfect UI Alignment**: The cards are displayed using mathematically calculated padding, maintaining a strict 30-character width structure. Borders are perfectly aligned even when printing columns with blank spaces.
2. **Game Validation / Cheat Detection**: If the answers lead to a result outside the valid $[1, 20]$ range (for example, if you say NO to all cards, yielding `0`, or YES to combinations exceeding `20`, like `24` or `31`), the game detects this discrepancy and displays a helpful validation message.
3. **Automated Testing Suite**: A dedicated test suite was added to verify card initialization and logically confirm that the binary reconstruction is correct for every valid input.
