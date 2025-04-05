# Exercise2 - Guessing Game in Java

This project implements a guessing game in Java. The program generates a random integer between 1 and 10,000 (inclusive) and prompts the user to guess the number. After each guess, the program tells the user if their guess is too low or too high and dynamically updates the valid guessing range. When the correct number is guessed, the program prints "WINNER!!" and ends.

## Files in the Project

- **src/Main.java**  
  Contains the source code for the guessing game.

- **test_input_example.txt**  
  A sample input file containing a sequence of guesses (one per line) for automated testing.

- **output_example.txt**  
  A file that stores the output when the test input is used.


## How to Compile and Run

```
javac Main.java
```

### Manual Execution

```
java Main
```

## Automated Testing (Using a Test Input File)

```
Get-Content .\test_input.txt | java -cp . Main > .\output_example.txt
```

## Exercise 2 Coding

Assessment Description
Refer to the “Creating a Project” document, located in the Class Resources and code the design from Exercise 2 Design documentation.
Make sure to following the program requirements:
This program is a "guessing game" program. The program will generate a random integer between 1 and 10000, inclusive. The program should prompt the user to enter a guess. For each guess, the program will output ‘HIGHER’ if the user's guess is lower than the target, ‘LOWER’ if the user's guess is higher than the target, or ‘WINNER’ if the user guesses the target. Each time the program prompts the user for a new guess, it should calculate and display the eligible range of values. 
Sample output:
Please enter a number between 1 and 10000: 5000
Your guess is too high, try again.
Please enter a number between 1 and 5000: 2500
Your guess is too high, try again.
Please enter a number between 1 and 2500: 1500
Your guess is too low, try again.
Please enter a number between 1500 and 2500: 2000
Your guess is too high, try again.
Please enter a number between 1500 and 2000: 1600
Your guess is too low, try again.
Note: Ensure that the prompt displays the current range of valid numbers.
Create a 3-5-minute video in which you explain your variable choices and any calculations in your programs. Execute (run) the program in your video. Address any challenges encountered and new information learned while completing the assignment. 
Use a screen recording tool, such as Loom to upload your completed video and ensure that your instructor can access and view your private, linked video prior to submitting it to the digital classroom.
Submit the following in the digital classroom as a single zip file, as directed by your instructor:
•    All your project code and test files
•    The link to your video
APA style is not required, but solid academic writing is expected.
This assignment uses a rubric. Please review the rubric prior to beginning the assignment to become familiar with the expectations for successful completion.
You are not required to submit this assignment to LopesWrite.
