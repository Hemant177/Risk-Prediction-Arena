# Risk-Prediction-Arena
**RiskPredictionArena** is a Java console-based game where players face multiple risky logic challenges across different levels. Each level tests decision-making and problem-solving skills, and the final winner is saved to a file using Java OOP concepts and exception handling.
🚀 Features

🧠 Multi-level puzzle-based gameplay

🎲 Randomized challenges using utility methods

🧱 Clean Object-Oriented Architecture

⚠️ Custom Exception Handling for invalid inputs

🏆 Winner data stored using File Handling

🔁 Replayable game with unpredictable flow

🛠 Technologies Used
Technology	Purpose
Java (JDK 17+)	Core programming
OOP Concepts	Game design
File I/O	Store winners
Exception Handling	Validation
Collections	Data management
📂 Project Structure
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

🎮 How to Run
1️⃣ Clone the Repository
git clone https://github.com/your-username/RiskPredictionArena.git

2️⃣ Compile the Project
javac -d out src/com/riskpredictionarena/Main.java

3️⃣ Run the Game
java -cp out com.riskpredictionarena.Main

🧠 Game Flow

Player enters their name

Player passes through 5 risky floors

Each floor presents logic-based or random challenges

One wrong decision may end the game

On winning the final boss, the player name is saved in winner.txt

🏗 OOP Concepts Used
Concept	Implementation
Encapsulation	Private fields in Player class
Inheritance	All floors extend Floor class
Polymorphism	play() method overridden in each floor
Abstraction	Floor defined as abstract
Exception Handling	InvalidMoveException
📁 Sample Output (winner.txt)
Winner: Hemant
Winner: Anurag
Winner: Shravani

🔮 Future Enhancements

JavaFX GUI Version

Scoreboard System

Multiplayer Mode

Database Integration

👨‍💻 Author

Hemant Patil
Computer Engineering Graduate
Nashik, India
