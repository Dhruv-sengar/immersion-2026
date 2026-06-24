<div align="center">

<!-- Animated header -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:1a1a2e,50:16213e,100:0f3460&height=220&section=header&text=Secret%20Number%20Puzzle&fontSize=48&fontColor=ffffff&fontAlignY=38&desc=Can%20I%20Read%20Your%20Mind%3F%20%F0%9F%A7%A0&descAlignY=58&descColor=e94560&animation=fadeIn" width="100%"/>

<!-- Typing animation -->
<a href="#">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&color=E94560&center=true&vCenter=true&width=650&lines=Think+of+a+number+between+1+and+20...;I+will+guess+it+%F0%9F%94%AE;Powered+by+Binary+Logic+%26+Java+OOP;5+Cards+%E2%86%92+1+Secret+Number+%E2%9C%A8" alt="Typing SVG" />
</a>

<br/><br/>

<!-- Badges -->
![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-4%20Classes-6366f1?style=for-the-badge&logo=abstract&logoColor=white)
![Binary](https://img.shields.io/badge/Logic-Binary%20Math-e94560?style=for-the-badge&logo=buffer&logoColor=white)
![Tests](https://img.shields.io/badge/Tests-Passing%20%E2%9C%85-22c55e?style=for-the-badge&logo=checkmarx&logoColor=white)
![Platform](https://img.shields.io/badge/Platform-Console-0ea5e9?style=for-the-badge&logo=windowsterminal&logoColor=white)

</div>

---

## 🔮 What Is This?

**Secret Number Puzzle** is a console-based Java mind-reading game.

You think of **any number between 1 and 20**. The game shows you **5 cards**, each filled with numbers. You simply answer **Yes** or **No** for each card — and the game reveals your number like magic.

> No tricks. No guessing. Just pure **binary arithmetic** disguised as magic. 🎩

---

## ✨ How It Works — The Binary Magic

Every number from **1 to 20** can be represented as a 5-bit binary number. Each card corresponds to one binary bit position:

| Card | Bit Position | Value | Numbers on Card |
|:---:|:---:|:---:|---|
| Card 1 | Bit 0 | **1** | 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 |
| Card 2 | Bit 1 | **2** | 2, 3, 6, 7, 10, 11, 14, 15, 18, 19 |
| Card 3 | Bit 2 | **4** | 4, 5, 6, 7, 12, 13, 14, 15, 20 |
| Card 4 | Bit 3 | **8** | 8, 9, 10, 11, 12, 13, 14, 15 |
| Card 5 | Bit 4 | **16** | 16, 17, 18, 19, 20 |

When you say **Yes** to a card, its value is added to a running sum. After all 5 cards — the sum **is** your number.

### 🧮 Example — Secret Number: 13

```
13 in binary = 01101  →  8 + 4 + 1 = 13
```

| Card | Answer | Value Added |
|:---:|:---:|:---:|
| Card 1 (value = 1) | ✅ Yes | +1 |
| Card 2 (value = 2) | ❌ No  | +0 |
| Card 3 (value = 4) | ✅ Yes | +4 |
| Card 4 (value = 8) | ✅ Yes | +8 |
| Card 5 (value = 16)| ❌ No  | +0 |
| **Total** | | **= 13 🎉** |

---

## 📁 Project Structure

```text
cardGame/
│
├── SecretNumberGame.java   ← 🚀 Main entry point — drives the menu loop
├── Game.java               ← 🧠 Core logic — menus, cards, game flow, input
├── Card.java               ← 🃏 Card class — holds numbers, binary value, display
├── GameTest.java           ← 🧪 Test suite — validates card setup & binary math
│
├── run.bat                 ← ▶️  Windows: compile & run the game
└── test.bat                ← 🔬 Windows: compile & run the tests
```

---

## 🧩 Class Overview

```
┌──────────────────────────────────────┐
│           SecretNumberGame           │
│  (Entry Point / Main Menu Loop)      │
│                                      │
│  + main(String[] args)               │
└─────────────────┬────────────────────┘
                  │ creates & drives
                  ▼
┌──────────────────────────────────────┐
│                Game                  │
│  (Core Logic & User Interaction)     │
│                                      │
│  + showMenu() : int                  │
│  + displayRules()                    │
│  + displayCards()                    │
│  + playGame()                        │
│  + calculateSecretNumber() : int     │
│  + getCards() : Card[]               │
│  + closeScanner()                    │
└─────────────────┬────────────────────┘
                  │ uses array of
                  ▼
┌──────────────────────────────────────┐
│                Card                  │
│  (Data + Display per card)           │
│                                      │
│  - cardNumber   : int                │
│  - numbers[]    : int[]              │
│  - binaryValue  : int                │
│                                      │
│  + getCardNumber() : int             │
│  + getNumbers()    : int[]           │
│  + getBinaryValue(): int             │
│  + display()                         │
└──────────────────────────────────────┘

┌──────────────────────────────────────┐
│             GameTest                 │
│  (Self-Contained Test Suite)         │
│                                      │
│  + testCardInitialization()          │
│  + testBinaryReconstruction()        │
│  → Tests all 20 numbers for          │
│    correct binary reconstruction     │
└──────────────────────────────────────┘
```

---

## 🎮 Game Menu Options

```
============================================
       SECRET NUMBER PUZZLE GAME
============================================
  1. View Game Rules
  2. Display Secret Number Cards
  3. Play Game
  4. Play Again
  5. Exit
============================================
```

| Option | Description |
|:---:|---|
| **1** | View game rules & how binary logic works |
| **2** | Preview all 5 number cards on screen |
| **3** | Start a new game — think of a number! |
| **4** | Jump straight into another round |
| **5** | Exit the game |

---

## 🛡️ Features

- 🔢 **Binary Math Engine** — Reconstructs your number from Yes/No answers using bit-position addition
- 🧾 **Formatted Card Display** — Cards printed with aligned 30-char bordered grids
- ✅ **Input Validation** — Accepts `Y`, `y`, `Yes`, `yes`, `N`, `n`, `No`, `no` — re-prompts on invalid input
- 🕵️ **Cheat Detection** — If answers lead to a result outside `[1, 20]` (e.g., all No = 0), the game catches it and prompts a retry
- 🧪 **Automated Test Suite** — `GameTest` verifies all 5 card setups and confirms binary reconstruction for every number 1–20

---

## 🚀 How to Run

### ▶️ Windows — One Click
```bash
# Run the game
run.bat

# Run the tests
test.bat
```

### 💻 Manual — Any Platform
```bash
# Step 1 — Compile
javac Card.java Game.java SecretNumberGame.java

# Step 2 — Run
java SecretNumberGame
```

---

## 🧪 How to Run Tests

```bash
# Compile
javac Card.java Game.java GameTest.java

# Run
java GameTest
```

### Expected Test Output

```
============================================
       RUNNING GAME LOGIC TESTS
============================================

--- Testing Card Initialization ---
[PASS] Cards array should not be null
[PASS] Should initialize exactly 5 cards
[PASS] Card number should match 1-based index   (×5)
[PASS] Card binary value should be 1/2/4/8/16   (×5)
[PASS] Card numbers list should not be empty     (×5)

--- Testing Binary Number Reconstruction ---
[PASS] Reconstruction for number 1
[PASS] Reconstruction for number 2
...
[PASS] Reconstruction for number 20

============================================
  Tests Run:    25
  Tests Failed: 0
============================================
>>> SUCCESS: All tests passed successfully!
```

---

## 🧠 OOP Concepts Used

| Concept | Where Applied |
|---|---|
| **Encapsulation** | `private` fields + public getters in `Card` |
| **Classes & Objects** | `Card`, `Game`, `SecretNumberGame`, `GameTest` |
| **Constructors** | Parameterized constructors in `Card` and `Game` |
| **Object Interaction** | `Game` operates on an array of `Card` objects |
| **Separation of Concerns** | Entry point, logic, data, and tests in separate classes |
| **Input Handling** | Robust `Scanner`-based validation with looping re-prompts |

---

## 📋 Sample Gameplay

```
Welcome to the Secret Number Puzzle Game!

============================================
       SECRET NUMBER PUZZLE GAME
============================================
  Enter your choice: 3

Think of a secret number between 1 and 20.
(Don't tell me — I'll figure it out!)

+----------------------------+
|          CARD  1           |
+----------------------------+
|    1    3    5    7    9   |
|   11   13   15   17   19   |
+----------------------------+
Is your number present in Card 1? (Y/N): Y

...

*******************************************
*   Your Secret Number is:  13            *
*******************************************
```

---

<div align="center">

<!-- Animated footer -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f3460,50:16213e,100:1a1a2e&height=130&section=footer" width="100%"/>

*Built with ☕ Java — DSA Immersion 2026 | OOP Card Game Project*

</div>
