# RiskPredictionArena – Java Console Game

RiskPredictionArena is a Java-based console game where players face a series of risky challenges across multiple levels. Each level tests the player's logic, decision-making, and risk prediction skills. The goal is to clear all floors and become the final winner.

---

## Features

- Multi-level gameplay with increasing difficulty  
- Randomized challenges using utility methods  
- Clean Object-Oriented architecture  
- Custom exception handling for wrong inputs  
- Winner details stored using file handling  
- Replayable and unpredictable game flow  

---

## Technologies Used

| Technology | Purpose |
|-----------|---------|
| Java (JDK 17+) | Core programming |
| OOP Concepts | Game design |
| File Handling | Store winners |
| Exception Handling | Input validation |
| Collections | Data management |

---

## Project Structure

```
RiskPredictionArena/
│
├── src/
│   └── com/
│       └── riskpredictionarena/
│           ├── Main.java
│           ├── Player.java
│           ├── GameEngine.java
│           ├── floors/
│           │   ├── Floor.java
│           │   ├── Floor1_RiskQuiz.java
│           │   ├── Floor2_NumberTrap.java
│           │   ├── Floor3_LogicMaze.java
│           │   ├── Floor4_RandomBattle.java
│           │   └── Floor5_FinalBoss.java
│           ├── exceptions/
│           │   └── InvalidMoveException.java
│           └── utils/
│               ├── Utils.java
│               └── FileHandler.java
│
└── winner.txt
```

---

## How to Run

### 1. Clone the repository
```bash
git clone https://github.com/Hemant177/Risk-Prediction-Arena.git
```

### 2. Compile the project
```bash
javac -d out src/com/riskpredictionarena/Main.java
```

### 3. Run the game
```bash
java -cp out com.riskpredictionarena.Main
```

---

## Game Flow

- Player enters name  
- Clears 5 risky floors  
- Each floor gives a unique challenge  
- Wrong answer may eliminate the player  
- Winner name is saved in `winner.txt`

---

## OOP Concepts Used

| Concept | Implementation |
|--------|---------------|
| Encapsulation | Private fields in Player class |
| Inheritance | All floors extend Floor class |
| Polymorphism | play() method overridden in each floor |
| Abstraction | Floor is abstract |
| Exception Handling | InvalidMoveException |

---

## Sample Output

```
Winner: Hemant
Winner: Anurag

```

---

## Author

Hemant Patil  
Computer Engineering Graduate  
Nashik, India  

---

## License

This project is open-source and free for educational purposes.
