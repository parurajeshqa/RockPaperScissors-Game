Rock Paper Scissors Game in Java
📌 Project Description

The Rock Paper Scissors Game is a simple, console-based Java application in which the user plays against the computer.

The user selects Rock, Paper, or Scissors, and the computer randomly generates its choice. The program compares both choices and determines whether the user wins, the computer wins, or the game ends in a tie.

This project is designed to practice fundamental Java programming concepts, including user input, random number generation, conditional statements, and logical operators.

✨ Features
Interactive console-based gameplay.
Allows the user to choose Rock, Paper, or Scissors.
Generates a random choice for the computer.
Determines the winner based on the game rules.
Identifies ties when both choices are the same.
Validates user choices and displays an error message for invalid input.
🛠️ Technologies Used
Programming Language: Java
User Input: Scanner class
Random Number Generation: Random class
Control Flow: if, else if, and else statements
Logical Operators: && and ||
📂 Project Structure
text
Rock-Paper-Scissors/
└── src/
    └── day4/
        └── RockPaperScissors.java

🎮 Game Rules

The user and the computer each select one of three options:

Choice	Number	Beats
Rock	0	Scissors
Paper	1	Rock
Scissors	2	Paper

The winner is determined by the following rules:

Rock beats Scissors.
Paper beats Rock.
Scissors beats Paper.
If both players choose the same option, the result is a tie.
🚀 How to Run the Program
Prerequisites
Java Development Kit (JDK) installed on your computer.
A Java-supported IDE, such as Eclipse, IntelliJ IDEA, or VS Code, or a terminal.
Steps
Clone or download the repository.
Open the project in your preferred Java IDE.
Navigate to RockPaperScissors.java inside the day4 package.
Run the RockPaperScissors class.
Enter your choice:
0 for Rock
1 for Paper
2 for Scissors
View the computer's choice and the game result.
Run Using the Terminal

From the directory containing the day4 folder, execute:

bash
javac day4/RockPaperScissors.java
java day4.RockPaperScissors

💻 Example Output
Example 1: User Wins
text
Welcome to the Rock Paper & Scissors Game
Enter you choice
0: Rock, 1: Paper, 2: Scissors
0
0
2
You win!


In this example, the user chooses Rock and the computer chooses Scissors, so the user wins.

Example 2: Tie
text
Welcome to the Rock Paper & Scissors Game
Enter you choice
0: Rock, 1: Paper, 2: Scissors
1
1
1
It's a tie!


Both the user and the computer choose Paper, resulting in a tie.

Example 3: Invalid Choice
text
Welcome to the Rock Paper & Scissors Game
Enter you choice
0: Rock, 1: Paper, 2: Scissors
5
Invalid Choice. Please play again and choose either 0, 1 or 2


The program displays an error message if the user enters a number outside the valid range of 0 to 2.

🎯 Learning Objectives

This project demonstrates the following Java programming concepts:

Using the Scanner class to accept user input.
Generating random numbers using Random.
Using conditional statements to determine the winner.
Applying logical operators to combine conditions.
Validating user input.
Comparing values using relational operators.
Using early returns to stop program execution when input is invalid.
Managing resources by closing the scanner.
🔮 Future Improvements
Allow the user to play multiple rounds without restarting the program.
Keep track of the user's wins, computer wins, and ties.
Display the names of the choices instead of their numeric values.
Improve input validation to handle non-numeric input.
Add a scoring system and declare an overall winner.
Create a graphical user interface (GUI).
👨‍💻 Author

Created as a beginner-level Java project to practice basic programming logic, random number generation, and conditional statements.

📄 License

This project is intended for educational and learning purposes.
