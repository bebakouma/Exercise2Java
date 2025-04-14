/*
 * Explanation Video: https://www.loom.com/share/35651ec56e0b49a3b39100b1322bd22c
 * Execution Video: https://www.loom.com/share/cd6ce70c000a456ea98539ec74987d33
 */

 import java.util.Scanner;

 public class Main {
 
     public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);
 
         // 1. Initialize variables:
         int userInput = 0;
         int lowerRange = 1;
         int upperRange = 10000;
 
         // 2. Generate random number between 1 and 10000:
         // Math.random() returns a double [0,1). Multiply by 10000, cast to int, then add 1.
         int randNum = (int)(Math.random() * 10000) + 1;
         //int randNum = 6000; // for test
 
         // 2. Loop until the guess is correct
         while (userInput != randNum) {
 
             // Prompt user
             System.out.print("Please enter a number between " 
                              + lowerRange + " and " + upperRange + ": ");
             
             if (!scnr.hasNextInt()) {
                 System.out.println("⚠ No more input. Exiting.");
                 break;
             }
 
             userInput = scnr.nextInt();
 
             // Check guess
             if (userInput < randNum) {
                 // Update lowerRange
                 if (userInput >= lowerRange) {
                     lowerRange = userInput;
                 }
                 System.out.println("Your guess is too low, try again.");
             } 
             else if (userInput > randNum) {
                 // Update upperRange
                 if (userInput <= upperRange) {
                     upperRange = userInput;
                 }
                 System.out.println("Your guess is too high, try again.");
             } 
             else {
                 // userInput == randNum
                 System.out.println("WINNER!!");
             }
         }
 
         scnr.close();
     }
 }
 